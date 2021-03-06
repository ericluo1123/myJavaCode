package Layout;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import myFrame.JFrameTools;

import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.Box.Filler;
import javax.swing.JButton;

public class sample_Filler {

	private JFrame jframe;
	private Filler filler;

	sample_Filler() {
		// JFrame
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(new Rectangle(0, 0, 250, 150));
		jframe.setTitle("Sample Filler");
		JFrameTools.setCenter(jframe);
		jframe.getContentPane().setLayout(
				new BoxLayout(jframe.getContentPane(), BoxLayout.PAGE_AXIS));

		JPanel panel = new JPanel();
		jframe.getContentPane().add(panel);

		Dimension min = new Dimension(10, 50);
		Dimension pref = new Dimension(50, 50);
		Dimension max = new Dimension(100, 100);

		JButton btnButton = new JButton("button 1");
		panel.add(btnButton);

		filler = new Box.Filler(min, pref, max);
		panel.add(filler);

		JButton btnButton_1 = new JButton("button 2");
		panel.add(btnButton_1);

	}
}
