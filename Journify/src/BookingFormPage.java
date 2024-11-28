import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BookingFormPage extends JPanel {
    public BookingFormPage(ActionListener navigationListener) {
        setLayout(new BorderLayout());
        setBackground(StyleUtils.BACKGROUND_COLOR);

        // Title
        JLabel title = StyleUtils.createTitleLabel("<html><h1>Booking Form</h1><p>Complete your booking details below.</p></html>");
        add(title, BorderLayout.NORTH);

        // Form Panel
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        formPanel.setBackground(Color.WHITE);

        formPanel.add(new JLabel("Full Name:", JLabel.RIGHT));
        JTextField nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Email:", JLabel.RIGHT));
        JTextField emailField = new JTextField();
        formPanel.add(emailField);

        formPanel.add(new JLabel("Phone:", JLabel.RIGHT));
        JTextField phoneField = new JTextField();
        formPanel.add(phoneField);

        formPanel.add(new JLabel("Travel Package:", JLabel.RIGHT));
        JComboBox<String> packageBox = new JComboBox<>(new String[]{"Paris Getaway", "Swiss Alps", "Goa Retreat"});
        formPanel.add(packageBox);

        formPanel.add(new JLabel("Booking Date (YYYY-MM-DD):", JLabel.RIGHT));
        JTextField dateField = new JTextField();
        formPanel.add(dateField);

        JButton btnSubmit = StyleUtils.createStyledButton("Submit Booking", StyleUtils.SECONDARY_COLOR);
        btnSubmit.addActionListener(e -> JOptionPane.showMessageDialog(this, "Booking Confirmed!"));

        JButton btnBack = StyleUtils.createStyledButton("Back to Home", StyleUtils.PRIMARY_COLOR);
        btnBack.setActionCommand("Home");
        btnBack.addActionListener(navigationListener);

        formPanel.add(btnBack);
        formPanel.add(btnSubmit);

        add(formPanel, BorderLayout.CENTER);
    }
}