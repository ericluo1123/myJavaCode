package myMain;

import java.awt.Graphics;

import myFrame.frm_Frame;

public class myLesson {
	public myLesson() {
		frm_Frame frame = new frm_Frame();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myLesson Windows = new myLesson();
	}
	
	public void paint(Graphics g) {
		g.drawString("Hello Java !", 50, 100);
	}
}