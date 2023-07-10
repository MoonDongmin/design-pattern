package Chapter08.SwingEx;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ilsik extends JFrame {
    JPanel p, p1, p2, p3;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, randomButton, backButton;
    JTextField resultField;
    String[] foods = {"봉스키친", "에바돈가츠", "쿄다이", "스시킴"
            , "모모멘", "냉돈", "오오타동", "무모한초밥"};

    public ilsik() {
        setSize(600, 200);
        setTitle("일식");
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

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

        b1 = new JButton("봉스키친");
        b2 = new JButton("에바돈가츠");
        b3 = new JButton("쿄다이");
        b4 = new JButton("스시킴");
        b5 = new JButton("모모멘");
        b6 = new JButton("냉돈");
        b7 = new JButton("오오타동");
        b8 = new JButton("무모한초밥");

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);

        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);

        p3.add(randomButton);
        p3.add(resultField);
        p3.add(backButton);

        p.add(p1);
        p.add(p2);
        p.add(p3);

        add(p);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
