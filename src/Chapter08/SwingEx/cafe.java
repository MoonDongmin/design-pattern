package Chapter08.SwingEx;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class cafe extends JFrame {
    JPanel p, p1, p2, p3;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, randomButton, backButton;
    JTextField resultField;
    String[] foods = {"인딥", "빽다방", "컴포즈", "데일리", "템파카"
            , "아임일리터", "그린브라우니", "니치", "투썸"};

    public cafe() {
        setSize(600, 200);
        setTitle("카페");
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

        b1 = new JButton("인딥");
        b2 = new JButton("빽다방");
        b3 = new JButton("컴포즈");
        b4 = new JButton("데일리");
        b5 = new JButton("템파카");
        b6 = new JButton("아임일리터");
        b7 = new JButton("그린브라우니");
        b8 = new JButton("니치");
        b9 = new JButton("투썸");

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p3.add(b6);
        p3.add(b7);
        p3.add(b8);
        p3.add(b9);

        p2.add(randomButton);
        p2.add(resultField);
        p2.add(backButton);

        p.add(p1);
        p.add(p3);
        p.add(p2);
        add(p);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
