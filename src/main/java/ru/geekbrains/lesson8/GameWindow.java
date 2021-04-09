package ru.geekbrains.lesson8;

import javax.swing.*;
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
public class GameWindow extends JFrame {                                        //объявляется класс являющися расширением JFrame;

    private static final int WINDOW_WIDTH = 600;                                //ширина окна;
    private static final int WINDOW_HEIGHT = 640;                               //высота окна;
    private static final int WINDOW_POS_X = 640;                                //позиция по Х верхнего левого угла окна;
    private static final int WINDOW_POS_Y = 230;                                //позиция по Y верхнего левого угла окна;

    private ru.geekbrains.lesson8.GameMap map;                                                        // объявляется интерфейс map с именем GameMap;TODO

    GameWindow() {                                                              /* Поля метода GameWindow();-----------*/
        setDefaultCloseOperation(EXIT_ON_CLOSE);                                // действие по умолчанию- выйти и закыть;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);                                   // в метод определяющий размер окна передаются заданные размеры;
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);                                // в метод определяющий расположение окна передаются заданные координаты;
//        setLocationRelativeTo(null);                                          // выравнивание окна по центральной точке;
        setTitle("Tic Tac Toe");                                                     // назвние окна;
        setResizable(false);                                                            // отключение возможности изменения размеров окна;

        JButton btnStart = new JButton("<html><body><b>Start</b></body></html>");  // кнопка старт, надпись жирным текстом;
        JButton btnStop = new JButton("<html><body><b>EXIT</b></body></html>");    // кнопка выход, надпись жирным текстом;

        JPanel buttonPanel = new JPanel();                                           // создание панели для кнопок;
        buttonPanel.setLayout(new GridLayout(1, 2));                    // расположение кнопок в 1 строку и 2 колонки;
        buttonPanel.add(btnStart);                                             // добавление кнопки на панель кнопок;
        buttonPanel.add(btnStop);                                              // добавление кнопки на панель кнопок;

        map = new ru.geekbrains.lesson8.GameMap();                                            // создается экземпляр интерфейса мар с именем GameMap;
        ru.geekbrains.lesson8.SettingsWindow settings = new ru.geekbrains.lesson8.SettingsWindow(this); // данному интерфейсу назначаются размеры и координаты
                                                                        // заданные в настройка класса  SettingsWindow;

        btnStart.addActionListener(new ActionListener() {           // обработка события по нажатию кнопки старт;
            @Override
            public void actionPerformed(ActionEvent e) {            // открыватся игровое окно настройки;
                settings.setVisible(true);
            }
        });
        btnStop.addActionListener(new ActionListener() {            // обработка события по нажатию кнопки выход;
            @Override
            public void actionPerformed(ActionEvent e) {            // выход из программы;
                System.exit(0);
            }
        });
        add(map, BorderLayout.CENTER);                                      // вывод стартового окна
        add(buttonPanel, BorderLayout.SOUTH);                               // с панелью кнопов внизу
        setVisible(true);                                                   // с включенной видимостью;
    }

    public void startGame(int gameMode, int fieldSize, int winLength) {     //
        map.startNewGame(gameMode, fieldSize, winLength);
    }
}
