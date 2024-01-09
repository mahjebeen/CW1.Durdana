package Model;


import java.util.ArrayList;


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



