package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Syslogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Syslogin window = new Syslogin();
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
	public Syslogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 406, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN SYSTEM");
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(142, 6, 126, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(88, 90, 75, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password: ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(88, 149, 75, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(175, 85, 130, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String password = passwordField.getText();
				
				if(name.contains("teejay") && password.contains("word")) {
					JOptionPane.showMessageDialog(btnNewButton, "Login Successful");
					textField.setText(null);
					passwordField.setText(null);
					
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
				}
			}
		});
		btnNewButton.setBounds(16, 235, 117, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setBounds(151, 235, 117, 32);
		frame.getContentPane().add(btnReset);
		
		JButton btnNewButton_1_1 = new JButton("Exit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(btnNewButton_1_1, "Confirm if you want to exit", "LOGIN SYSTEM",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					System.exit(1);
			
		}
			}
		});
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setBounds(283, 235, 117, 32);
		frame.getContentPane().add(btnNewButton_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(175, 143, 130, 29);
		frame.getContentPane().add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GREEN);
		separator.setBounds(16, 200, 370, 12);
		frame.getContentPane().add(separator);
	}

}
