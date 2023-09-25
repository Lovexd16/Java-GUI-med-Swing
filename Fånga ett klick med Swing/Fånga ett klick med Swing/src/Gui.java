import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridLayout;

public class Gui {

    int score = 0;

    public Gui() {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Du har klickat 0 gånger på knappen!");

        JButton button = new JButton("Klicka på mig!");
        button.addActionListener(e -> {
            score++;
            System.out.println("Klick på knappen: " + score);
            label.setText("Du har klickat " + score + " gånger på knappen!");
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Gui();
    }
}
