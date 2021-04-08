import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JRadioButton;

public class secondBox extends JFrame {

	private JPanel contentPane;
	private ImageIcon img, ImgSearch;
	private String com[]= {"Cat","Dog","Bird","Snake","Horse"};
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondBox frame = new secondBox();
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
	public secondBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 786);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		img =new ImageIcon(getClass().getResource("rsz_cub.jpg"));
		ImgSearch =new ImageIcon(getClass().getResource("rsz_sb.png"));
		
		JLabel Greatings = new JLabel("  ANIMAL INFORMATION MANAGEMENT SYSTEM");
		Greatings.setBackground(Color.MAGENTA);
		Greatings.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		Greatings.setForeground(new Color(102, 0, 0));
		Greatings.setBounds(126, 16, 842, 62);
		contentPane.add(Greatings);
		
		JLabel NewLabel = new JLabel(" Welcome To Animal Information Management System");
		NewLabel.setBackground(new Color(51, 102, 0));
		NewLabel.setForeground(new Color(204, 0, 0));
		NewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 24));
		NewLabel.setBounds(262, 651, 579, 33);
		contentPane.add(NewLabel);
		
		JLabel ImangeLabel = new JLabel(img);
		ImangeLabel.setBounds(0, 150, 1130, 500);
		contentPane.add(ImangeLabel);
		
		JComboBox comboBox = new JComboBox(com);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 23));
		comboBox.setBounds(834, 108, 123, 33);
		comboBox.setEditable(true);
	/*  comboBox.addItem("Lion");
		comboBox.removeItem("Cat");
		comboBox.removeItemAt(2);
		comboBox.removeAllItems();    */
		contentPane.add(comboBox);
		
		JButton OK = new JButton(ImgSearch);
		OK.setForeground(Color.BLUE);
		OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =comboBox.getSelectedItem().toString();
				if(s=="Dog")
				{
					aboutDog ad=new aboutDog();
					ad.setVisible(true);
				}
				else if(s=="Snake")
				{
					aboutSnake as=new aboutSnake();
					as.setVisible(true);
				}
				else if(s=="Horse")
				{
					aboutHorse ah=new aboutHorse();
					ah.setVisible(true);
				}
				else if(s=="Bird")
				{
					aboutBird ab=new aboutBird();
					ab.setVisible(true);
				}
				else {
					AnimalInformation sc=new AnimalInformation();
					sc.setVisible(true);
				}
		}
	});
		OK.setToolTipText("");
		OK.setBounds(966, 108, 82, 33);
		contentPane.add(OK);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondBox sb=new secondBox();
				sb.setVisible(true);
				dispose();
			}
		});
		btnHome.setBackground(new Color(204, 204, 153));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnHome.setBounds(500, 111, 115, 29);
		contentPane.add(btnHome);
		
		JButton btnUser = new JButton("User");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				UserInformation un=new UserInformation();
				un.setVisible(true);
			}
		});
		btnUser.setBackground(new Color(204, 204, 153));
		btnUser.setForeground(new Color(0, 0, 0));
		btnUser.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUser.setBounds(677, 111, 115, 29);
		contentPane.add(btnUser);
		
		JRadioButton rdbtnRadioButton1 = new JRadioButton("");
		rdbtnRadioButton1.setBounds(802, 678, 29, 29);
		contentPane.add(rdbtnRadioButton1);
		
		JRadioButton rdbtnRadioButton2 = new JRadioButton("");
		rdbtnRadioButton2.setBounds(839, 678, 29, 29);
		contentPane.add(rdbtnRadioButton2);
		
		JRadioButton rdbtnRadioButton3 = new JRadioButton("");
		rdbtnRadioButton3.setBounds(872, 678, 29, 29);
		contentPane.add(rdbtnRadioButton3);
		
		JRadioButton rdbtnradioButton4 = new JRadioButton("");
		rdbtnradioButton4.setBounds(908, 678, 29, 29);
		contentPane.add(rdbtnradioButton4);
		
		JRadioButton rdbtnRadioButton5 = new JRadioButton("");
		rdbtnRadioButton5.setBounds(944, 678, 29, 29);
		contentPane.add(rdbtnRadioButton5);
		
		JButton btnRate = new JButton("Rate");
		btnRate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thank You For Your Opinion!");
			}
		});
		btnRate.setBackground(new Color(153, 204, 204));
		btnRate.setForeground(Color.BLACK);
		btnRate.setFont(new Font("Tahoma", Font.ITALIC, 20));
		btnRate.setBounds(977, 671, 82, 36);
		contentPane.add(btnRate);
	}
}