import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.sun.glass.events.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;

public class UserInformation extends JFrame {

	private JPanel contentPane;
	private JTextField First_Name;
	private JTextField Last_Name;
	private JTextField Phone;
	private ButtonGroup bg;
	private JTable table;
	private DefaultTableModel model1;
	private JScrollPane scroll;
	private String col[]= {"First Name","Last Name","Phone Number"};
	private String[] row=new String[3];
	private ImageIcon back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInformation frame = new UserInformation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserInformation() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 927, 737);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setForeground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		back =new ImageIcon(getClass().getResource("back.png"));
		
		JLabel lblFirstName = new JLabel(" First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFirstName.setBounds(70, 76, 122, 32);
		contentPane.add(lblFirstName);
		
		JLabel lblUserRegistration = new JLabel(" User Registration");
		lblUserRegistration.setForeground(new Color(204, 51, 0));
		lblUserRegistration.setBackground(new Color(204, 0, 0));
		lblUserRegistration.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 31));
		lblUserRegistration.setBounds(331, 0, 248, 59);
		contentPane.add(lblUserRegistration);
		
		JLabel lblLastName = new JLabel(" Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLastName.setBounds(70, 137, 112, 32);
		contentPane.add(lblLastName);
		
		JLabel lblPhoneNumber = new JLabel(" Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhoneNumber.setBounds(68, 197, 154, 32);
		contentPane.add(lblPhoneNumber);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAdd)
				{
					row[0]=First_Name.getText();
					row[1]=Last_Name.getText();
					row[2]=Phone.getText();
					model1.addRow(row);
				}
			}
		});
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setBounds(527, 80, 115, 29);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnUpdate)
				{
					int num=table.getSelectedRow();
					String fn=First_Name.getText();
					String ln=Last_Name.getText();
					String pn=Phone.getText();
					
					model1.setValueAt(fn, num, 0);
					model1.setValueAt(ln, num, 1);
					model1.setValueAt(pn, num, 2);
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBackground(Color.LIGHT_GRAY);
		btnUpdate.setBounds(527, 141, 115, 29);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnDelete)
				{
					int num=table.getSelectedRow();
					if(num>=0)
					{
						model1.removeRow(num);
					}
					else
					{
						JOptionPane.showMessageDialog(null, " no rows has been selected or no row exits","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnDelete.setBackground(Color.LIGHT_GRAY);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(527, 199, 115, 29);
		contentPane.add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnClear)
				{
					First_Name.setText("");
					Last_Name.setText("");
					Phone.setText("");
				}
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setBounds(527, 257, 115, 29);
		contentPane.add(btnClear);
		
		JLabel lblEmailAddress = new JLabel(" Gender");
		lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmailAddress.setBounds(70, 260, 136, 23);
		contentPane.add(lblEmailAddress);
		
		First_Name = new JTextField();
		First_Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		First_Name.setBounds(221, 79, 211, 32);
		contentPane.add(First_Name);
		First_Name.setColumns(10);
		
		Last_Name = new JTextField();
		Last_Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Last_Name.setBounds(221, 140, 211, 32);
		contentPane.add(Last_Name);
		Last_Name.setColumns(10);
		
		Phone = new JTextField();
		Phone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Phone.setBounds(221, 202, 211, 32);
		contentPane.add(Phone);
		Phone.setColumns(10);
		
		bg=new ButtonGroup();
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(new Color(204, 204, 102));
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnMale.setBounds(154, 259, 136, 29);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(new Color(204, 204, 102));
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnFemale.setBounds(311, 258, 155, 29);
		contentPane.add(rdbtnFemale);
		
		bg.add(rdbtnFemale);
		bg.add(rdbtnMale);
		
		table = new JTable();
		//table.setBounds(15, 296, 875, 369);
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		model1=new DefaultTableModel();
		model1.setColumnIdentifiers(col);
		table.setModel(model1);
		table.setSelectionBackground(Color.LIGHT_GRAY);
		table.setBackground(Color.WHITE);
		table.setRowHeight(30);
		
		scroll=new JScrollPane(table);
		scroll.setBounds(15,296, 875, 369);
		contentPane.add(scroll);
		
		JButton btnBack = new JButton(back);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				secondBox sb=new secondBox();
				sb.setVisible(true);
			}
		});
		btnBack.setBounds(0, 0, 89, 29);
		contentPane.add(btnBack);
		
		table.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me)
			{
				int num=table.getSelectedRow();
				String fn=model1.getValueAt(num, 0).toString();
				String ln=model1.getValueAt(num, 1).toString();
				String pn=model1.getValueAt(num, 2).toString();
				
				First_Name.setText(fn);
				Last_Name.setText(ln);
				Phone.setText(pn);
			}
		});
	}
}
