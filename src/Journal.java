import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Journal {

    public JFrame journalingFrame;
    private LocalDateTime rn = LocalDateTime.now();
    private DateTimeFormatter rnFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public Journal() {
        journalingFrame = new JFrame("Virtual Journal • Journal Entry: " + rn.format(rnFormat));

        journalingFrame.setSize(500, 500);
        journalingFrame.setVisible(true);
    }

    /**
     * Will save information in a file named with the date and time. Will be saved in a formatted string encrypted by the user's password.
     * @param savedTime Time saved at.
     */
    private void save(LocalDateTime savedTime) {

    }

}
