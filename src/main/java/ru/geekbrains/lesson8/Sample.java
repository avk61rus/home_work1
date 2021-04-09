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
public class Sample {

    public static void main(String[] args) {
        new SampleWindow();
    }

    static class SampleWindow extends JFrame {
        private int count = 0;
        SampleWindow(){
            setSize(800, 600);                      //установка рзмеров окна;
            setVisible(true);                                   //включение видимости (отображения на экране);
            setDefaultCloseOperation(EXIT_ON_CLOSE);            //установка действия окна при нажатии на кнопку Х;
            setLocation(700, 400);                         //кординаты вернего левого угла окна;
            setTitle("Our Sample");                             //заголовок окна;
//            set

            JButton btn1 = new JButton("BUTTON1");          /* создание кнопок */
            JButton btn2 = new JButton("BUTTON2");          /* создание кнопок */
            JButton btn3 = new JButton("BUTTON3");          /* создание кнопок */
            JPanel panel = new JPanel();                        /* создание панели */
            panel.setLayout(new FlowLayout());                  //к панели добавляем менеджер компановки элементов слева на право;
            add(panel, BorderLayout.SOUTH);                     //включаем нижнюю панель;


//            panel.setLayout(new BoxLayout(panel, 1));
//            setLayout(new GridLayout(2, 2));
//            setLayout(new BoxLayout(this, 0));
//            btn1.setPreferredSize(new Dimension(0, 150));
//
            panel.add(btn2);                                    //добавляем на панель кнопки 1, 2, 3
            panel.add(btn3);
            panel.add(btn1);

            btn3.addActionListener(new ActionListener() {       //назначаем действие по нажатии на клавишу 3;
                @Override
                public void actionPerformed(ActionEvent e) {

                    count++;
                    btn3.setText(String.valueOf(count));
                }
            });

        }

    }
}
