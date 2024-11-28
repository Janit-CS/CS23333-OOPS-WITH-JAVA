import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AboutUsPage extends JPanel {
    public AboutUsPage(ActionListener navigationListener) {
        setLayout(new BorderLayout());
        setBackground(StyleUtils.BACKGROUND_COLOR);

        // Title and Introductory Text
        JLabel title = StyleUtils.createTitleLabel("<html><h1>About Us</h1><p>Learn more about Journify and our journey.</p></html>");
        add(title, BorderLayout.NORTH);

        // Company Information Section
        JTextArea aboutUsInfo = new JTextArea(
                "Our Story:\n" +
                        "Journify was founded with a mission to make travel planning seamless and enjoyable for everyone.\n\n" +
                        "Our Mission:\n" +
                        "To inspire and empower people to explore the world.\n\n" +
                        "Our Vision:\n" +
                        "To be the go-to platform for travelers seeking authentic experiences.\n\n" +
                        "Our Core Values:\n" +
                        "- Customer Focus\n" +
                        "- Innovation\n" +
                        "- Integrity\n" +
                        "- Passion for Travel\n\n" +
                        "Meet Our Team:\n" +
                        "We are a team of travel enthusiasts dedicated to making your journey memorable."
        );
        aboutUsInfo.setEditable(false);
        aboutUsInfo.setBackground(Color.WHITE);
        aboutUsInfo.setFont(StyleUtils.SUBTITLE_FONT);
        aboutUsInfo.setForeground(StyleUtils.TEXT_COLOR);
        aboutUsInfo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        add(new JScrollPane(aboutUsInfo), BorderLayout.CENTER);

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