package Chapter08.SwingEx;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class hansik extends JFrame {
    JPanel p, p1, p2;
    JButton randomButton, backButton;
    JTextField resultField;
    String[] bu = {"부대찌개", "부대통령", "명인부대찌개"};
    String[] s = {"국밥", "소문난순대", "국민돼지국밥", "황서옥"};
    String[] dark = {"닭갈비", "일미닭갈비", "왕가네닭갈비", "안녕, 닭"};
    String[] bibim = {"비빔밥", "육앤샤", "마루"};
    String[] noodle = {"국수", "고기국수", "동큐얼큰이칼국수"};
    String[] foods = {"부대통령", "명인부대찌개", "소문난순대", "국민돼지국밥", "황서옥",
            "일미닭갈비", "왕가네닭갈비", "안녕, 닭", "육앤샤", "마루", "황서옥",
            "고기국수", "동큐얼큰이칼국수"};

    public hansik() {
        setSize(700, 200);
        setTitle("한식");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        JComboBox bo = new JComboBox(bu);
        JComboBox soup = new JComboBox(s);
        JComboBox chicken = new JComboBox(dark);
        JComboBox bob = new JComboBox(bibim);
        JComboBox n = new JComboBox(noodle);

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

        p2.add(randomButton);
        p2.add(resultField);
        p2.add(backButton);

        p.add(bo);
        p.add(soup);
        p.add(chicken);
        p.add(bob);
        p.add(n);

        p.add(p2);
        add(p);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
