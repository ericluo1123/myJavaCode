package Layout;

import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import myFrame.JFrameTools;

public class sample_GridLayout {
	private JFrame jframe;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;

	/**
	 * 格子
	 */
	sample_GridLayout() {
		// JFrame
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(new Rectangle(0, 0, 200, 300));
		jframe.setTitle("Sample Grid Layout ");
		JFrameTools.setCenter(jframe);
		jframe.getContentPane().setLayout(
				new BoxLayout(jframe.getContentPane(), BoxLayout.PAGE_AXIS));

		JPanel panel = new JPanel();
		jframe.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		button = new JButton("1");
		panel.add(button);

		button_1 = new JButton("2");
		panel.add(button_1);

		button_2 = new JButton("3");
		panel.add(button_2);

		button_3 = new JButton("4");
		panel.add(button_3);

		button_4 = new JButton("5");
		panel.add(button_4);

		button_5 = new JButton("6");
		panel.add(button_5);

		button_6 = new JButton("7");
		panel.add(button_6);

		button_7 = new JButton("8");
		panel.add(button_7);

		button_8 = new JButton("9");
		panel.add(button_8);

		button_9 = new JButton("10");
		panel.add(button_9);

		button_10 = new JButton("11");
		panel.add(button_10);

		button_11 = new JButton("12");
		panel.add(button_11);
	}
}
