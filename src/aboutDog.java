import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class aboutDog extends JFrame {

	private JPanel contentPane;
	private JTextField About_text;
	private ImageIcon dog1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aboutDog frame = new aboutDog();
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
	public aboutDog() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 827, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dog1 =new ImageIcon(getClass().getResource("dog1.jpg"));
		
		JLabel lblAbout = new JLabel(" About Dog");
		lblAbout.setForeground(new Color(153, 51, 51));
		lblAbout.setFont(new Font("Serif", Font.BOLD, 38));
		lblAbout.setBounds(182, 16, 266, 67);
		contentPane.add(lblAbout);
		
		Dog d=new Dog("Canis lupus familiaris",true,30.0,"husky");
		
			JTextArea textArea=new JTextArea(d.toString());
			textArea.setBackground(new Color(255, 255, 204));
			textArea.setFont(new Font("Arial", Font.PLAIN, 22));
			textArea.setForeground(Color.BLACK);
			textArea.setBounds(15, 99, 503, 244);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			contentPane.add(textArea);
		
		JButton btnNewButton = new JButton(dog1);
		btnNewButton.setBounds(533, 99, 258, 204);
		contentPane.add(btnNewButton);
	}
}
