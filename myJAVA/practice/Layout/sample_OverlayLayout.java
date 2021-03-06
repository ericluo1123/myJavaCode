package Layout;

import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.OverlayLayout;

import myFrame.JFrameTools;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.ComponentOrientation;

public class sample_OverlayLayout {

	private JFrame jframe;

	/**
	 * 覆蓋
	 */
	sample_OverlayLayout() {
		// JFrame
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(new Rectangle(0, 0, 200, 300));
		jframe.setTitle("Sample Overlay Layout ");
		JFrameTools.setCenter(jframe);
		jframe.getContentPane().setLayout(new BoxLayout(jframe.getContentPane(), BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		jframe.getContentPane().add(panel);
		OverlayLayout overlayLayout = new OverlayLayout(panel);
		panel.setLayout(overlayLayout);

		JButton button = new JButton("1");
		panel.add(button);
		// jframe.getContentPane().add(button, BorderLayout.NORTH);

		JButton btnNewButton = new JButton("2");
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.add(btnNewButton);
		// jframe.getContentPane().add(btnNewButton, BorderLayout.NORTH);
	}
}
