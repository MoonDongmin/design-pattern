package Chapter06.MacorCommand;
	
import java.awt.*;
import javax.swing.*;
	
public class SwingCommandExample {
	JFrame frame;
	JPanel panel;
	
	public static void main(String[] args) {
		SwingCommandExample example = new SwingCommandExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		panel = new JPanel();

		JButton onButton = new JButton("On");
		JButton offButton = new JButton("Off");
		
		JLabel light = new JLabel("light");
		light.setOpaque(true);
		light.setBackground(Color.LIGHT_GRAY);

		onButton.addActionListener(event -> 
			light.setBackground(Color.YELLOW)
		);
		offButton.addActionListener(event -> 
			light.setBackground(Color.LIGHT_GRAY)
		);
		// Set frame properties 
		frame.setContentPane(panel);
		panel.add(onButton);
		panel.add(light);
		panel.add(offButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
}
