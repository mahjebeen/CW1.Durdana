package Controller;
import Model.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
	
	public void writeToFile(String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // Writing header line
            bw.write("ID,Name,Age,Gender,Country,Score1,Score2,Score3,Score4\n");

            // Writing competitor details
            for (Competitor competitor : competitorList.getAllCompetitors()) {
            	int[] scores = competitor.getScore();
            	bw.write(String.format("%d,%s,%d,%s,%s,%d,%d,%d,%d\n",
                        competitor.getCompetitorID(),
                        competitor.getName(),
                        competitor.getAge(),
                        competitor.getGender(),
                        competitor.getCountry()));
                        for (int i = 0; i < 4; i++) {
                            bw.write("," + (i < scores.length ? scores[i] : 0));
                        }
                        bw.write("\n");
            }

            System.out.println("Competitors' information written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }
	 public Competitor getCompetitorByNumber(int competitorNumber) {
	        for (Competitor competitor : competitors) {
	            if (competitor.getCompetitorID() == competitorNumber) {
	                return competitor;
	            }
	        }
	        return null; // Return null if no competitor with the specified number is found
	    }
	public ArrayList<Competitor> getAllCompetitors()
	{
	
		return competitors;
	}



}