package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import Controller.Manager;
import Model.Competitor;

public class GUI {
    private Manager manager;
    private JFrame frame;

    public GUI() {
        manager = new Manager();
        manager.readFromFile("/Users/Dana/Documents/Assignment/CW1/src/RunCompetitor.csv");
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Competitor Information");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create three panels
        JPanel panel1 = createPanel("Read File");
        JPanel panel2 = createPanel("Competitors' Full Details");
        JPanel panel3 = createPanel("View/Alter Scores");

        // Add panels to the frame
        frame.setLayout(new GridLayout(3, 1));
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        frame.setVisible(true);
    }

    private JPanel createPanel(String buttonText) {
        JPanel panel = new JPanel();
        JButton button = new JButton(buttonText);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (buttonText.equals("Read File")) {

                } else if (buttonText.equals("Competitors' Full Details")) {
                    displayDetails(manager.getAllCompetitors());
                } else if (buttonText.equals("View/Alter Scores")) {
                    viewAlterScores();
                }
            }
        });

        panel.add(button);

        return panel;
    }

    private void displayDetails(ArrayList<Competitor> competitors) {
        StringBuilder details = new StringBuilder();

        for (Competitor competitor : competitors) {
            details.append(competitor.getFullDetails()).append("\n\n");
        }

        JTextArea textArea = new JTextArea(details.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);

        JOptionPane.showMessageDialog(frame, scrollPane, "Competitors' Full Details", JOptionPane.PLAIN_MESSAGE);
    }
    

   private void viewAlterScores() {
        String competitorNumberStr = JOptionPane.showInputDialog(frame, "Enter Competitor Number:");
        int competitorNumber = Integer.parseInt(competitorNumberStr);

        Competitor competitor = manager.getCompetitorByNumber(competitorNumber);

        if (competitor != null) {
            String scoresStr = JOptionPane.showInputDialog(frame, "Enter New Scores (comma-separated):");
            String[] scoresArray = scoresStr.split(",");

            // Update competitor scores
            int[] scores = new int[scoresArray.length];
            for (int i = 0; i < scoresArray.length; i++) {
                scores[i] = Integer.parseInt(scoresArray[i]);
            }
            competitor.setScore(scores);

            // Display updated details
            JOptionPane.showMessageDialog(frame, competitor.getShortDetails(), "Competitor Details", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame, "Competitor not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }
}

