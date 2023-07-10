package Chapter08.SwingEx;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomLunch extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, randomButton;
    JPanel p, p1, p2, p3;
    JLabel label1;
    JTextField resultField;
    String[] foods = {"레몬트리", "시크릿가든 드레스", "파스토보이", "이니파스타", "스테이킹", "부대통령",
            "명인부대찌개", "소문난순대", "국민돼지국밥", "황서옥", "일미닭갈비", "왕가네닭갈비", "안녕, 닭",
            "육앤샤", "마루", "고기국수", "동큐얼큰이칼국수", "봉스키친", "에바돈가츠", "코다이", "시스킴", "모모멘",
            "냉돈", "오오타동", "무모한초밥", "짜장1번가", "탕화쿵푸마라탕", "라니마라탕", "은소소", "수통골돌짜장"};
    String[] cafe = {"인딥", "빽다방", "컴포즈", "데일리", "템파카"
            , "아임일리터", "그린브라우니", "니치", "투썸"};


    public RandomLunch() {
        setSize(500, 200);
        setTitle("한밭대 점심 메뉴");
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        randomButton = new JButton("음식점 랜덤 뽑기");
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


        label1 = new JLabel("음식 종류를 고르시오.");
        b1 = new JButton("한식");
        b2 = new JButton("양식");
        b3 = new JButton("중식");
        b4 = new JButton("일식");
        b5 = new JButton("카페");

        b1.addActionListener(this);//이벤트메소드호출
        b2.addActionListener(this);//이벤트메소드호출
        b3.addActionListener(this);//이벤트메소드호출
        b4.addActionListener(this);//이벤트메소드호출
        b5.addActionListener(this);//이벤트메소드호출

        p1.add(label1);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p3.add(randomButton);
        p3.add(resultField);

        p.add(p1);
        p.add(p2);
        p.add(p3);

        add(p);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new RandomLunch();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            dispose();
            new hansik();
        } else if (e.getSource() == b2) {
            dispose();
            new yangsik();
        } else if (e.getSource() == b3) {
            dispose();
            new jungsik();
        } else if (e.getSource() == b4) {
            dispose();
            new ilsik();
        } else if (e.getSource() == b5) {
            dispose();
            new cafe();
        }
    }
}