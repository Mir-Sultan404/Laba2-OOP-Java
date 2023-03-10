package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton button;
    private JLabel label;

    public Main() {
        super("Пример графического интерфейса");

        setLayout(new FlowLayout());

        textField = new JTextField(20);
        add(textField);

        button = new JButton("Нажми меня!");
        add(button);

        label = new JLabel("");
        add(label);

        button.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == button) {
            String inputString = textField.getText();

            int length = inputString.length();
            int middle = length / 2 - 1;

            String rightHalf = inputString.substring(middle);
            String modifiedString = "";

            for (int i = 0; i < rightHalf.length(); i++) {
                if ((i + 1) % 3 != 0) {
                    modifiedString += rightHalf.charAt(i);
                }
            }

            label.setText(modifiedString);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}