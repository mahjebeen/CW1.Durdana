package Controller;
import Model.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Manager {
	private ArrayList<Competitor> competitors;
	private CompetitorList competitorList;
	public Manager()
	{
		competitorList=new CompetitorList();
		competitors=competitorList.getAllCompetitors();
	}


	public void readFromFile(String filePath) {
	    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	        String line;
	        br.readLine(); 

	        while ((line = br.readLine()) != null) {
	            String[] columns = line.split(","); 

	            int ID = Integer.parseInt(columns[0]);
	            String name = columns[1];
	            int age = Integer.parseInt(columns[2]);
	            String gender = columns[3];
	            String country = columns[4];

	            int[] scores = new int[columns.length - 5];
	            for (int i = 0; i < scores.length; i++) {
	                scores[i] = Integer.parseInt(columns[5 + i]);
	            }
	            Competitor competitor = new IceSkater(name, country, gender, ID, age);
	            competitor.setScore(scores);

	            competitorList.addCompetitor(competitor);

	          	        }
	    } catch (Exception e) {
	        System.out.println("Something went wrong");
	        e.printStackTrace();
	    }
	}
	public ArrayList<Competitor> getAllCompetitors()
	{
	
		return competitors;
	}



}
