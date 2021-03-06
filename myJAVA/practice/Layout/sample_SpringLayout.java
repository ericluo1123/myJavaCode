package Layout;

import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import myFrame.JFrameTools;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Component;

public class sample_SpringLayout {

	private JFrame jframe;
	private JPanel panel;
	private JButton btnButton_1;

	sample_SpringLayout() {
		// JFrame
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(new Rectangle(0, 0, 350, 150));
		jframe.setTitle("Sample Spring Layout");
		JFrameTools.setCenter(jframe);
		jframe.getContentPane().setLayout(
				new BoxLayout(jframe.getContentPane(), BoxLayout.PAGE_AXIS));
		
		panel = new JPanel();
		jframe.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btnButton = new JButton("button1");
		sl_panel.putConstraint(SpringLayout.NORTH, btnButton, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnButton, 10, SpringLayout.WEST, panel);
		panel.add(btnButton);
		
		btnButton_1 = new JButton("button2");
		sl_panel.putConstraint(SpringLayout.NORTH, btnButton_1, 5, SpringLayout.SOUTH, btnButton);
		sl_panel.putConstraint(SpringLayout.WEST, btnButton_1, 69, SpringLayout.WEST, btnButton);
		panel.add(btnButton_1);
		
		JButton btnButton_2 = new JButton("button3");
		sl_panel.putConstraint(SpringLayout.NORTH, btnButton_2, 59, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnButton_2, -180, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnButton_2, 82, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnButton_2, -111, SpringLayout.EAST, panel);
		panel.add(btnButton_2);
	}
}
