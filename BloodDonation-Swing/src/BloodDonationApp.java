import javax.swing.*;

public class BloodDonationApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                BloodDonationForm form = new BloodDonationForm();
                form.setVisible(true);
            }
        });
    }
}