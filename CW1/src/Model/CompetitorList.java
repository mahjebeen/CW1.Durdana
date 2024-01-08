package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
import java.util.Scanner;
import Controller.*;

public class CompetitorList{
	public static int totalScore;
	public static double averageScore;
	private ArrayList<Competitor> competitors ;
	public CompetitorList()
	{
		competitors = new ArrayList<>();
	}

	 
	 
	 public void addCompetitor(Competitor competitor) {
		 competitors.add(competitor);
	 }
	

	public ArrayList<Competitor> getAllCompetitors()
	{
		return this.competitors;
	}
	
	 
	
}

