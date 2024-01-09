package View;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import Controller.Manager;
import Model.Competitor;

public class GUI extends JFrame {
	
	    private JTextArea textArea;

	    public GUI(ArrayList<Competitor> competitors) {
	        // Set up the frame
	        setTitle("Competitor Information");
	        setSize(800, 600);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create components
	        textArea = new JTextArea();
	        textArea.setEditable(false);

	        // Add components to the frame
	        JScrollPane scrollPane = new JScrollPane(textArea);
	        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	        add(scrollPane, BorderLayout.CENTER);

	        // Display competitor details
	        displayCompetitorDetails(competitors);

	        // Set frame visibility
	        setVisible(true);
	    }

	    private void displayCompetitorDetails(ArrayList<Competitor> competitors) {
	        for (Competitor competitor : competitors) {
	            textArea.append(competitor.getFullDetails() + "\n\n");
	        }
	    }

	    public static void main(String[] args) {
	      
	            Manager manager = new Manager();
	            manager.readFromFile("/Users/Dana/Documents/Assignment/CW1/src/RunCompetitor.csv");

	            // Create GUI with competitor details
	            new GUI(manager.getAllCompetitors());
	      	    }
	}
