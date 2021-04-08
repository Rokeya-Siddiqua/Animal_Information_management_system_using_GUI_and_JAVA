import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class aboutHorse extends JFrame {

	private JPanel contentPane;
	private JTextField About_text;
	private ImageIcon horse1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aboutHorse frame = new aboutHorse();
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
	public aboutHorse() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100,  827, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		horse1 =new ImageIcon(getClass().getResource("horse1.jpg"));
		
		JLabel lblAbout = new JLabel(" About Horse");
		lblAbout.setForeground(new Color(153, 51, 51));
		lblAbout.setFont(new Font("Serif", Font.BOLD, 38));
		lblAbout.setBounds(182, 16, 266, 67);
		contentPane.add(lblAbout);
		
		
		Horse h=new Horse("Equus caballus",false,25,45.5);
		
		JTextArea textArea=new JTextArea(h.toString());
		textArea.setBackground(new Color(255, 255, 204));
		textArea.setFont(new Font("Arial", Font.PLAIN, 22));
		textArea.setForeground(Color.BLACK);
		textArea.setBounds(15, 99, 503, 244);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton(horse1);
		btnNewButton.setBounds(533, 99, 258, 204);
		contentPane.add(btnNewButton);
	}

}
