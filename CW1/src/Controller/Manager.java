package Controller;
import Model.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import Model.IceSkater;

public class Manager {
	private CompetitorList competitorList;
	public Manager()
	{
		competitorList=new CompetitorList();
	}


	public void readFromFile(String filePath) {
	    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	        String line;
	        br.readLine(); // Skip the header line

	        while ((line = br.readLine()) != null) {
	            String[] columns = line.split(","); // Assuming comma-separated values

	            int ID = Integer.parseInt(columns[0]);
	            String name = columns[1];
	            int age = Integer.parseInt(columns[2]);
	            String gender = columns[3];
	            String country = columns[4];

	            // Extract scores starting from index 5
	            int[] scores = new int[columns.length - 5];
	            for (int i = 0; i < scores.length; i++) {
	                scores[i] = Integer.parseInt(columns[5 + i]);
	            }

	            // Creating an instance of IceSkater as a Competitor
	            Competitor competitor = new IceSkater(name, country, gender, ID, age);
	            competitor.setScore(scores);

	            // Assuming you have a competitorList field in your Manager class
	            competitorList.addCompetitor(competitor);

	            // Displaying full details
	            System.out.println(competitor.getFullDetails());
	        }
	    } catch (Exception e) {
	        System.out.println("Something went wrong");
	        e.printStackTrace();
	    }
	}
	public ArrayList<Competitor> getAllCompetitors()
	{
		return competitorList;
	}



}
