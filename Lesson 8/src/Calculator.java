import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JFrame mainFrame;
    public Calculator() {
        mainFrame = new JFrame(); // Заточка под графику
        mainFrame.setTitle("Калькулятор"); // Название Tittle
        mainFrame.setBounds(70,70, 400,600); // Начальная точка и размеры окна
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Закрытие программы при закрытии окна

        mainFrame.setLayout(new BorderLayout());
        JPanel top = new JPanel(); // внутрення форма для панели ввода
        top.setLayout(new BorderLayout()); // Расстановка элементов,
        JPanel bottom = new JPanel(); // внутрення форма для кнопок
        bottom.setLayout(new GridLayout(4,4));

        mainFrame.add(top, BorderLayout.NORTH); // форма для панели ввода, север
        mainFrame.add(bottom, BorderLayout.CENTER); // кнопки, центр

        JTextField outField = new JTextField(); // создание поля для ввода
        outField.setEditable(false); // ограничить конфигурирование (нельзя написать)
        top.add(outField, BorderLayout.CENTER); // добавить на отрисовку

        DigitButtonListener abListener = new DigitButtonListener(outField); // Создание объекта для листенера
        for (int i = 7; i <= 9; i++) { // цикл для иницилизации кнопок
            JButton digitBtn = new JButton(String.valueOf(i)); // создание цифр
            bottom.add(digitBtn); // добавить на отрисовку
            digitBtn.addActionListener(abListener);
        }

        JButton divisionBtn = new JButton("/");
        divisionBtn.addActionListener(abListener);
        bottom.add(divisionBtn);

        for (int i = 4; i <= 6; i++) { // цикл для иницилизации кнопок
            JButton digitBtn = new JButton(String.valueOf(i)); // создание цифр
            bottom.add(digitBtn); // добавить на отрисовку
            digitBtn.addActionListener(abListener);
        }

        JButton multiplicationBtn = new JButton("*");
        multiplicationBtn.addActionListener(abListener);
        bottom.add(multiplicationBtn);

        for (int i = 1; i <= 3; i++) { // цикл для иницилизации кнопок
            JButton digitBtn = new JButton(String.valueOf(i)); // создание цифр
            bottom.add(digitBtn); // добавить на отрисовку
            digitBtn.addActionListener(abListener);
        }

        JButton minusBtn = new JButton("-");
        minusBtn.addActionListener(abListener);
        bottom.add(minusBtn);

        JButton cancelBtn = new JButton("C"); // создание кнопки С
        bottom.add(cancelBtn);
        cancelBtn.addActionListener(abListener);

        JButton zeroBtn = new JButton("0"); // создание кнопки 0
        zeroBtn.addActionListener(abListener);
        bottom.add(zeroBtn);// добавить на отрисовку

        JButton submitBtn = new JButton("="); // создание кнопки =
        bottom.add(submitBtn);
        submitBtn.addActionListener(abListener);

        JButton plusBtn = new JButton("+");
        plusBtn.addActionListener(abListener);
        bottom.add(plusBtn);

        mainFrame.setVisible(true); // отрисовка
    }
}