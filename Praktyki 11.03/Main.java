package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {


    public static void main(String[] args) {
        JFrame window = new JFrame("Zamiana temperatury");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 200);
        window.setLocationRelativeTo(null);
        window.setLayout(null);

        JLabel cel = new JLabel("Celcjusze");
        cel.setBounds(240, 20, 100, 30);
        window.add(cel);

        JLabel wyn = new JLabel("Tutaj pojawi się wynik po przeliczeniu C na F");
        wyn.setBounds(50, 110, 400, 30);
        window.add(wyn);

        JTextField stopnie = new JTextField();
        stopnie.setBounds(135, 20, 100, 25);
        window.add(stopnie);

        JButton button = new JButton("Przelicz na F");
        button.setBounds(120, 75, 125, 30);
        window.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String liczba = stopnie.getText();
                Integer.parseInt(liczba);
                double wynik = (Integer.parseInt(liczba) * 1.8 + 32);
                wyn.setText(liczba + " stopni w Cejcjuszach to  " + wynik + " stopni w Fahrenheita");

            }
        }
        );
        window.setVisible(true);
    }
}
