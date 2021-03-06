package Layout;

import java.awt.Rectangle;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

import myFrame.JFrameTools;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class sample_BoxLayout {

	private JFrame jframe;
	private JPanel panel;
	private BoxLayout boxLayout;
	private JButton btnYaxis;
	private JButton btnYaxis_1;
	private JButton btnYaxis_2;
	private JButton btnXaxis;
	private JButton btnXaxis_1;
	private JButton btnXaxis_2;

	/**
	 * 盒
	 */
	sample_BoxLayout() {
		// JFrame
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setBounds(new Rectangle(0, 0, 250, 150));
		jframe.setTitle("Sample Border Layout ");
		JFrameTools.setCenter(jframe);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		panel = new JPanel();
		jframe.getContentPane().add(panel);
		boxLayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		panel.setLayout(boxLayout);

		btnXaxis = new JButton("X_AXIS 1");
		panel.add(btnXaxis);
	
		btnXaxis_1 = new JButton("X_AXIS 2");
		panel.add(btnXaxis_1);

		btnXaxis_2 = new JButton("X_AXIS 3");
		panel.add(btnXaxis_2);

		JPanel panel_1 = new JPanel();
		jframe.getContentPane().add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		btnYaxis = new JButton("Y_AXIS 1");
		btnYaxis.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(btnYaxis);

		btnYaxis_1 = new JButton("Y_AXIS 2");
		btnYaxis_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(btnYaxis_1);

		btnYaxis_2 = new JButton("Y_AXIS 3");
		btnYaxis_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(btnYaxis_2);

	}
}
