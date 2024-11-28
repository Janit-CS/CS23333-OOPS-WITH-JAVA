import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage extends JPanel {
    private JTextField txtUsername, txtEmail;
    private JPasswordField txtPassword;

    public RegisterPage(ActionListener navigationListener) {
        setLayout(new BorderLayout());
        setBackground(StyleUtils.BACKGROUND_COLOR);

        // Title and Introductory Text
        JLabel title = StyleUtils.createTitleLabel("<html><h1>Register</h1><p>Create a new account to start your journey.</p></html>");
        add(title, BorderLayout.NORTH);

        // Registration Form Panel
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
        formPanel.setBackground(Color.WHITE);

        formPanel.add(new JLabel("Username:", JLabel.RIGHT));
        txtUsername = new JTextField();
        formPanel.add(txtUsername);

        formPanel.add(new JLabel("Email:", JLabel.RIGHT));
        txtEmail = new JTextField();
        formPanel.add(txtEmail);

        formPanel.add(new JLabel("Password:", JLabel.RIGHT));
        txtPassword = new JPasswordField();
        formPanel.add(txtPassword);

        add(formPanel, BorderLayout.CENTER);

        // Buttons Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(StyleUtils.BACKGROUND_COLOR);

        JButton btnRegister = StyleUtils.createStyledButton("Register", StyleUtils.SECONDARY_COLOR);
        btnRegister.addActionListener(e -> {
            // Placeholder for registration logic
            JOptionPane.showMessageDialog(this, "Registration successful! Please log in.");
            navigationListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Login"));
        });

        JButton btnBack = StyleUtils.createStyledButton("Back to Login", StyleUtils.PRIMARY_COLOR);
        btnBack.setActionCommand("Login");
        btnBack.addActionListener(navigationListener);

        buttonPanel.add(btnRegister);
        buttonPanel.add(btnBack);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public String getUsername() {
        return txtUsername.getText();
    }

    public String getEmail() {
        return txtEmail.getText();
    }

    public String getPassword() {
        return new String(txtPassword.getPassword());
    }
}