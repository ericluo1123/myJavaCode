package myFrame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Rectangle;

public class frm_Frame extends JFrame{

	private JFrame jframe;
	private Button btnShow;
	private Button btnClear;
	private Graphics g;

	// private JPanel jPanel;

	public frm_Frame() {
//		g = jframe.getContentPane().getGraphics();

		jframe = new JFrame();
		jframe.setBounds(new Rectangle(0, 0, 200, 150));
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);

	}

	class CGFrame extends JFrame {
		public void paint(Graphics g) {
			g.drawString("Hello Java !", 50, 50);
		}
	}
}
