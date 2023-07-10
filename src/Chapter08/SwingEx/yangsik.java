package Chapter08.SwingEx;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class yangsik extends JFrame {
    JPanel p, p1, p2;
    JButton b1, b2, b3, b4, b5, randomButton, backButton;
    JTextField resultField;
    String[] foods = {"레몬트리", "시크릿가든 드레스", "파스토보이", "이니파스타", "스테이킹"};

    public yangsik() {
        setSize(700, 200);
        setTitle("양식");
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();

        backButton = new JButton("뒤로가기");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new RandomLunch();
            }
        });

        randomButton = new JButton("뽑기");
        resultField = new JTextField(10);
        randomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int index = random.nextInt(foods.length);
                String selectedFood = foods[index];
                resultField.setText(selectedFood);
            }
        });

        b1 = new JButton("레몬트리");
        b2 = new JButton("시크릿가든 드레스");
        b3 = new JButton("파스토보이");
        b4 = new JButton("이니파스타");
        b5 = new JButton("스테이킹");

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);

        p2.add(randomButton);
        p2.add(resultField);
        p2.add(backButton);

        p.add(p1);
        p.add(p2);
        add(p);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
