package Layout;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import myFrame.JFrameTools;

public class sample_CardLayout {

	private JFrame jframe;
	private FlowLayout flowLayout;
	private JPanel panel_1;
	private CardLayout cardLayout;

	/**
	 * 格子
	 */
	sample_CardLayout() {
		// JFrame
		jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(new Rectangle(0, 0, 400, 100));
		jframe.setTitle("Sample Card Layout ");
		JFrameTools.setCenter(jframe);
		jframe.getContentPane().setLayout(
				new BoxLayout(jframe.getContentPane(), BoxLayout.PAGE_AXIS));

		JPanel panel = new JPanel();
		jframe.getContentPane().add(panel);
		flowLayout = new FlowLayout(FlowLayout.CENTER, 5, 5);
		panel.setLayout(flowLayout);

		JButton button = new JButton("<<First");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnFirst();
			}
		});
		panel.add(button);

		JButton button_1 = new JButton("<Previous");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPrevious();
			}
		});
		panel.add(button_1);

		panel_1 = new JPanel();
		panel.add(panel_1);
		cardLayout = new CardLayout(5, 20);
		panel_1.setLayout(cardLayout);

		JLabel lblCard = new JLabel("Card 1");
		panel_1.add(lblCard, "name_21899677656901");

		JLabel lblCard_1 = new JLabel("Card 2");
		panel_1.add(lblCard_1, "name_21899697232381");

		JLabel lblCard_2 = new JLabel("Card 3");
		panel_1.add(lblCard_2, "name_21967024758661");

		JLabel lblCard_3 = new JLabel("Card 4");
		panel_1.add(lblCard_3, "name_21985720783106");

		JLabel lblCard_4 = new JLabel("Card 5");
		panel_1.add(lblCard_4, "name_21988241116812");

		JButton btnNext = new JButton("Next>");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNext();
			}
		});
		panel.add(btnNext);

		JButton btnLast = new JButton("Last>>");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLast();
			}
		});
		panel.add(btnLast);
	}

	protected void btnLast() {
		// TODO Auto-generated method stub
		cardLayout.last(panel_1);
	}

	protected void btnNext() {
		// TODO Auto-generated method stub
		cardLayout.next(panel_1);
	}

	protected void btnPrevious() {
		// TODO Auto-generated method stub
		cardLayout.previous(panel_1);
	}

	protected void btnFirst() {
		// TODO Auto-generated method stub
		cardLayout.first(panel_1);
	}
}
