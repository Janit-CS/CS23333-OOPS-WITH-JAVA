import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JPanel {
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    public LoginPage(ActionListener navigationListener) {
        setLayout(new BorderLayout());
        setBackground(StyleUtils.BACKGROUND_COLOR);

        // Title and Introduction
        JLabel title = StyleUtils.createTitleLabel("<html><h1>Login</h1><p>Welcome back! Please log in to continue.</p></html>");
        add(title, BorderLayout.NORTH);

        // Login Form Panel
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
        formPanel.setBackground(Color.WHITE);

        JLabel lblUsername = new JLabel("Username:", JLabel.RIGHT);
        lblUsername.setFont(StyleUtils.SUBTITLE_FONT);
        lblUsername.setForeground(StyleUtils.TEXT_COLOR);
        txtUsername = new JTextField();
        formPanel.add(lblUsername);
        formPanel.add(txtUsername);

        JLabel lblPassword = new JLabel("Password:", JLabel.RIGHT);
        lblPassword.setFont(StyleUtils.SUBTITLE_FONT);
        lblPassword.setForeground(StyleUtils.TEXT_COLOR);
        txtPassword = new JPasswordField();
        formPanel.add(lblPassword);
        formPanel.add(txtPassword);

        add(formPanel, BorderLayout.CENTER);

        // Buttons Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(StyleUtils.BACKGROUND_COLOR);

        JButton btnLogin = StyleUtils.createStyledButton("Login", StyleUtils.SECONDARY_COLOR);
        btnLogin.setActionCommand("Login");
        btnLogin.addActionListener(e -> {
            // Placeholder for login authentication
            JOptionPane.showMessageDialog(this, "Logged in successfully!");
            navigationListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Home"));
        });

        JButton btnRegister = StyleUtils.createStyledButton("Register", StyleUtils.PRIMARY_COLOR);
        btnRegister.setActionCommand("Register");
        btnRegister.addActionListener(navigationListener);

        buttonPanel.add(btnLogin);
        buttonPanel.add(btnRegister);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public String getUsername() {
        return txtUsername.getText();
    }

    public String getPassword() {
        return new String(txtPassword.getPassword());
    }
}