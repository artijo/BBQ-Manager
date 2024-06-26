package buffetmanage;

import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UIBill {
	
	JFrame frame;
	private String nprice = "";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIBill window = new UIBill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws FileNotFoundException 
	 */
	public UIBill() throws FileNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws FileNotFoundException 
	 */
	private void initialize() throws FileNotFoundException {
		FileWriterAndRead file =new FileWriterAndRead();
		Font font = new Font("RSU", Font.PLAIN, 16);
		UIManager.put("OptionPane.messageFont", font);

		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 470, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nameTBCB = new JLabel("โต๊ะ "+Main.tableCB);
		nameTBCB.setFont(new Font("RSU", Font.PLAIN, 16));
		nameTBCB.setBounds(184, 24, 94, 13);
		frame.getContentPane().add(nameTBCB);

		Object[] namemenu = file.showBill(Main.tableCB);
		String nameMenu = "";
		
		for (Object name : namemenu) {
			nameMenu = nameMenu+name+"\n";
		}
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("RSU", Font.PLAIN, 16));
		textPane.setText(nameMenu);
		textPane.setBounds(23, 80, 203, 330);
		frame.getContentPane().add(textPane);
		
		Object[] price = file.showBillprice(Main.tableCB);
		
		
		for (Object add : price) {
			nprice = nprice+add+"\n";
		}
		
		JTextPane tprice = new JTextPane();
		tprice.setEditable(false);
		tprice.setFont(new Font("RSU", Font.PLAIN, 15));
		tprice.setText(nprice);
		tprice.setBounds(261, 80, 72, 330);
		frame.getContentPane().add(tprice);
		
		Object[] count = file.countBill(Main.tableCB);
		String countNumber = "";
		
		for (Object length : count) {
			countNumber += "x"+length+"\n";
		}
		
		JTextPane ctext = new JTextPane();
		ctext.setEditable(false);
		ctext.setFont(new Font("RSU", Font.PLAIN, 15));
		ctext.setText(countNumber);
		ctext.setBounds(380, 80, 50, 330);
		frame.getContentPane().add(ctext);
		
		JLabel lblNewLabel = new JLabel("ยอดรวม");
		lblNewLabel.setFont(new Font("RSU", Font.PLAIN, 14));
		lblNewLabel.setBounds(162, 433, 64, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel total = new JLabel(Integer.toString(file.totalPrice(Main.tableCB)));
		total.setFont(new Font("RSU", Font.PLAIN, 20));
		total.setBounds(249, 420, 100, 40);
		frame.getContentPane().add(total);
		
		
		//Bill check print
		JButton btnNewButton = new JButton("ปริ้นใบเสร็จ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c = JOptionPane.showConfirmDialog(null, "รายการเสร็จสิ้นแล้วใช่หรือไม่", "ยืนยัน", JOptionPane.OK_CANCEL_OPTION);
				if (c == JOptionPane.OK_OPTION) {
					try {
						file.pricetotal(Integer.toString(file.totalPrice(Main.tableCB)));
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					file.deleteBillFile(Main.tableCB);
					frame.dispose();
					Main.frame.dispose();
					Main window;
					try {
						window = new Main();
						window.frame.setVisible(true);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("RSU", Font.PLAIN, 15));
		btnNewButton.setBounds(254, 485, 140, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ย้อนกลับ");
		btnNewButton_1.setFont(new Font("RSU", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(58, 485, 140, 40);
		frame.getContentPane().add(btnNewButton_1);
		
	}
}
