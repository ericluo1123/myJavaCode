package myFrame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class JFrameTools {

	/**
	 * 將視窗定位於螢幕中央
	 * 
	 * @param jfrm
	 */
	public static void setCenter(JFrame jfrm) {

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

	}
}
