package abbasJavaCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaswordMemorizerAndMaker {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaswordMemorizerAndMaker window = new PaswordMemorizerAndMaker();
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
	public PaswordMemorizerAndMaker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password Generator, And Memorizer");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(115, 0, 299, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Create Password");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.print("\033[H\033[2J"); // ANSI escape codes for clearing screen (works in many terminals)
				System.out.flush();
				
			}
		});
		btnNewButton.setBounds(70, 100, 141, 93);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnGeussPassword = new JButton("Geuss Password");
		btnGeussPassword.setBounds(286, 100, 141, 93);
		frame.getContentPane().add(btnGeussPassword);
	}
}
