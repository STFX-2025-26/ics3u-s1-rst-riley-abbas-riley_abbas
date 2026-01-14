package abbasJavaCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.*;


public class PaswordMemorizerAndMaker {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

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
			

				
			}
		});
		btnNewButton.setBounds(68, 255, 153, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnGeussPassword = new JButton("Geuss Password");
		btnGeussPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// as
			}
		});
		btnGeussPassword.setBounds(297, 255, 170, 33);
		frame.getContentPane().add(btnGeussPassword);
		
		textField = new JTextField();
		textField.setBounds(80, 109, 107, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Put in your name:");
		lblNewLabel_1.setBounds(80, 94, 107, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(80, 170, 107, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Your Password:");
		lblNewLabel_1_1.setBounds(80, 158, 107, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
	
	
	
	
}
