import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.SystemColor;

public class Jtest {

	private JFrame frame;
	private JTextField textFieldUser;
	private JPasswordField passwordField;
	private ImageIcon img1, img2, img3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jtest window = new Jtest();
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
	public Jtest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(238, 232, 170));
		frame.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(new Color(204, 204, 153));
		frame.setBounds(100, 100, 585, 425);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		img1 =new ImageIcon(getClass().getResource("enter.png"));
		img2 =new ImageIcon(getClass().getResource("reset.png"));
		img3 =new ImageIcon(getClass().getResource("cancel.png"));
		
		JLabel Username = new JLabel(" Username");
		Username.setForeground(Color.BLACK);
		Username.setFont(new Font("Tahoma", Font.PLAIN, 23));
		Username.setBounds(70, 103, 136, 31);
		frame.getContentPane().add(Username);
		
		JLabel Password = new JLabel(" Password");
		Password.setBackground(Color.WHITE);
		Password.setFont(new Font("Tahoma", Font.PLAIN, 23));
		Password.setBounds(70, 173, 128, 29);
		frame.getContentPane().add(Password);
		
		textFieldUser = new JTextField();
		textFieldUser.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textFieldUser.setBounds(213, 104, 218, 34);
		frame.getContentPane().add(textFieldUser);
		textFieldUser.setColumns(10);
		
		JButton Enter = new JButton(img1);
		Enter.setForeground(Color.BLACK);
		Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user=textFieldUser.getText();
				String pass=passwordField.getText();
				if(user.equals("name")&&pass.equals("password"))
				{
					frame.dispose();
					JOptionPane.showMessageDialog(null, "LOGIN IS SUCCESSFUL!"+" WELCOME TO OUR SYSTEM !!!");
					secondBox sb=new secondBox();
					sb.setVisible(true);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Invalid Username or Password","LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		Enter.setFont(new Font("Tahoma", Font.BOLD, 18));
		Enter.setBackground(Color.LIGHT_GRAY);
		Enter.setBounds(155, 277, 92, 29);
		frame.getContentPane().add(Enter);
		
		JButton Reset = new JButton(img2);
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldUser.setText(null);
				passwordField.setText(null);
			}
		});
		Reset.setBackground(Color.LIGHT_GRAY);
		Reset.setForeground(Color.BLACK);
		Reset.setFont(new Font("Tahoma", Font.BOLD, 18));
		Reset.setBounds(276, 277, 92, 29);
		frame.getContentPane().add(Reset);
		
		JLabel LoginForm = new JLabel("     LOGIN Form");
		LoginForm.setForeground(new Color(128, 128, 0));
		LoginForm.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 33));
		LoginForm.setBackground(Color.GREEN);
		LoginForm.setBounds(112, 27, 275, 41);
		frame.getContentPane().add(LoginForm);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 23));
		passwordField.setBounds(213, 173, 218, 34);
		frame.getContentPane().add(passwordField);
		
		JButton Exit = new JButton(img3);
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		Exit.setBackground(Color.LIGHT_GRAY);
		Exit.setFont(new Font("Tahoma", Font.BOLD, 18));
		Exit.setBounds(394, 277, 92, 29);
		frame.getContentPane().add(Exit);
		
		JSeparator separatorUp = new JSeparator();
		separatorUp.setBounds(38, 76, 494, 3);
		frame.getContentPane().add(separatorUp);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 235, 502, 3);
		frame.getContentPane().add(separator);
	}
}
