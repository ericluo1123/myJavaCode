package Layout;

import java.awt.FlowLayout;
import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import myFrame.JFrameTools;

public class sample_FlowLayout {

	private JFrame jframe;
	private JButton btnOk;
	private JButton btnCancel;
	private JButton btnNo;
	private JButton btnYes;

	/**
	 * 流動
	 */
	sample_FlowLayout() {
		// JFrame
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(new Rectangle(0, 0, 250, 150));
		jframe.setTitle("Sample Flow Layout ");
		JFrameTools.setCenter(jframe);
		jframe.getContentPane().setLayout(
				new BoxLayout(jframe.getContentPane(), BoxLayout.PAGE_AXIS));

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));

		btnOk = new JButton("OK");
		panel.add(btnOk);

		btnCancel = new JButton("Cancel");
		panel.add(btnCancel);

		btnNo = new JButton("No");
		panel.add(btnNo);

		btnYes = new JButton("Yes");
		panel.add(btnYes);
		jframe.getContentPane().add(panel);
	}
}
