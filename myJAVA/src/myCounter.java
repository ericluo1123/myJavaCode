import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.awt.Color;

public class myCounter {

	private JFrame frmPT81;
	private JButton btnIncrement;
	private JButton btnDecrement;
	private JLabel lblSeconds;
	private Counter c;
	private Counter c1;
	private JLabel lbl1;
	private JButton btnStart;
	private JButton btnStop;
	private JButton btnClears;
	private JButton btnExit;
	private JLabel lblMinute;
	private JLabel label_1;
	private Timer timer;
	private ActionListener tim0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myCounter window = new myCounter();
					window.frmPT81.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myCounter() {
		initialize();

		c = new Counter(0);
		c1 = new Counter(0);
		showCount();
		

		tim0 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btnIncrement_Click();
		}};
		
		timer = new Timer(1000, tim0);//ms

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPT81 = new JFrame();
		frmPT81.setName("frame300");
		frmPT81.setTitle("計數器");
		frmPT81.setBounds(100, 100, 420, 400);
		frmPT81.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPT81.getContentPane().setLayout(null);

		btnIncrement = new JButton("增加");
		btnIncrement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIncrement_Click();
			}
		});
		btnIncrement.setFont(new Font("新細明體", Font.BOLD, 24));
		btnIncrement.setBounds(75, 150, 100, 50);
		frmPT81.getContentPane().add(btnIncrement);

		btnDecrement = new JButton("減少");
		btnDecrement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDecrement_Click();
			}
		});

		btnStart = new JButton("開始");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart_Click();
			}
		});
		btnStart.setFont(new Font("新細明體", Font.BOLD, 24));
		btnStart.setBounds(75, 210, 100, 50);
		frmPT81.getContentPane().add(btnStart);

		btnClears = new JButton("歸零");
		btnClears.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnClears_Click();
			}
		});
		btnClears.setFont(new Font("新細明體", Font.BOLD, 24));
		btnClears.setBounds(75, 270, 100, 50);
		frmPT81.getContentPane().add(btnClears);

		btnExit = new JButton("結束");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_Click();
			}
		});
		btnExit.setFont(new Font("新細明體", Font.BOLD, 24));
		btnExit.setBounds(225, 270, 100, 50);
		frmPT81.getContentPane().add(btnExit);

		btnStop = new JButton("停止");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStop_Click();
			}
		});
		btnStop.setFont(new Font("新細明體", Font.BOLD, 24));
		btnStop.setBounds(225, 210, 100, 50);
		frmPT81.getContentPane().add(btnStop);
		btnDecrement.setFont(new Font("新細明體", Font.BOLD, 24));
		btnDecrement.setBounds(225, 150, 100, 50);
		frmPT81.getContentPane().add(btnDecrement);

		lblSeconds = new JLabel("0");
		lblSeconds.setFont(new Font("新細明體", Font.BOLD, 72));
		lblSeconds.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeconds.setBounds(225, 25, 100, 100);
		frmPT81.getContentPane().add(lblSeconds);

		lbl1 = new JLabel("");
		lbl1.setEnabled(false);
		lbl1.setForeground(Color.RED);
		lbl1.setFont(new Font("新細明體", Font.BOLD, 36));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(75, 250, 250, 50);
		frmPT81.getContentPane().add(lbl1);

		lblMinute = new JLabel("0");
		lblMinute.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinute.setFont(new Font("新細明體", Font.BOLD, 72));
		lblMinute.setBounds(75, 25, 100, 100);
		frmPT81.getContentPane().add(lblMinute);

		label_1 = new JLabel(":");
		label_1.setEnabled(false);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("新細明體", Font.BOLD, 72));
		label_1.setBounds(175, 18, 50, 100);
		frmPT81.getContentPane().add(label_1);
	}

	protected void btnStop_Click() {
		// TODO Auto-generated method stub
		timer.stop(); // 啟動計時器
		btnIncrement.setEnabled(true);;
		btnDecrement.setEnabled(true);;
		btnStart.setEnabled(true);;
	}

	protected void btnStart_Click() {
		// TODO Auto-generated method stub
		timer.start(); // 啟動計時器
		btnIncrement.setEnabled(false);;
		btnDecrement.setEnabled(false);;
		btnStart.setEnabled(false);;
	}

	protected void btnExit_Click() {
		// TODO Auto-generated method stub
		System.exit(1);
	}

	protected void btnClears_Click() {
		// TODO Auto-generated method stub
		c.Clears();;
		c1.Clears();;
		this.showCount();	
	
	}

	protected void btnIncrement_Click() {
		// TODO Auto-generated method stub
		c.incrementCount();
		if(c.getCount() == 60){
			c.Clears();;
			c1.incrementCount();
			if(c1.getCount() == 60){
				c1.Clears();;
			}
		}
		this.showCount();
	}

	protected void btnDecrement_Click() {
		// TODO Auto-generated method stub
		c.decrementCount();
		this.showCount();
	}

	private void showCount() {
		// TODO Auto-generated method stub
		Integer value = new Integer(c.getCount());
		String str = value.toString();
		Integer value1 = new Integer(c1.getCount());
		String str1 = value1.toString();
		lblSeconds.setText(str);
		lblMinute.setText(str1);
	}
}
