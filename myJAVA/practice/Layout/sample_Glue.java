package Layout;

import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import myFrame.JFrameTools;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class sample_Glue {

	private JFrame jframe;
	private Component glue;
	private JButton btnButton;
	private JButton btnButton_1;

	sample_Glue() {
		// JFrame
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(new Rectangle(0, 0, 250, 150));
		jframe.setTitle("Sample Glue");
		JFrameTools.setCenter(jframe);
		jframe.getContentPane().setLayout(
				new BoxLayout(jframe.getContentPane(), BoxLayout.PAGE_AXIS));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(200, 200));
		jframe.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		btnButton = new JButton("button 1");
		panel.add(btnButton);
		
		glue = Box.createGlue();
		panel.add(glue);
		
		btnButton_1 = new JButton("button 2");
		panel.add(btnButton_1);
	}
}
