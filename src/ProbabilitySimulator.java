import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProbabilitySimulator extends JFrame {
    private JLabel resultLabel;
    private JButton pullButton;

    public ProbabilitySimulator() {
        setTitle("Probability Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        resultLabel = new JLabel("Click 'Pull' to get a character/item!");
        pullButton = new JButton("Pull");

        pullButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform gacha pull
                String[] characters = {"Character A", "Character B", "Character C", "Character D", "Character E"};
                String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

                String result;
                if (Math.random() < 0.5) {
                    // Get a random character
                    int index = (int) (Math.random() * characters.length);
                    result = characters[index];
                } else {
                    // Get a random item
                    int index = (int) (Math.random() * items.length);
                    result = items[index];
                }

                // Update the result label
                resultLabel.setText("You got: " + result);
            }
        });

        add(resultLabel);
        add(pullButton);

        pack();
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
    }
}