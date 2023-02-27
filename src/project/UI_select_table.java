package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UI_select_table extends UITable{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_select_table window = new UI_select_table();
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
	public UI_select_table() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		UITable table = new UITable();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("เลือกโต๊ะ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(296, 36, 156, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Backbutton = new JButton("Go back");
		Backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == Backbutton) {
					frame.dispose();
					table.frame.setVisible(true);
				}
			}
		});
		Backbutton.setBounds(26, 10, 85, 21);
		frame.getContentPane().add(Backbutton);
		
		JButton table_A01 = new JButton("A01");
		table_A01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==table_A01) {
					frame.dispose();
					table.frame.setVisible(true);
					
					
				}
			}
		});
		table_A01.setBackground(new Color(218, 165, 32));
		table_A01.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A01.setBounds(127, 127, 104, 52);
		frame.getContentPane().add(table_A01);
		
		JButton table_A02 = new JButton("A02");
		table_A02.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A02.setBackground(new Color(218, 165, 32));
		table_A02.setBounds(127, 228, 104, 52);
		frame.getContentPane().add(table_A02);
		
		JButton table_A03 = new JButton("A03");
		table_A03.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A03.setBackground(new Color(218, 165, 32));
		table_A03.setBounds(127, 335, 104, 52);
		frame.getContentPane().add(table_A03);
		
		JButton table_A04 = new JButton("A04");
		table_A04.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A04.setBackground(new Color(218, 165, 32));
		table_A04.setBounds(127, 455, 104, 52);
		frame.getContentPane().add(table_A04);
		
		JButton table_A05 = new JButton("A05");
		table_A05.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A05.setBackground(new Color(218, 165, 32));
		table_A05.setBounds(127, 576, 104, 52);
		frame.getContentPane().add(table_A05);
		
		JButton table_A06 = new JButton("A06");
		table_A06.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_A06.setBackground(new Color(218, 165, 32));
		table_A06.setBounds(127, 695, 104, 52);
		frame.getContentPane().add(table_A06);
		
		JButton table_B01 = new JButton("B01");
		table_B01.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_B01.setBackground(new Color(218, 165, 32));
		table_B01.setBounds(318, 127, 104, 52);
		frame.getContentPane().add(table_B01);
		
		JButton table_B02 = new JButton("B02");
		table_B02.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_B02.setBackground(new Color(218, 165, 32));
		table_B02.setBounds(318, 228, 104, 52);
		frame.getContentPane().add(table_B02);
		
		JButton table_B03 = new JButton("B03");
		table_B03.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_B03.setBackground(new Color(218, 165, 32));
		table_B03.setBounds(318, 335, 104, 52);
		frame.getContentPane().add(table_B03);
		frame.setBounds(100, 100, 700, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}