package myMain;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import sun.awt.RepaintArea;
import myFrame.frm_Frame;

public class myLesson {

	private JFrame jframe;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myLesson Windows = new myLesson();
	}

	public myLesson() {
		jframe = new JFrame();
		jframe.setBounds(new Rectangle(0, 0, 200, 150));
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);

		// RepaintArea();
		// Timer timer = new Timer();
		// timer.schedule(new TimerTask() {
		//
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		// paint();
		// }
		// }, 1000, 1000);

	}

	public void paint(Graphics g) {
		g.drawString("Hello Java !", 50, 50);
	}

}
