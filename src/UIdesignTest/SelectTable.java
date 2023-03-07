package UIdesignTest;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import project.UI_select_table;

public class SelectTable{
	JFrame frame;
	private JTextField nameBK;
	private JTextField phoneBK;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectTable window = new SelectTable();
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
	public SelectTable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(227, 188, 134));
		panel.setBounds(0, 0, 183, 553);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(Main.getButton());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(51, 10, 64, 48);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 208, 169));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(183, 0, 403, 553);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		nameBK = new JTextField();
		nameBK.setFont(new Font("Angsana New", Font.PLAIN, 16));
		nameBK.setBounds(114, 71, 239, 34);
		panel_1.add(nameBK);
		nameBK.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ชื่อผู้จอง:");
		lblNewLabel_1.setFont(new Font("Angsana New", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 71, 94, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("เบอร์โทร:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Angsana New", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(23, 129, 81, 34);
		panel_1.add(lblNewLabel_1_1);
		
		phoneBK = new JTextField();
		phoneBK.setFont(new Font("Angsana New", Font.PLAIN, 16));
		phoneBK.setColumns(10);
		phoneBK.setBounds(114, 129, 239, 34);
		panel_1.add(phoneBK);
		
		JComboBox timeS = new JComboBox();
		timeS.setModel(new DefaultComboBoxModel(new String[] {"เลือกเวลา", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		timeS.setFont(new Font("Angsana New", Font.PLAIN, 16));
		timeS.setBounds(114, 204, 81, 34);
		panel_1.add(timeS);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("เวลา:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("Angsana New", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(23, 204, 81, 34);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("ถึง");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("Angsana New", Font.PLAIN, 30));
		lblNewLabel_1_1_1_1.setBounds(205, 204, 51, 34);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JComboBox timeE = new JComboBox();
		timeE.setModel(new DefaultComboBoxModel(new String[] {"เลือกเวลา", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00"}));
		timeE.setFont(new Font("Angsana New", Font.PLAIN, 16));
		timeE.setBounds(272, 204, 81, 34);
		panel_1.add(timeE);
		
		JButton btnNewButton = new JButton("บันทึก");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nameBK.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "กรุณากรอกชื่อ","Fill Form",JOptionPane.OK_OPTION);
				}else if(phoneBK.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "กรุณากรอกเบอร์โทรศัพท์","Fill Form",JOptionPane.OK_OPTION);
				}else if(!phoneBK.getText().matches("[0-9]+")) {
					JOptionPane.showMessageDialog(null, "กรุณากรอกเบอร์โทรศัพท์เป็นตัวเลข","Fill Form",JOptionPane.OK_OPTION);
				}else if(timeS.getSelectedIndex() == 0 || timeE.getSelectedIndex() == 0){
					JOptionPane.showMessageDialog(null, "กรุณาเลือกเวลาจอง","Fill Form",JOptionPane.OK_OPTION);
				}else if(Main.getButton().isEmpty()) {
					JOptionPane.showMessageDialog(null, "กรุณาเลือกโต๊ะที่จะทำการจอง","Fill Form",JOptionPane.OK_OPTION);			
				}				else {
				int confirm = JOptionPane.showConfirmDialog(null, "ต้องการบันทึกข้อมูลหรือไม่?","Confirm", JOptionPane.YES_NO_OPTION);
				if(confirm == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "บันทึกเสร็จสิ้น", "Success!", JOptionPane.PLAIN_MESSAGE);
					FileWriterAndRead bk = new FileWriterAndRead();
					bk.setNumID();
					bk.setTableID(Main.getButton());
					bk.setNameBK(nameBK.getText());
					bk.setPhone(phoneBK.getText());
					try {
						bk.setTime_s((String)timeS.getSelectedItem());
						bk.setTime_e((String)timeE.getSelectedItem());
						bk.BKFile();
						bk.wfbk();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				}
				
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Angsana New", Font.PLAIN, 10));
		btnNewButton.setBounds(156, 451, 100, 34);
		panel_1.add(btnNewButton);
	}
}
