package view;


import javax.swing.JButton;
import javax.swing.JDialog;

import classes.Login;

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.util.Scanner;

public class SetLoginView extends JDialog implements ActionListener, FocusListener {
	private JTextField setLoginUsernameField;
	private JPasswordField setLoginPasswordField;
	private JPasswordField setLoginConfirmPassword;
	private JButton setLoginBtn;
	private JLabel setLoginError;

	public SetLoginView(ProfessorView p, boolean modal) {
		p.transferFocus();
		requestFocus(true);
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			setLoginBtn = new JButton("CONFIRM");
			setLoginBtn.addActionListener(this);
			setLoginBtn.setBounds(163, 168, 96, 25);
			getContentPane().add(setLoginBtn);
			setLoginBtn.setActionCommand("OK");
			setLoginBtn.requestFocus();
			getRootPane().setDefaultButton(setLoginBtn);
		}

		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(55, 32, 96, 15);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(55, 69, 96, 15);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("CONFIRM PASSWORD");
		lblNewLabel_2.setBounds(28, 111, 132, 15);
		getContentPane().add(lblNewLabel_2);

		setLoginUsernameField = new JTextField();
		setLoginUsernameField.setBounds(178, 30, 239, 19);
		getContentPane().add(setLoginUsernameField);
		setLoginUsernameField.setColumns(10);

		setLoginPasswordField = new JPasswordField();
		setLoginPasswordField.setBounds(178, 67, 239, 19);
		getContentPane().add(setLoginPasswordField);

		setLoginConfirmPassword = new JPasswordField();
		setLoginConfirmPassword.setBounds(178, 109, 239, 19);
		getContentPane().add(setLoginConfirmPassword);

		setLoginError = new JLabel("Passwords do not match");
		setLoginError.setForeground(new Color(224, 27, 36));
		setLoginError.setBounds(178, 140, 239, 15);
		getContentPane().add(setLoginError);
		setLoginError.setVisible(false);
	}

	public void getLogin()  throws Login{
		Login login = new Login();
		String passwd = new String(setLoginPasswordField.getPassword());
		String passwd2 = new String(setLoginConfirmPassword.getPassword());

		login.setUsername(setLoginUsernameField.getText());
		login.setPassword(passwd);

		while (passwd.isEmpty() && (!passwd.equals(passwd2))){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		throw login;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
					String passwd1 = new String(setLoginPasswordField.getPassword());
					String passwd2 = new String(setLoginConfirmPassword.getPassword());
					if (!passwd1.equals(passwd2)) {
						setLoginError.setVisible(true);
					} else {
						setLoginError.setVisible(false);
						this.dispose();
					}

				}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'focusGained'");
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'focusLost'");
	}
	}


