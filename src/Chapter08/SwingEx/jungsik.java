package Chapter08.SwingEx;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class jungsik extends JFrame {
    JPanel p, p1, p2;
    JButton b1, b2, b3, b4, b5, b6, backButton, randomButton;
    JTextField resultField;
    String[] foods = {"짜장1번가", "탕화쿵푸마라탕", "라니마라탕", "은소소", "수통골돌짜장"};

    public jungsik() {
        setSize(700, 200);
        setTitle("중식");
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

        b1 = new JButton("짜장1번가");
        b2 = new JButton("탕화쿵푸마라탕");
        b3 = new JButton("라니마라탕");
        b4 = new JButton("은소소");
        b5 = new JButton("수통골돌짜장");


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
    }
}
