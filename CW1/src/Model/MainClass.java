package Model;


import Controller.*;

public class MainClass {

	public static void main(String[] args) {
		Manager manager = new Manager();
        manager.readFromFile("/Users/Dana/Documents/src/RunCompetitor.csv");
        for(Competitor competitor:manager.getAllCompetitors())
        {
        	System.out.println(competitor.getFullDetails());
        	System.out.println(competitor.getShortDetails());

        }
        

	}
	

}
