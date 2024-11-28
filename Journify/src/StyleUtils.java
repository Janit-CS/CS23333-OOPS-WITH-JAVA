import javax.swing.*;
import java.awt.*;

public class StyleUtils {
    // Common colors
    public static final Color PRIMARY_COLOR = new Color(33, 150, 243);
    public static final Color SECONDARY_COLOR = new Color(76, 175, 80);
    public static final Color BACKGROUND_COLOR = new Color(240, 240, 240);
    public static final Color TEXT_COLOR = Color.DARK_GRAY;

    // Common fonts
    public static final Font TITLE_FONT = new Font("Arial", Font.BOLD, 24);
    public static final Font SUBTITLE_FONT = new Font("Arial", Font.PLAIN, 18);
    public static final Font BUTTON_FONT = new Font("Arial", Font.BOLD, 16);

    // Styled label
    public static JLabel createTitleLabel(String text) {
        JLabel label = new JLabel(text, JLabel.CENTER);
        label.setFont(TITLE_FONT);
        label.setForeground(TEXT_COLOR);
        return label;
    }

    // Styled button
    public static JButton createStyledButton(String text, Color color) {
        JButton button = new JButton(text);
        button.setFont(BUTTON_FONT);
        button.setBackground(color);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        return button;
    }
}