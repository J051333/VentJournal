import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainWindow {

    // Display Variables
    public JFrame mainWindowFrame;
    public static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();

    // Encryption Variables
    private String pass;

    // Data Management Variables
    private ArrayList<Entry> entries;

    public MainWindow() {
        mainWindowFrame = new JFrame("Virtual Journal");
        mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        login();
    }

    // make secure later
    public String getPass() {
        return pass;
    }

    private static String login() {
        JFrame f = new JFrame("Password");
        JPanel p = new JPanel();
        JPasswordField pwf = new JPasswordField("Enter your password here");


        f.setSize(500, 200);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocation((int) ((SCREEN_SIZE.getWidth() - f.getWidth()) / 2), (int) ((SCREEN_SIZE.getHeight() - f.getHeight()) / 2));
        f.setVisible(true);

        return null;
    }

}