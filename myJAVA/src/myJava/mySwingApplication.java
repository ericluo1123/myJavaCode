package myJava;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;
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

import javax.swing.JColorChooser;
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
import java.util.Random;

import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.JToolBar;
import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.xml.bind.helpers.DefaultValidationEventHandler;

import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.Cursor;
import java.awt.Frame;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

public class mySwingApplication {

	private static final JMenuBar JMenuBar = null;
	private JFrame frame;
	private Dimension screenSize;
	private Dimension framSize;

	private Boolean isClassicWindows;
	private String osVersion;

	private JColorChooser chooser;

	private JButton button;
	private JButton button2;
	private JButton button3;
	private JButton button4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mySwingApplication window = new mySwingApplication();
					window.frame.setVisible(true);
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
		// checkWindowsVersion();
	}

	private void checkWindowsVersion() {
		// TODO Auto-generated method stub
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
		System.out.println(frame.getJMenuBar());

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
		initFrame();
		initButton();
	}

	private void initButton() {
		button4 = new JButton("NO");
		button3 = new JButton("YES");
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		// TODO Auto-generated method stub
		button = new JButton("OK");

		
		
		frame.getContentPane().add(button);
		button2 = new JButton("Cancel");
		frame.getContentPane().add(button2);
		frame.getContentPane().add(button3);
		frame.getContentPane().add(button4);
	}

	private void initFrame() {
		// TODO Auto-generated method stub

		// // 直接定義JFrame之Layout Manager為FlowLayout
		// frame.setLayout(new FlowLayout());
		/**
		 * JFrame實體化
		 */
		// JFrame實體化
		frame = new JFrame();
		frame.setVisible(true);
		frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

		/**
		 * Title operation
		 */
		// set title
		// frmMyapplication.setTitle("myApplication");
		frame.setTitle("Graphics Demo");
		// get title
		frame.getTitle();

		/**
		 * bounds(邊界)(x,y,width,height)
		 */
		// set bounds邊界()
		frame.setBounds(100, 100, 300, 400);
		// reshape 調整視窗大小
		// frmMyapplication.reshape(x, y, width, height);
		// set size
		// frmMyapplication.setSize(Dimension d);
		// frmMyapplication.setSize(width, height);

		/**
		 * IconImage 設定視窗使用的圖像
		 */
		// frmMyapplication.setIconImage(image);

		/**
		 * close button operation
		 * 
		 * WindowConstants.DISPOSE_ON_CLOSE 關閉視窗時，移除視窗並釋放佔用資源
		 * WindowConstants.DO_NOTHING_ON_CLOSE 關閉視窗時，不執行任何動作
		 * WindowConstants.EXIT_ON_CLOSE 關閉視窗時，移除視窗
		 * WindowConstants.HIDE_ON_CLOSE 關閉視窗時，隱藏視窗
		 */
		// set default close button operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// get default close button operation
		frame.getDefaultCloseOperation();

		/**
		 * 將視窗定位於螢幕中央
		 */
		// 取得螢幕大小
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// 取得視窗大小
		framSize = frame.getSize();

		// 比較螢幕與視窗的高度
		if (framSize.height > screenSize.height) {
			framSize.height = screenSize.height;
		}
		// 比較螢幕與視窗的寬度
		if (framSize.width > screenSize.width) {
			framSize.width = screenSize.width;
		}
		// 螢幕高度與寬度與視窗高度與寬度相減除以2
		frame.setLocation((screenSize.width - framSize.width) / 2,
				(screenSize.height - framSize.height) / 2);
		// 設定背景顏色
		frame.setBackground(Color.black);
		frame.setFocusTraversalPolicy(new FocusTraversalOnArray(
				new Component[] { frame.getContentPane() }));
		System.out.println(frame.getLayeredPane());
	}
}
