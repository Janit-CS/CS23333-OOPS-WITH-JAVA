import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TravelPackagesPage extends JPanel {
    public TravelPackagesPage(ActionListener navigationListener) {
        setLayout(new BorderLayout());
        setBackground(StyleUtils.BACKGROUND_COLOR);

        // Title
        JLabel title = StyleUtils.createTitleLabel("<html><h1>Travel Packages</h1><p>Explore our exclusive packages.</p></html>");
        add(title, BorderLayout.NORTH);

        // Travel Package Information
        JPanel packagesPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        packagesPanel.setBackground(StyleUtils.BACKGROUND_COLOR);
        String[] packages = {"Paris Getaway", "Swiss Alps Adventure", "Goa Retreat"};
        String[] details = {"5 Days - ₹102000", "7 Days - ₹152000", "4 Days - ₹76000"};

        for (int i = 0; i < packages.length; i++) {
            JPanel packagePanel = new JPanel(new BorderLayout());
            packagePanel.setBackground(Color.WHITE);
            packagePanel.setBorder(BorderFactory.createLineBorder(StyleUtils.SECONDARY_COLOR));

            JLabel packageLabel = new JLabel("<html><center>" + packages[i] + "<br>" + details[i] + "</center></html>", JLabel.CENTER);
            packageLabel.setFont(StyleUtils.SUBTITLE_FONT);
            packageLabel.setForeground(StyleUtils.TEXT_COLOR);

            JButton btnBook = StyleUtils.createStyledButton("Book Now", StyleUtils.SECONDARY_COLOR);
            btnBook.setActionCommand("BookingForm"); // Set the ActionCommand to open BookingFormPage
            btnBook.addActionListener(navigationListener);

            packagePanel.add(packageLabel, BorderLayout.CENTER);
            packagePanel.add(btnBook, BorderLayout.SOUTH);
            packagesPanel.add(packagePanel);
        }

        add(packagesPanel, BorderLayout.CENTER);

        // Back Button
        JButton btnBack = StyleUtils.createStyledButton("Back to Home", StyleUtils.PRIMARY_COLOR);
        btnBack.setActionCommand("Home");
        btnBack.addActionListener(navigationListener);

        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        backPanel.setBackground(StyleUtils.BACKGROUND_COLOR);
        backPanel.add(btnBack);

        add(backPanel, BorderLayout.SOUTH);
    }
}