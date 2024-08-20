import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login() {
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Username
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        add(usernameLabel);
        add(usernameField);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        add(passwordLabel);
        add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(new JLabel()); // Empty cell for alignment
        add(loginButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Simulate login process (replace with actual authentication logic)
            if (username.equals("vasavi") && password.equals("vasavi")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login());
    }
}

/*public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
