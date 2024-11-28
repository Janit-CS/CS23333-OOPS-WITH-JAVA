import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HotelsPlacesPage extends JPanel {
    public HotelsPlacesPage(ActionListener navigationListener) {
        setLayout(new BorderLayout());
        setBackground(StyleUtils.BACKGROUND_COLOR);

        // Title
        JLabel title = StyleUtils.createTitleLabel("<html><h1>Hotels & Places</h1><p>Discover popular hotels and places to visit.</p></html>");
        add(title, BorderLayout.NORTH);

        // Hotels and Places Information
        JPanel hotelsPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        hotelsPanel.setBackground(StyleUtils.BACKGROUND_COLOR);

        String[] hotels = {"The Ritz, Paris", "Swiss Alps", "Taj Mahal"};
        String[] details = {"5 Stars - Paris", "Scenic Beauty - Switzerland", "7 Wonders - India"};
        for (int i = 0; i < hotels.length; i++) {
            JPanel hotelPanel = new JPanel(new BorderLayout());
            hotelPanel.setBackground(Color.WHITE);
            hotelPanel.setBorder(BorderFactory.createLineBorder(StyleUtils.SECONDARY_COLOR));
            JLabel hotelLabel = new JLabel("<html><center>" + hotels[i] + "<br>" + details[i] + "</center></html>", JLabel.CENTER);
            hotelLabel.setFont(StyleUtils.SUBTITLE_FONT);
            hotelLabel.setForeground(StyleUtils.TEXT_COLOR);
            JButton btnView = StyleUtils.createStyledButton("View Details", StyleUtils.SECONDARY_COLOR);
            btnView.setActionCommand("Hotel" + i);
            btnView.addActionListener(navigationListener);
            hotelPanel.add(hotelLabel, BorderLayout.CENTER);
            hotelPanel.add(btnView, BorderLayout.SOUTH);
            hotelsPanel.add(hotelPanel);
        }

        add(hotelsPanel, BorderLayout.CENTER);

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