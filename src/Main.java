//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static CalculatorApp calculator = new CalculatorApp();

    public static void main(String[] args) {
        // Создаем главное окно
        JFrame frame = new JFrame("Calculator Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 2));

        // Поля ввода для x, y, z
        JTextField xField = new JTextField();
        JTextField yField = new JTextField();
        JTextField zField = new JTextField();

        // Поле для отображения результата
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);

        // Кнопки
        JButton calculateFormula1Button = new JButton("Вычислить Формулу №1");
        calculateFormula1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x = Double.parseDouble(xField.getText());
                    double y = Double.parseDouble(yField.getText());
                    double z = Double.parseDouble(zField.getText());
                    double result = calculator.calculateFormula1(x, y, z);
                    resultArea.setText("Результат Формулы №1: " + result);
                } catch (NumberFormatException ex) {
                    resultArea.setText("Ошибка: Введите корректные числа.");
                }
            }
        });
        JButton calculateFormula2Button = new JButton("Вычислить Формулу №2");
        calculateFormula2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x = Double.parseDouble(xField.getText());
                    double y = Double.parseDouble(yField.getText());
                    double z = Double.parseDouble(zField.getText());
                    double result = calculator.calculateFormula2(x, y, z);
                    resultArea.setText("Результат Формулы №2: " + result);
                } catch (NumberFormatException ex) {
                    resultArea.setText("Ошибка: Введите корректные числа.");
                }
            }
        });

        JButton addToSumButton = new JButton("M+");
        addToSumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double currentResult = Double.parseDouble(resultArea.getText().split(": ")[1]);
                    calculator.addToSum(currentResult);
                    resultArea.setText("Сумма накоплений: " + calculator.getSum());
                } catch (Exception ex) {
                    resultArea.setText("Ошибка: Невозможно добавить к сумме.");
                }
            }
        });

        JButton clearSumButton = new JButton("MC");
        clearSumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.clearSum();
                resultArea.setText("Сумма очищена. Текущая сумма: " + calculator.getSum());
            }
        });

        // Добавление компонентов в окно
        frame.add(new JLabel("Введите x:"));
        frame.add(xField);
        frame.add(new JLabel("Введите y:"));
        frame.add(yField);
        frame.add(new JLabel("Введите z:"));
        frame.add(zField);
        frame.add(calculateFormula1Button);
        frame.add(calculateFormula2Button);
        frame.add(addToSumButton);
        frame.add(clearSumButton);
        frame.add(new JLabel("Результат:"));
        frame.add(resultArea);

        frame.setVisible(true);
    }
}