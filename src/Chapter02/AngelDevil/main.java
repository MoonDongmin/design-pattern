package Chapter02.AngelDevil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {
    public main(){
        super("Button");
        JButton bt = new JButton("할까 말까?");
        JFrame main = new JFrame();
        main.add(bt);
        main.setSize(300,300);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DevilListener();
                AngelListener();
            }
        });
    }
    public void AngelListener(){
        System.out.println("하지마! 아마 후회할 걸?");
    }
    public void DevilListener(){
        System.out.println("그냥 저질러 버렷!!!");
    }

    public static void main(String[] args) {
        new main();
    }
}
