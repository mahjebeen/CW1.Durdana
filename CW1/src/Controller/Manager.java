package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import Model.Competitor;

public class Manager extends Competitor {
	public static int totalScore;
	public static double averageScore;
	public void ManagerClass() {
	  ArrayList<Competitor> competitors = new ArrayList<>();
		
	  try {
		   FileReader fr = new FileReader("/Users/Dana/Downloads/RunCompetitor.csv");
		BufferedReader br = new BufferedReader(fr);
		
		double highestAverageScore = Double.MIN_VALUE;
		//Competitor highestScoringStudent = null;
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
       // System.out.println();
       totalScore = Competitor.calculateTotalScore(tennis,iceSkate,athletics,electronicGame);
        System.out.println("Total Score for " + name + ": " + totalScore);
       averageScore = totalScore/4.0;
        System.out.println("Average Score for " + name + ": " + averageScore) ;
        
        if (averageScore > highestAverageScore) {
            highestAverageScore = averageScore;
           //highestScoringStudent= com;
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
		}
	  }
	

