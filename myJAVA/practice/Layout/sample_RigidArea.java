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

public class sample_RigidArea {

	private JFrame jframe;
	private Component rigidArea;
	private JButton btnNewButton;
	private JButton btnButton;

	/**
	 * 固定區
	 */
	sample_RigidArea() {
		// JFrame
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(new Rectangle(0, 0, 250, 150));
		jframe.setTitle("Sample Rigid Area");
		JFrameTools.setCenter(jframe);
		jframe.getContentPane().setLayout(
				new BoxLayout(jframe.getContentPane(), BoxLayout.PAGE_AXIS));
		
		JPanel panel = new JPanel();
		jframe.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton = new JButton("button 1");
		panel.add(btnNewButton);
		
		rigidArea = Box.createRigidArea(new Dimension(40, 40));
		panel.add(rigidArea);
		
		btnButton = new JButton("button 2");
		panel.add(btnButton);
	}
}
