package myJava.myMain;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class LookandFeelDemo {
	private JFrame jfrm;

	// Main method
	public static void main(String[] args) {

		try {
			// �]�wMetal Look and Feel
			UIManager
					.setLookAndFeel(new javax.swing.plaf.metal.MetalLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		new LookandFeelDemo();
	}

	// �غc�禡
	// ���ե�
	public LookandFeelDemo() {
		// jfrm = new JFrame();
		// jfrm.setTitle("Look and Feel Demo");
		// // super("Look and Feel Demo");
		//
		// // �����w�qJFrame��Layout Manager��FlowLayout
		// jfrm.setLayout(new FlowLayout());
		//
		// JButton jbutton1 = new JButton("OK");
		// JButton jbutton2 = new JButton("Cancel");
		// JButton jbutton3 = new JButton("Yes");
		// JButton jbutton4 = new JButton("No");
		//
		// // �����N����[��JFrame��
		// jfrm.add(jbutton1);
		// jfrm.add(jbutton2);
		// jfrm.add(jbutton3);
		// jfrm.add(jbutton4);
		//
		// // �]�w�������j�p
		// jfrm.setSize(250, 150);
		//
		// // Center the frame
		// Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// Dimension frameSize = jfrm.getSize();
		//
		// if (frameSize.height > screenSize.height)
		// frameSize.height = screenSize.height;
		//
		// if (frameSize.width > screenSize.width)
		// frameSize.width = screenSize.width;
		//
		// jfrm.setLocation((screenSize.width - frameSize.width) / 2,
		// (screenSize.height - frameSize.height) / 2);
		//
		// // ��ܵ���
		// jfrm.setVisible(true);
		//
		// jfrm.addWindowListener(new WindowAdapter() {
		// public void windowClosing(WindowEvent e) {
		// System.exit(0);
		// }
		// });
	}
}
