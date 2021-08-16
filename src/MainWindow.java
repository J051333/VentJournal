import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.*;

/** Main window class. Houses login logic and controls the central window. */
public class MainWindow {

    /** Display Variables. */
    public JFrame mainWindowFrame;
    public static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();

    /** Encryption Variables. */
    private String pass;

    /** Data Management Variables. */
    private ArrayList<Entry> entries;
    public final String entryFileSubStr = "entry-";
    public final String infoFileStr = "info.vj";
    public final File entryDir = new File("./entries");

    /** Default no-args constructor. */
    public MainWindow() {
        mainWindowFrame = new JFrame("Virtual Journal");
        mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        checkSignUp();
    }

    /** Main method. */
    public static void main(String[] args) {
        new MainWindow();
    }

    public void checkSignUp() {
        try {
            Path path = Paths.get(entryDir.toString());
            Files.createDirectory(path);
            login();
        } catch (FileAlreadyExistsException e) {
            login();
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    // make secure later
    /** Getter method for <code>pass</code>. */
    public String getPass() {
        return pass;
    }

    /**
     * Spawns a window and sets <code>pass</code> to entered password.
     */
    private void login() {
        // Initialization
        JFrame f = new JFrame("Security Check");
        JPanel p = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JPasswordField pwf = new JPasswordField(20);
        JLabel text = new JLabel("Password:");
        JButton done = new JButton("Done");

        // Text Config
        text.setHorizontalAlignment(JLabel.CENTER);

        // Button Config
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!String.valueOf(pwf.getPassword()).isEmpty()) {
                    pass = String.valueOf(pwf.getPassword());

                    f.dispose();
                }
            }
        });

        // Panel Config
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(5, 5, 2, 5);
        p.add(text, c);

        c.gridx = 2;
        c.gridy = 1;
        c.insets = new Insets(2, 5, 2, 5);
        p.add(pwf, c);

        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(5, 5, 5, 5);
        p.add(done, c);

        // Frame Configuration
        f.add(p);
        f.pack();
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocation((int) ((SCREEN_SIZE.getWidth() - f.getWidth()) / 2), (int) ((SCREEN_SIZE.getHeight() - f.getHeight()) / 2));
        f.setVisible(true);
    }

}