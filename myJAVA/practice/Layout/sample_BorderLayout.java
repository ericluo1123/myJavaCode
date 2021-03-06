package Layout;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import myFrame.JFrameTools;

public class sample_BorderLayout {

	private JFrame jframe;
	private JButton btnNorth;
	private JButton btnSouth;
	private JButton btnWest;
	private JButton btnEast;
	private JButton btnCenter;

	/**
	 * 邊境
	 */
	sample_BorderLayout() {
		// JFrame
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setBounds(new Rectangle(0, 0, 250, 150));
		jframe.setTitle("Sample Border Layout ");
		JFrameTools.setCenter(jframe);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.getContentPane().setLayout(
				new BoxLayout(jframe.getContentPane(), BoxLayout.PAGE_AXIS));

		JPanel panel = new JPanel();
		jframe.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		btnNorth = new JButton("North");
		panel.add(btnNorth, BorderLayout.NORTH);

		btnSouth = new JButton("South");
		panel.add(btnSouth, BorderLayout.SOUTH);

		btnWest = new JButton("West");
		panel.add(btnWest, BorderLayout.WEST);

		btnEast = new JButton("East");
		panel.add(btnEast, BorderLayout.EAST);

		btnCenter = new JButton("Center");
		panel.add(btnCenter, BorderLayout.CENTER);
	}

}
