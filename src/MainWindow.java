import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow {

    public JFrame mainWindowFrame;
    public static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private String pass;

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
        f.setLocation((int) ((screenSize.getWidth() - f.getWidth()) / 2), (int) ((screenSize.getHeight() - f.getHeight()) / 2));
        f.setVisible(true);

        return null;
    }

}