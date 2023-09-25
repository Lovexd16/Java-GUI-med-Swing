import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        
        JFrame frame = new JFrame("Mitt första GUI");
        frame.setSize(400, 300);

        JLabel label = new JLabel("Hello");
        JTextField textField = new JTextField("World");

        JButton button = new JButton("Min knapp");

        JPanel panel = new JPanel();

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
