package myJFrame;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import myGraphics.gra_Graphics;

import javax.swing.BoxLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class jfrm_JFrame extends JPanel {
	private JFrame jfrm;
	private Graphics g;
	private Graphics pg;
	private JPanel panel;
	private JButton btnShow;
	private JButton btnClear;
	private Point p1, p2;
	private Boolean complete;
	private boolean isDraw;
	protected boolean isFirst;

	public jfrm_JFrame() {

		jfrm = new JFrame();
		initJFrame();

		g = jfrm.getGraphics();
		jfrm.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				p2 = e.getPoint();
				isDraw = true;
				repaint();
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (isFirst == false) {
					isFirst = true;
					p1 = e.getPoint();
				} else {
					isFirst = false;
					isDraw = true;
					p2 = e.getPoint();
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				isDraw = false;
			}
		});

		panel.setBackground(Color.YELLOW);
		panel.setBounds(0, 0, 234, 50);
		jfrm.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
		panel.setBorder(new LineBorder(Color.BLACK));

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 60, 234, 52);
		jfrm.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		btnShow = new JButton("Show");
		btnShow.setFont(new Font("新細明體", Font.BOLD, 18));
		btnShow.setForeground(Color.RED);
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnShow(pg);
			}
		});
		panel_1.add(btnShow);

		btnClear = new JButton("Clear");
		btnClear.setBackground(Color.YELLOW);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnClear(pg);
			}
		});
		panel_1.add(btnClear);
		pg = panel.getGraphics();

		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				paintComponent(pg);
			}
		}, 10, 10);
	}

	protected void btnClear(Graphics pg) {
		// TODO Auto-generated method stub
		panel.update(pg);
	}

	protected void btnShow(Graphics pg) {
		// TODO Auto-generated method stub
		// pg.setColor(Color.red);
		// pg.setFont(new Font("新細明體", Font.BOLD, 22));
		// pg.drawString("小事不作，大事難成 !", 10, 30);

		pg.drawLine(10, 10, 10, 30);
		pg.drawRect(20, 10, 10, 30);
		pg.setColor(Color.red);
		pg.fillRect(20, 10, 10, 30);
		pg.setColor(Color.orange);
		pg.fillOval(40, 10, 10, 30);
		pg.drawOval(40, 10, 10, 30);
		pg.setColor(Color.black);
		pg.drawArc(60, 10, 80, 80, 30, 180);

	}

	private void initJFrame() {
		// TODO Auto-generated method stub

		jfrm.setBounds(new Rectangle(0, 0, 250, 150));
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

		jfrm.setTitle("Sample JFrame");
		jfrm.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		// g.drawString("Hello Java !", 20, 20);
		if (isDraw == false) {
			return;
		}
		panel.update(pg);
		// pg.drawLine(p1.x, p1.y, p2.x, p2.y);
		pg.drawRect(p1.x, p1.y, p2.x, p2.y);

	}

}
