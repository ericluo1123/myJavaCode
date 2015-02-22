package window;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPanel;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import javax.swing.plaf.metal.MetalTheme;

import java.awt.FlowLayout;
import javax.swing.JToolBar;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.DebugGraphics;
import java.awt.Frame;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.JLayeredPane;

public class window {

	JRadioButtonMenuItem[] jrbmenuitem = new JRadioButtonMenuItem[7];

	String[] item = { "Metal", "CDE/Motif", "Windows XP", "Windows Classic",
			"Nimbus", "GTK+", "Mac" };

	String[] item2 = { "Frame", "Plain Dialog", "File Chooser Dialog",
			"Color Chooser Dialog", "Information Dialog", "Question Dialog",
			"Error Dialog", "Warning Dialog", "None" };

	String[] classname = { "javax.swing.plaf.metal.MetalLookAndFeel",
			"com.sun.java.swing.plaf.motif.MotifLookAndFeel",
			"com.sun.java.swing.plaf.windows.WindowsLookAndFeel",
			"com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel",
			"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel",
			"com.sun.java.swing.plaf.gtk.GTKLookAndFeel",
			"com.sun.java.swing.plaf.mac.MacLookAndFeel" };

	String LookAndFeel_Select = item[2];

	private JFrame jfrm;
	private JButton btnWEST;
	private JButton btnEAST;
	private JButton btnSOUTH;
	private JButton btnNORTH;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmExit;
	private JMenu mnLF;
	private ButtonGroup btnGroup;
	private JMenu mnDecoration;

	ClassLoader cl;
	private JMenu mnHelp;
	private JMenuItem mntmOpen;
	private JRadioButtonMenuItem rdbtnmntmFrame;
	private JRadioButtonMenuItem rdbtnmntmPlainDialog;
	private JRadioButtonMenuItem rdbtnmntmFilechooserdialog;
	private JRadioButtonMenuItem rdbtnmntmColorChooserDialog;
	private JRadioButtonMenuItem rdbtnmntmInformationDialog;
	private JRadioButtonMenuItem rdbtnmntmQuestionDialog;
	private JRadioButtonMenuItem rdbtnmntmErrorDialog;
	private JRadioButtonMenuItem rdbtnmntmWarningDialog;
	private JRadioButtonMenuItem rdbtnmntmNone;
	private JMenuItem mntmAbout;
	private JRadioButtonMenuItem rdbtnmntmMetal;
	private JRadioButtonMenuItem rdbtnmntmCdemotif;
	private JRadioButtonMenuItem rdbtnmntmWindowsXp;
	private JRadioButtonMenuItem rdbtnmntmWindowsClassic;
	private JRadioButtonMenuItem rdbtnmntmNimbus;
	private JRadioButtonMenuItem rdbtnmntmGtk;
	private JRadioButtonMenuItem rdbtnmntmMac;
	private final ButtonGroup buttonGroup_mnLF = new ButtonGroup();
	private final ButtonGroup buttonGroup_mnDecoration = new ButtonGroup();
	private JMenu mnTheme;
	private JRadioButtonMenuItem rdbtnmntmOcean;
	private JRadioButtonMenuItem rdbtnmntmSteel;
	private final ButtonGroup buttonGroup_mnTheme = new ButtonGroup();
	private JRadioButtonMenuItem rdbtnmntmAqua;
	private JRadioButtonMenuItem rdbtnmntmGreen;
	private JRadioButtonMenuItem rdbtnmntmRuby;
	private JRadioButtonMenuItem rdbtnmntmSandstone;
	private JRadioButtonMenuItem rdbtnmntmContrast;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;

	private GridLayout gridLayout;

	public window() {

		/**
		 * Look and Feel
		 */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		JDialog.setDefaultLookAndFeelDecorated(true);
		JFrame.setDefaultLookAndFeelDecorated(true);
		Toolkit.getDefaultToolkit().setDynamicLayout(true);

		try {

			if (LookAndFeel_Select.equals(item[0])) {
				// 設定Metal Look and Feel
				UIManager
						.setLookAndFeel(new javax.swing.plaf.metal.MetalLookAndFeel());
			} else if (LookAndFeel_Select.equals(item[1])) {
				// 設定CDE/Motif Look and Feel
				UIManager
						.setLookAndFeel(new com.sun.java.swing.plaf.motif.MotifLookAndFeel());
			} else if (LookAndFeel_Select.equals(item[2])) {
				// 設定Windows XP Look and Feel
				UIManager
						.setLookAndFeel(new com.sun.java.swing.plaf.windows.WindowsLookAndFeel());
			} else if (LookAndFeel_Select.equals(item[3])) {
				// 設定Nimbus Look and Feel
				UIManager
						.setLookAndFeel(new com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel());
			} else if (LookAndFeel_Select == null) {
				// 設定與作業系統有關之Look and Feel
				UIManager.setLookAndFeel(UIManager
						.getSystemLookAndFeelClassName());
			}
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
		/**
		 * JFrame
		 */
		// 建立選單列
		jfrm = new JFrame();
		jfrm.setBounds(new Rectangle(0, 0, 250, 250));
		// 取得目前之Class Loader
		cl = jfrm.getClass().getClassLoader();
		if (LookAndFeel_Select.equals(item[0])) {
			// frame Undecorated
			jfrm.setUndecorated(true);
		}

		jfrm.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		jfrm.setTitle("Decoration: FRAME");
		// 設定視窗圖示
		// jfrm.setIconImage(new ImageIcon(cl
		// .getResource("images/java.png")).getImage());

		jfrm.setFocusTraversalKeysEnabled(false);
		// 取得螢幕大小
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// 取得視窗大小
		Dimension frameSize = jfrm.getSize();

		// 比較螢幕與視窗的高度
		if (frameSize.height > screenSize.height)
			frameSize.height = screenSize.height;

		// 比較螢幕與視窗的寬度
		if (frameSize.width > screenSize.width)
			frameSize.width = screenSize.width;

		// 將視窗定位於螢幕中央
		jfrm.setLocation((screenSize.width - frameSize.width) / 2,
				(screenSize.height - frameSize.height) / 2);
		jfrm.setVisible(true);
		jfrm.getContentPane().setLayout(null);
		jfrm.getContentPane().setLayout(
				new BoxLayout(jfrm.getContentPane(), BoxLayout.PAGE_AXIS));

		panel = new JPanel();
		// GridLayout(rows, column , hgap, vgap);
		gridLayout = new GridLayout(4, 3, 0, 0);
		panel.setLayout(gridLayout);

		btnWEST = new JButton("(0,1)");
		btnWEST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSOUTH.setEnabled(true);
			}
		});

		btnSOUTH = new JButton("(0,0)");
		btnSOUTH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSOUTH.setEnabled(false);
			}
		});
		panel.add(btnSOUTH);
		panel.add(btnWEST);
		jfrm.getContentPane().add(panel);

		btnEAST = new JButton("(0,2)");
		panel.add(btnEAST);
		btnEAST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		btnNORTH = new JButton("(1,0)");
		btnNORTH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		panel.add(btnNORTH);

		btnNewButton = new JButton("(1,1)");
		panel.add(btnNewButton);

		btnNewButton_1 = new JButton("(1,2)");
		panel.add(btnNewButton_1);

		btnNewButton_2 = new JButton("(2,0)");
		panel.add(btnNewButton_2);

		btnNewButton_3 = new JButton("(2,1)");
		panel.add(btnNewButton_3);

		btnNewButton_4 = new JButton("(2,2)");
		panel.add(btnNewButton_4);

		btnNewButton_5 = new JButton("(3,0)");
		panel.add(btnNewButton_5);

		btnNewButton_6 = new JButton("(3,1)");
		panel.add(btnNewButton_6);

		btnNewButton_7 = new JButton("(3,2)");
		panel.add(btnNewButton_7);

		/**
		 * JMenuBar
		 */
		menuBar = new JMenuBar();
		jfrm.setJMenuBar(menuBar);

		/**
		 * JMenu
		 */
		mnFile = new JMenu("File");
		menuBar.add(mnFile);

		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mntmExit();
			}
		});

		mntmOpen = new JMenuItem("Open");
		mntmOpen.setMnemonic('O');
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
				KeyEvent.CTRL_MASK));
		mntmOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mntmOpen();
			}
		});
		mnFile.add(mntmOpen);
		mnFile.add(mntmExit);

		mnLF = new JMenu("L & F");
		menuBar.add(mnLF);

		rdbtnmntmMetal = new JRadioButtonMenuItem("Metal");
		rdbtnmntmMetal.setEnabled(isLookAndFeelSupported(classname[0]));
		buttonGroup_mnLF.add(rdbtnmntmMetal);
		rdbtnmntmMetal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jrbmenuitem_updateComponentTreeUI(e);
			}
		});
		if ((LookAndFeel_Select.equals(item[0]))) {
			rdbtnmntmMetal.setSelected(true);
		}
		mnLF.add(rdbtnmntmMetal);

		rdbtnmntmCdemotif = new JRadioButtonMenuItem("CDE/Motif");
		rdbtnmntmCdemotif.setEnabled(isLookAndFeelSupported(classname[1]));
		buttonGroup_mnLF.add(rdbtnmntmCdemotif);
		rdbtnmntmCdemotif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jrbmenuitem_updateComponentTreeUI(e);
			}
		});
		if ((LookAndFeel_Select.equals(item[1]))) {
			rdbtnmntmCdemotif.setSelected(true);
		}
		mnLF.add(rdbtnmntmCdemotif);

		rdbtnmntmWindowsXp = new JRadioButtonMenuItem("Windows XP");
		rdbtnmntmWindowsXp.setEnabled(isLookAndFeelSupported(classname[2]));
		buttonGroup_mnLF.add(rdbtnmntmWindowsXp);
		rdbtnmntmWindowsXp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jrbmenuitem_updateComponentTreeUI(e);
			}
		});
		if ((LookAndFeel_Select.equals(item[2]))) {
			rdbtnmntmWindowsXp.setSelected(true);
		}
		mnLF.add(rdbtnmntmWindowsXp);

		rdbtnmntmWindowsClassic = new JRadioButtonMenuItem("Windows Classic");
		rdbtnmntmWindowsClassic
				.setEnabled(isLookAndFeelSupported(classname[3]));
		buttonGroup_mnLF.add(rdbtnmntmWindowsClassic);
		rdbtnmntmWindowsClassic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jrbmenuitem_updateComponentTreeUI(e);
			}
		});
		if ((LookAndFeel_Select.equals(item[3]))) {
			rdbtnmntmWindowsClassic.setSelected(true);
		}
		mnLF.add(rdbtnmntmWindowsClassic);

		rdbtnmntmNimbus = new JRadioButtonMenuItem("Nimbus");
		rdbtnmntmNimbus.setEnabled(isLookAndFeelSupported(classname[4]));
		buttonGroup_mnLF.add(rdbtnmntmNimbus);
		rdbtnmntmNimbus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jrbmenuitem_updateComponentTreeUI(e);
			}
		});
		mnLF.add(rdbtnmntmNimbus);

		rdbtnmntmGtk = new JRadioButtonMenuItem("GTK+");
		rdbtnmntmGtk.setEnabled(isLookAndFeelSupported(classname[5]));
		buttonGroup_mnLF.add(rdbtnmntmGtk);
		rdbtnmntmGtk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jrbmenuitem_updateComponentTreeUI(e);
			}
		});
		mnLF.add(rdbtnmntmGtk);

		rdbtnmntmMac = new JRadioButtonMenuItem("Mac");
		rdbtnmntmMac.setEnabled(isLookAndFeelSupported(classname[6]));
		buttonGroup_mnLF.add(rdbtnmntmMac);
		rdbtnmntmMac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jrbmenuitem_updateComponentTreeUI(e);
			}
		});
		mnLF.add(rdbtnmntmMac);

		/**
		 * JMenu Decoration
		 */
		mnDecoration = new JMenu("Decoration");
		menuBar.add(mnDecoration);

		rdbtnmntmFrame = new JRadioButtonMenuItem("Frame");
		buttonGroup_mnDecoration.add(rdbtnmntmFrame);
		rdbtnmntmFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWindowDecorationStyle(1);
			}
		});
		rdbtnmntmFrame.setSelected(true);
		mnDecoration.add(rdbtnmntmFrame);

		rdbtnmntmPlainDialog = new JRadioButtonMenuItem("Plain Dialog");
		buttonGroup_mnDecoration.add(rdbtnmntmPlainDialog);
		rdbtnmntmPlainDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWindowDecorationStyle(2);
			}
		});
		mnDecoration.add(rdbtnmntmPlainDialog);

		rdbtnmntmFilechooserdialog = new JRadioButtonMenuItem(
				"FileChooserDialog");
		buttonGroup_mnDecoration.add(rdbtnmntmFilechooserdialog);
		rdbtnmntmFilechooserdialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWindowDecorationStyle(3);
			}
		});
		mnDecoration.add(rdbtnmntmFilechooserdialog);

		rdbtnmntmColorChooserDialog = new JRadioButtonMenuItem(
				"Color Chooser Dialog");
		buttonGroup_mnDecoration.add(rdbtnmntmColorChooserDialog);
		rdbtnmntmColorChooserDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWindowDecorationStyle(4);
			}
		});
		mnDecoration.add(rdbtnmntmColorChooserDialog);

		rdbtnmntmInformationDialog = new JRadioButtonMenuItem(
				"Information Dialog");
		buttonGroup_mnDecoration.add(rdbtnmntmInformationDialog);
		rdbtnmntmInformationDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWindowDecorationStyle(5);
			}
		});
		mnDecoration.add(rdbtnmntmInformationDialog);

		rdbtnmntmQuestionDialog = new JRadioButtonMenuItem("Question Dialog");
		buttonGroup_mnDecoration.add(rdbtnmntmQuestionDialog);
		rdbtnmntmQuestionDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWindowDecorationStyle(6);
			}
		});
		mnDecoration.add(rdbtnmntmQuestionDialog);

		rdbtnmntmErrorDialog = new JRadioButtonMenuItem("Error Dialog");
		buttonGroup_mnDecoration.add(rdbtnmntmErrorDialog);
		rdbtnmntmErrorDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWindowDecorationStyle(7);
			}
		});
		mnDecoration.add(rdbtnmntmErrorDialog);

		rdbtnmntmWarningDialog = new JRadioButtonMenuItem("Warning Dialog");
		buttonGroup_mnDecoration.add(rdbtnmntmWarningDialog);
		rdbtnmntmWarningDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWindowDecorationStyle(8);
			}
		});
		mnDecoration.add(rdbtnmntmWarningDialog);

		rdbtnmntmNone = new JRadioButtonMenuItem("None");
		buttonGroup_mnDecoration.add(rdbtnmntmNone);
		rdbtnmntmNone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWindowDecorationStyle(9);
			}
		});
		mnDecoration.add(rdbtnmntmNone);

		// 將Metal Look and Feel中的字形由粗體改為標準字型
		mnTheme = new JMenu("Theme");
		menuBar.add(mnTheme);

		rdbtnmntmOcean = new JRadioButtonMenuItem("Ocean");
		rdbtnmntmOcean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnmntmOcean(e, 1);
			}
		});
		rdbtnmntmOcean.setSelected(true);
		buttonGroup_mnTheme.add(rdbtnmntmOcean);
		mnTheme.add(rdbtnmntmOcean);

		rdbtnmntmSteel = new JRadioButtonMenuItem("Steel");
		rdbtnmntmSteel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnmntmOcean(e, 2);
			}
		});
		buttonGroup_mnTheme.add(rdbtnmntmSteel);
		mnTheme.add(rdbtnmntmSteel);

		rdbtnmntmAqua = new JRadioButtonMenuItem("Aqua");
		rdbtnmntmAqua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnmntmOcean(e, 3);
			}
		});
		buttonGroup_mnTheme.add(rdbtnmntmAqua);
		mnTheme.add(rdbtnmntmAqua);

		rdbtnmntmGreen = new JRadioButtonMenuItem("Green");
		rdbtnmntmGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnmntmOcean(e, 4);
			}
		});
		buttonGroup_mnTheme.add(rdbtnmntmGreen);
		mnTheme.add(rdbtnmntmGreen);

		rdbtnmntmRuby = new JRadioButtonMenuItem("Ruby");
		rdbtnmntmRuby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnmntmOcean(e, 5);
			}
		});
		buttonGroup_mnTheme.add(rdbtnmntmRuby);
		mnTheme.add(rdbtnmntmRuby);

		rdbtnmntmSandstone = new JRadioButtonMenuItem("Sandstone");
		rdbtnmntmSandstone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnmntmOcean(e, 6);
			}
		});
		buttonGroup_mnTheme.add(rdbtnmntmSandstone);
		mnTheme.add(rdbtnmntmSandstone);

		rdbtnmntmContrast = new JRadioButtonMenuItem("Contrast");
		rdbtnmntmContrast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnmntmOcean(e, 7);
			}
		});
		buttonGroup_mnTheme.add(rdbtnmntmContrast);
		mnTheme.add(rdbtnmntmContrast);

		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmAbout();
			}
		});
		mntmAbout.setMnemonic('A');
		mntmAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
				KeyEvent.CTRL_MASK));
		mnHelp.add(mntmAbout);

		// create_mnLF_item();

		// 執行階段變更Look and Feel
		SwingUtilities.updateComponentTreeUI(jfrm);
	}

	protected void rdbtnmntmOcean(ActionEvent e, int select) {
		// TODO Auto-generated method stub
		if (select == 1) {
			// 設定為Metal Look & Feel之Ocean主題
			MetalLookAndFeel.setCurrentTheme(new OceanTheme());
		} else if (select == 2) {
			// 設定為Metal Look & Feel之Steel主題
			MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
		} else if (select == 3) {
			// MetalLookAndFeel.setCurrentTheme(new AquaTheme());
		} else if (select == 4) {
			// MetalLookAndFeel.setCurrentTheme(new GreenTheme());
		} else if (select == 5) {
			// MetalLookAndFeel.setCurrentTheme(new RubyTheme());
		} else if (select == 6) {
			// MetalLookAndFeel.setCurrentTheme(new SandstoneTheme());
		} else if (select == 7) {
			// MetalLookAndFeel.setCurrentTheme(new ContrastTheme());
		}

		jfrm.setTitle("Theme: " + e.getActionCommand().toString());

		try {
			UIManager.setLookAndFeel(new MetalLookAndFeel());
			SwingUtilities.updateComponentTreeUI(jfrm);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void mntmAbout() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Window Decoration Style", "About",
				JOptionPane.INFORMATION_MESSAGE);
	}

	protected void setWindowDecorationStyle(int select) {
		// TODO Auto-generated method stub
		try {
			switch (select) {
			case 1:
				jfrm.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
				jfrm.setTitle("Decoration: FRAME");
				break;
			case 2:
				jfrm.getRootPane().setWindowDecorationStyle(
						JRootPane.PLAIN_DIALOG);
				jfrm.setTitle("Decoration: PLAIN_DIALOG");
				break;
			case 3:
				jfrm.getRootPane().setWindowDecorationStyle(
						JRootPane.FILE_CHOOSER_DIALOG);
				jfrm.setTitle("Decoration: FILE_CHOOSER_DIALOG");
				break;
			case 4:
				jfrm.getRootPane().setWindowDecorationStyle(
						JRootPane.COLOR_CHOOSER_DIALOG);
				jfrm.setTitle("Decoration: COLOR_CHOOSER_DIALOG");
				break;
			case 5:
				jfrm.getRootPane().setWindowDecorationStyle(
						JRootPane.INFORMATION_DIALOG);
				jfrm.setTitle("Decoration: INFORMATION_DIALOG");
				break;
			case 6:
				jfrm.getRootPane().setWindowDecorationStyle(
						JRootPane.QUESTION_DIALOG);
				jfrm.setTitle("Decoration: QUESTION_DIALOG");
				break;
			case 7:
				jfrm.getRootPane().setWindowDecorationStyle(
						JRootPane.ERROR_DIALOG);
				jfrm.setTitle("Decoration: ERROR_DIALOG");
				break;
			case 8:
				jfrm.getRootPane().setWindowDecorationStyle(
						JRootPane.WARNING_DIALOG);
				jfrm.setTitle("Decoration: WARNING_DIALOG");
				break;
			case 9:
				jfrm.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
				jfrm.setTitle("Decoration: NONE");
				break;
			default:
				break;
			}

			SwingUtilities.updateComponentTreeUI(jfrm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void mntmOpen() {
		// TODO Auto-generated method stub
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogType(JFileChooser.OPEN_DIALOG);
		chooser.setDialogTitle("Open File");

		if (chooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION)
			return;
	}

	private void create_mnLF_item() {
		/**
		 * ButtonGroup
		 */
		btnGroup = new ButtonGroup();

		for (int i = 0; i < jrbmenuitem.length; i++) {
			/**
			 * JRadioButtonMenuItem
			 */
			jrbmenuitem[i] = new JRadioButtonMenuItem(item[i]);
			jrbmenuitem[i].setEnabled(isLookAndFeelSupported(classname[i]));

			jrbmenuitem[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					jrbmenuitem_updateComponentTreeUI(e);
				}
			});
			btnGroup.add(jrbmenuitem[i]);
			mnLF.add(jrbmenuitem[i]);
		}
		jrbmenuitem[0].setSelected(true);
	}

	protected void jrbmenuitem_updateComponentTreeUI(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < item.length; i++) {
				if (e.getActionCommand().equals(item[i])) {
					// 設定Look and Feel
					UIManager.setLookAndFeel(classname[i]);

					jfrm.setTitle(item[i] + " L & F");
				}
			}
		} catch (Exception ex) {
		}

		// 執行階段變更Look and Feel
		SwingUtilities.updateComponentTreeUI(jfrm);

		// if (e.getActionCommand().equals(item[0])) {
		// // frame Undecorated
		// jfrm.setUndecorated(true);
		// } else {
		// // jfrm.setUndecorated(false);
		// }
	}

	private boolean isLookAndFeelSupported(String classname) {
		try {
			Class lnfclass = Class.forName(classname);
			javax.swing.LookAndFeel lnf = (LookAndFeel) (lnfclass.newInstance());

			// 判斷作業系統是否支援Look and Feel
			return lnf.isSupportedLookAndFeel();

		} catch (Exception e) {
			return false;
		}
	}

	protected void mntmExit() {
		JOptionPane joptionpane = new JOptionPane();
		int iResult = joptionpane.showConfirmDialog(null,
				"Are you sure to quit?", "Exit", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);

		if (iResult == 0) {
			System.exit(0);
		}
	}
}
