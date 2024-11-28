import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HomePage extends JPanel {
    public HomePage(ActionListener navigationListener) {
        setLayout(new BorderLayout());
        setBackground(StyleUtils.BACKGROUND_COLOR);

        // Title and Welcome Message
        JLabel title = StyleUtils.createTitleLabel("<html><h1>Welcome to Journify!</h1></html>");
        JLabel welcomeMessage = new JLabel("<html><p>Discover amazing travel experiences...</p></html>", JLabel.CENTER);
        welcomeMessage.setFont(StyleUtils.SUBTITLE_FONT);
        welcomeMessage.setForeground(StyleUtils.TEXT_COLOR);

        JPanel welcomePanel = new JPanel(new GridLayout(2, 1));
        welcomePanel.setBackground(StyleUtils.BACKGROUND_COLOR);
        welcomePanel.add(title);
        welcomePanel.add(welcomeMessage);

        add(welcomePanel, BorderLayout.NORTH);

        // Featured Destinations with Full-Box Images
        JPanel featuredPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        featuredPanel.setBackground(StyleUtils.BACKGROUND_COLOR);

        // Destination information
        String[] destinations = {"Paris", "Switzerland", "Goa", "Egypt"};
        String[] descriptions = {
                "<html><center>Paris<br>The city of love and lights.</center></html>",
                "<html><center>Switzerland<br>Land of scenic Alps and serenity.</center></html>",
                "<html><center>Goa<br>Beach paradise of India.</center></html>",
                "<html><center>Egypt<br>Land of ancient wonders.</center></html>"
        };
        String[] imagePaths = {
                "src/images/paris.jpg",
                "src/images/switzerland.jpg",
                "src/images/goa.jpg",
                "src/images/egypt.jpg"
        };

        // Adding destinations to the panel
        for (int i = 0; i < destinations.length; i++) {
            JPanel destinationPanel = new JPanel(new BorderLayout());
            destinationPanel.setBackground(Color.WHITE);
            destinationPanel.setBorder(BorderFactory.createLineBorder(StyleUtils.SECONDARY_COLOR));

            // Load and set full-box image
            FullBoxImageLabel imageLabel = new FullBoxImageLabel(new ImageIcon(imagePaths[i]));
            destinationPanel.add(imageLabel, BorderLayout.CENTER);

            JLabel destinationLabel = new JLabel(descriptions[i], JLabel.CENTER);
            destinationLabel.setFont(StyleUtils.SUBTITLE_FONT);
            destinationLabel.setForeground(StyleUtils.TEXT_COLOR);
            destinationPanel.add(destinationLabel, BorderLayout.SOUTH);

            featuredPanel.add(destinationPanel);
        }

        add(featuredPanel, BorderLayout.CENTER);

        // Navigation Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));
        buttonPanel.setBackground(StyleUtils.BACKGROUND_COLOR);

        JButton btnTravelPackages = StyleUtils.createStyledButton("Travel Packages", StyleUtils.PRIMARY_COLOR);
        JButton btnHotelsPlaces = StyleUtils.createStyledButton("Hotels & Places", StyleUtils.PRIMARY_COLOR);
        JButton btnAboutUs = StyleUtils.createStyledButton("About Us", StyleUtils.PRIMARY_COLOR);
        JButton btnBookingForm = StyleUtils.createStyledButton("Booking Form", StyleUtils.SECONDARY_COLOR);
        JButton btnLogout = StyleUtils.createStyledButton("Logout", Color.RED);

        btnTravelPackages.setActionCommand("TravelPackages");
        btnHotelsPlaces.setActionCommand("HotelsPlaces");
        btnAboutUs.setActionCommand("AboutUs");
        btnBookingForm.setActionCommand("BookingForm");
        btnLogout.setActionCommand("Logout");

        btnTravelPackages.addActionListener(navigationListener);
        btnHotelsPlaces.addActionListener(navigationListener);
        btnAboutUs.addActionListener(navigationListener);
        btnBookingForm.addActionListener(navigationListener);
        btnLogout.addActionListener(navigationListener);

        buttonPanel.add(btnTravelPackages);
        buttonPanel.add(btnHotelsPlaces);
        buttonPanel.add(btnAboutUs);
        buttonPanel.add(btnBookingForm);
        buttonPanel.add(btnLogout);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    // Custom JLabel to make the image fill the entire label box
    private class FullBoxImageLabel extends JLabel {
        private Image image;

        public FullBoxImageLabel(ImageIcon icon) {
            this.image = icon.getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null) {
                int width = getWidth();
                int height = getHeight();
                // Draw the image scaled to fit the entire label size
                g.drawImage(image, 0, 0, width, height, this);
            }
        }
    }
}