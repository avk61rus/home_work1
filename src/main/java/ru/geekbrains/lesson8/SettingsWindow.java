package ru.geekbrains.lesson8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Project java_core_1_0321
 *
 * @Author Alexander Grigorev
 * Created 03.04.2021
 * v1.0
 */
public class SettingsWindow extends JFrame {                        //объявляется класс окна настройки как фрейм;
    private static final int WINDOW_WIDTH = 350;                    //высота окна;
    private static final int WINDOW_HEIGHT = 300;                   //ширина окна;
    private static final int MIN_WIN_LENGTH = 3;                    //минимальное количесто фишек для победы;
    private static final int MIN_FIELD_SIZE = 3;                    //минимальное количесто ячеек игрового поля;
    private static final int MAX_FIELD_SIZE = 10;                   //максимальное количесто ячеек игрового поля;
    private static final String FIELD_SIZE_PREF = "Field size: ";   //поле с надписью над бегунком размера игрового поля;
    private static final String WIN_LENGTH_PREF = "Win length: ";   // поле с надписью над бегунком количества победных фишек;

    private GameWindow gameWindow;                      // TODO
    private JSlider sliderWinLength;                    // слайдер количества победных фишек;
    private JSlider sliderFieldSize;                    // слайдер размера игрового поля;
    private JRadioButton humanVsAI;                     // блок переключателей типа "radio" для выбора состава игроков
    private JRadioButton humanVsHuman;

    SettingsWindow(GameWindow gameWindow) {             // вызов окна настройки параметров игры;
        this.gameWindow = gameWindow;                   //
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);           // передача размеров окна;
        setLocationRelativeTo(gameWindow);              // отображение окна поверх и в границах окна gameWindow с переключением фокуса на новое окно;
        setResizable(false);                            // запрещается менять размер окна;
        setTitle("Create new Game");                      // заголовок окна настройки;
        setLayout(new GridLayout(10, 1));           // размещение элементов по сетке в 1 колонку и 10 строк;

        addGameMode();                                                  // вызов метода позволяющего управлять радио кнопками;
        addFieldSize();                                                 // вызов метода позволяющего управлять слайдерами;
        JButton buttonStartGame = new JButton("Start new game");    // создание кнопки Старт;
        buttonStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                // обработка события при нажатии кнопки Старт;
                saveSettings();                                         //
            }                                                           //
        });                                                             //
        add(buttonStartGame);
    }

    private void saveSettings() {                                       // метод сохранения настроек игры;
        int gameMode;                                                   //
        if (humanVsAI.isSelected()) {                                   // обработка события на радио кнопке
            gameMode = ru.geekbrains.lesson8.GameMap.MODE_VS_AI;                              // игры человека с компом;
        } else if (humanVsHuman.isSelected()) {                         // обработка события на радио кнопке
            gameMode = ru.geekbrains.lesson8.GameMap.MODE_VS_HUMAN;                           // игры человека c человеком;
        } else {
            throw new RuntimeException("INVALID GAME MODE!");
        }
        int fieldSize = sliderFieldSize.getValue();                     // установка размера поля согласно выбранному;
        int winLength = sliderWinLength.getValue();                     // установка количества победных фишек согласно выбранному;

        gameWindow.startGame(gameMode, fieldSize, winLength);           // запуск игры;

        setVisible(false);
    }

    private void addFieldSize() {                                                       // метод выводящий на экран слайдеры и надписи к ним;
        JLabel labelFieldSize = new JLabel(FIELD_SIZE_PREF + MIN_FIELD_SIZE);       // вывод надписи и значения размера игрового поля;
        JLabel labelWinLength = new JLabel(WIN_LENGTH_PREF + MIN_WIN_LENGTH);       // вывод надписи и количества победных фишек;

        sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);  // вывод слайдеров;
        sliderWinLength = new JSlider(MIN_WIN_LENGTH, MAX_FIELD_SIZE, MIN_FIELD_SIZE);

        sliderFieldSize.addChangeListener(new ChangeListener() {                         // обработка события по перемещению движка слайдера размера поля;
            @Override                                                                    //
            public void stateChanged(ChangeEvent e) {                                    //
                int currentValue = sliderFieldSize.getValue();                           //
                labelFieldSize.setText(FIELD_SIZE_PREF + currentValue);                  //
                sliderWinLength.setMaximum(currentValue);                                //
            }
        });

        sliderWinLength.addChangeListener(new ChangeListener() {                          // обработка события по перемещению
            @Override                                                                     //
            public void stateChanged(ChangeEvent e) {                                     //
                labelWinLength.setText(WIN_LENGTH_PREF + sliderWinLength.getValue());     //
            }
        });

        add(new JLabel("Choose field size:"));                          // выводит надпись и слайдер размера поля;
        add(labelFieldSize);                                                //
        add(sliderFieldSize);
        add(new JLabel("Choose win length:"));                          // выводит надпись и слайдер количества
        add(labelWinLength);                                                // победных фишек;
        add(sliderWinLength);
    }

    private void addGameMode() {                                           // метод, создающий элементы управления в окне настройки;
        add(new JLabel("Choose game mode:"));                          // текстовая метка;
        humanVsAI = new JRadioButton("Human versus AI", true);  // радио кнопка;
        humanVsHuman = new JRadioButton("Human versus human");         // радио кнопка;
        ButtonGroup gameMode = new ButtonGroup();                          // группировка радио кнопок;
        gameMode.add(humanVsAI);                                           // добавляет радио кнопку в группировку кнопок;
        gameMode.add(humanVsHuman);                                        // добавляет радио кнопку в группировку кнопок;
        add(humanVsAI);                                                    // выводит радио кнопку на экран;
        add(humanVsHuman);                                                 // выводит радио кнопку на экран;
    }
}
