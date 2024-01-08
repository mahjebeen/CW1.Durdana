package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
import java.util.Scanner;

import CW1.Score;
import Controller.Manager;

public class CompetitorList extends Competitor {
	public static int totalScore;
	public static double averageScore;

	 ArrayList<Competitor> competitors = new ArrayList<>();
	
	/*public  void CompetitorStatus() {
		try{
			FileReader fr = new FileReader("/Users/Dana/Downloads/RunCompetitor.csv");
			BufferedReader br = new BufferedReader(fr);
		
			System.out.printf("-----------------competition-----------------%n");
			double highestAverageScore = Double.MIN_VALUE;
			
			Competitor highestScoringStudent = null;
			
			while (br.ready()) {
				
				String line= br.readLine();
			
             String[] columns = line.split(",");
            for (String column : columns) {
                System.out.print(column + " "); 
            }
            System.out.println();
      
            int id =  Integer.parseInt(columns[0]);
            String name = columns[1] ;
            int age = Integer.parseInt(columns[2]);
            String gender = columns[3];
            String country = columns[4];

            int iceSkate = Integer.parseInt(columns[5]);
            int tennis = Integer.parseInt(columns[6]);
            int athletics = Integer.parseInt(columns[7]);
            int electronicGame = Integer.parseInt(columns[8]);
            Competitor com= new Competitor( name, country, gender, id, age);
            
            competitors.add(com);
            
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age +
                    ", Gender: " + gender + ", Country: " + country +
                    ", IceSkate: " + iceSkate + ", Tennis: " + tennis + ", Athletics: " + athletics +", Electronic Game: "+ electronicGame);

           
            totalScore = Score.calculateTotalScore(tennis,iceSkate,athletics,electronicGame);
            System.out.println("Total Score for " + name + ": " + totalScore);
            averageScore= totalScore/4.0;
            System.out.println("Average Score for " + name + ": " + averageScore) ;
            
            if (averageScore > highestAverageScore) {
                highestAverageScore = averageScore;
               highestScoringStudent= com;
            }
            System.out.println();
           
			} 
		
           System.out.println("Highest Average Score: " + highestAverageScore);
           System.out.println();

          
        
			br.close();
			
			}catch(Exception e){
			
			System.out.println("Something went wrong");
			
			System.out.println(e.getMessage());
			}  
	}*/
	 public  void CompetitorStatus() {
	 }
	 
	 public void displayCompetitorDetails(int competitorNumber) {
		 Competitor selectedCompetitor = null;
         for (Competitor competitor : competitors) {
             if (competitor.getCompetitorID() == competitorNumber) {
                 selectedCompetitor = competitor;
                 break;
             }
         }
        
         if (selectedCompetitor != null) 
         {
             System.out.println("Selected Competitor's Short Details:");
             System.out.println(selectedCompetitor.getShortDetails(competitorNumber) );
             System.out.println();

             // Add other details if needed
         } else {
             System.out.println("Invalid competitor number. No details found.");
         } 
	 }
	
	
		
		
		        public void displayCompetitorDetailsLarge(int competitorNumber) {
		        Competitor selectedCompetitor = null;
         for (Competitor competitor : competitors) {
             if (competitor.getCompetitorID() == competitorNumber) {
                 selectedCompetitor = competitor;
                 break;
             }
         }
		
         if (selectedCompetitor != null) 
         {
             System.out.println("Selected Competitor's Full Details:");
             System.out.println(selectedCompetitor.getFullDetails(competitorNumber) );
            
             // Add other details if needed
         } else {
             System.out.println("Invalid competitor number. No details found.");
         } 
	 }
	 
	
}

