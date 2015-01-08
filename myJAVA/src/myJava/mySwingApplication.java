package myJava;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;

import javax.swing.JComboBox;
import javax.swing.BoxLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import net.miginfocom.swing.MigLayout;

import javax.swing.JMenuBar;
import javax.swing.SpringLayout;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTree;

public class mySwingApplication {

	private static final JMenuBar JMenuBar = null;
	private JFrame frmMyapplication;
	private Dimension screenSize;
	private Dimension framSize;

	private Boolean isClassicWindows;
	private String osVersion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mySwingApplication window = new mySwingApplication();
					window.frmMyapplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mySwingApplication() {
		initialize();

		// check windows version

		osVersion = System.getProperty("os.version");
		System.out.println("os Version = " + osVersion);
		if (osVersion != null) {
			Float version = Float.valueOf(osVersion);
			if (version.floatValue() <= 4.0) {
				isClassicWindows = true;
			} else {
				isClassicWindows = false;
			}
		}
		System.out.println("is Classic Windows = " + isClassicWindows);

		System.out.println(WindowConstants.DO_NOTHING_ON_CLOSE);
		System.out.println(WindowConstants.HIDE_ON_CLOSE);
		System.out.println(frmMyapplication.getJMenuBar());

		// try {
		// UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		// } catch (ClassNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (InstantiationException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IllegalAccessException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (UnsupportedLookAndFeelException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmMyapplication = new JFrame();
		frmMyapplication.setTitle("myApplication");
		frmMyapplication.setBounds(100, 100, 300, 400);
		frmMyapplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyapplication.getContentPane().setLayout(null);

		// 取得螢幕大小
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// 取得視窗大小
		framSize = frmMyapplication.getSize();
		// 比較螢幕與視窗的高度
		if (framSize.height > screenSize.height) {
			framSize.height = screenSize.height;
		}
		// 比較螢幕與視窗的寬度
		if (framSize.width > screenSize.width) {
			framSize.width = screenSize.width;
		}

		// 將視窗定位於螢幕中央
		frmMyapplication.setLocation((screenSize.width - framSize.width) / 2,
				(screenSize.height - framSize.height) / 2);

	}

	// 於視窗上繪製字串
	public void paint(Graphics g) {
		g.drawString("Hello World Swing", 50, 50);
	}
}
