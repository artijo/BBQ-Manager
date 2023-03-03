package fortest;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.LayoutStyle.ComponentPlacement;

import project.UITable;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UIORDERTEST {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIORDERTEST window = new UIORDERTEST();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public UIORDERTEST() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//Import FucList
		FileWriterAndRead fuction = new FileWriterAndRead();
		fuction.setName(1, "C:\\Users\\Peerapon\\Documents\\GitHub\\JAVA-OOP-Project\\data\\food.txt");
		
		//test list table
		String[] kuy = new String[] {"Table01","Table02","Table03","Table04","Table05"};
		
		//**Table
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 85, 106, 429);
		frame.getContentPane().add(scrollPane);
		
		JList Tablelist = new JList(kuy);		
		scrollPane.setViewportView(Tablelist);
		JLabel TableText = new JLabel("Table");
		TableText.setFont(new Font("Tahoma", Font.BOLD, 19));
		TableText.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(TableText);
		
		
		//**Table
		
		
		
		//**Menu
		
		int[] result = new int[] {1};
		
		JScrollPane Menu = new JScrollPane();
		Menu.setBounds(135, 85, 200, 247);
		frame.getContentPane().add(Menu);
		
		JLabel MenuText = new JLabel("Menu");
		MenuText.setHorizontalAlignment(SwingConstants.CENTER);
		MenuText.setFont(new Font("Tahoma", Font.BOLD, 19));
		Menu.setColumnHeaderView(MenuText);
		
		
		JList Menulist = new JList(fuction.getName());
		Menulist.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Menu.setViewportView(Menulist);
		System.out.println(Menulist.getSelectedIndex());
		
		//**Menu
		
		
		
		//จำนวนที่ต้องการ*****
		
		JLabel Result = new JLabel(String.valueOf(result[0]));
		Result.setBounds(204, 342, 45, 13);
		frame.getContentPane().add(Result);
		
		JButton AddButton = new JButton("เพิ่ม");
		AddButton.setFont(new Font("RSU", Font.PLAIN, 11));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int add_result = result[0]+1;
				result[0] = add_result;
				Result.setText(String.valueOf(result[0]));
			}
		});
		AddButton.setBounds(144, 365, 89, 23);
		frame.getContentPane().add(AddButton);
		
		JButton SubtractionButton = new JButton("ลด");
		SubtractionButton.setFont(new Font("RSU", Font.PLAIN, 11));
		SubtractionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int add_result = result[0]-1;
				if(add_result == 0) {
					result[0] = 1;
				}else {
					result[0] = add_result;
				}
				Result.setText(String.valueOf(result[0]));
				
			}
		});
		SubtractionButton.setBounds(243, 366, 89, 23);
		frame.getContentPane().add(SubtractionButton);
		
		JButton Confirm = new JButton("ยืนยัน");
		Confirm.setFont(new Font("RSU", Font.PLAIN, 11));
		Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Confirm.setBounds(144, 399, 89, 23);
		frame.getContentPane().add(Confirm);
		
		//จำนวนที่ต้องการ*****
		
		
		
		
		
		
		
	
	}
}
