import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JournifyApp extends JFrame implements ActionListener {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public JournifyApp() {
        setTitle("Journify - Live The Journey");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize CardLayout for switching pages
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Create and add pages to the CardLayout
        mainPanel.add(new LoginPage(this), "Login");
        mainPanel.add(new RegisterPage(this), "Register");
        mainPanel.add(new HomePage(this), "Home");
        mainPanel.add(new TravelPackagesPage(this), "TravelPackages");
        mainPanel.add(new HotelsPlacesPage(this), "HotelsPlaces");
        mainPanel.add(new AboutUsPage(this), "AboutUs");
        mainPanel.add(new BookingFormPage(this), "BookingForm");

        // Show the login page first
        cardLayout.show(mainPanel, "Login");

        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Login")) {
            cardLayout.show(mainPanel, "Home");
        } else if (command.equals("Register")) {
            cardLayout.show(mainPanel, "Register");
        } else if (command.equals("Home")) {
            cardLayout.show(mainPanel, "Home");
        } else if (command.equals("TravelPackages")) {
            cardLayout.show(mainPanel, "TravelPackages");
        } else if (command.equals("HotelsPlaces")) {
            cardLayout.show(mainPanel, "HotelsPlaces");
        } else if (command.equals("AboutUs")) {
            cardLayout.show(mainPanel, "AboutUs");
        } else if (command.equals("BookingForm")) {
            cardLayout.show(mainPanel, "BookingForm"); // Show Booking Form when "Book Now" is clicked
        } else if (command.equals("Logout")) {
            cardLayout.show(mainPanel, "Login");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JournifyApp::new);
    }
}