package Layout;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import myFrame.JFrameTools;

public class sample_GridBagLayout {

	private JFrame jframe;
	private JPanel panel;
	private GridBagLayout gbl_panel;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private GridBagConstraints gridBagConstraints;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;

	/**
	 * 格子包
	 */
	sample_GridBagLayout() {
		// JFrame
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(new Rectangle(0, 0, 400, 300));
		jframe.setTitle("Sample Grid Bag Layout ");
		JFrameTools.setCenter(jframe);
		jframe.getContentPane().setLayout(
				new BoxLayout(jframe.getContentPane(), BoxLayout.PAGE_AXIS));

		// panel & GridBagLayout
		panel = new JPanel();
		jframe.getContentPane().add(panel, BorderLayout.CENTER);
		gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 30, 30, 30, 30 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0 };
		panel.setLayout(gbl_panel);

		// button & GridBagConstraints
		button = new JButton("1");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		panel.add(button, gbc_button);

		button_1 = new JButton("2");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 0;
		panel.add(button_1, gbc_button_1);

		button_2 = new JButton("3");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 0;
		panel.add(button_2, gbc_button_2);

		gridBagConstraints = new GridBagConstraints();
		// 同時改變物件寬度與高度以填滿顯示區域之水平與垂直方向
		gridBagConstraints.fill = gridBagConstraints.BOTH;
		// 依加權比例分配物件間水平方向額外之區域
		gridBagConstraints.weightx = 1.0;

		button_3 = new JButton("4");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.gridwidth = 3;
		gbc_button_3.gridx = 0;
		gbc_button_3.gridy = 1;
		panel.add(button_3, gbc_button_3);

		button_4 = new JButton("5");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.gridwidth = 2;
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 2;
		panel.add(button_4, gbc_button_4);

		button_5 = new JButton("6");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.gridx = 2;
		gbc_button_5.gridy = 2;
		panel.add(button_5, gbc_button_5);

		button_6 = new JButton("7");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.gridheight = 6;
		gbc_button_6.gridx = 0;
		gbc_button_6.gridy = 3;
		panel.add(button_6, gbc_button_6);

		button_7 = new JButton("8");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.gridwidth = 2;
		gbc_button_7.gridx = 1;
		gbc_button_7.gridy = 3;
		panel.add(button_7, gbc_button_7);

		button_8 = new JButton("9");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.gridheight = 5;
		gbc_button_8.gridwidth = 2;
		gbc_button_8.gridx = 1;
		gbc_button_8.gridy = 4;
		panel.add(button_8, gbc_button_8);
	}
}
