package CW1;
//import java.util.ArrayList; 

public class Competitor {
	
	private String name, email, category;
	private int competitorID, DoB, level, age;
	// private ArrayList<score> scores;
	int[] score= new int[3];
	
	 public Competitor() {
		
	}
//ki hoilo

	public Competitor(String name, int competitorID, int level) {
		//super();
		this.name = name;
		this.competitorID = competitorID;
		this.level = level;
	}
	
	 
 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCompetitorID() {
		return competitorID;
	}
	public void setCompetitorID(int competitorID) {
		this.competitorID = competitorID;
	}
	public int getDoB() {
		return DoB;
	}
	public void setDoB(int doB) {
		DoB = doB;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getOverAllScore() {
		double sum=0;
		for (int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		//return sum;
		double avg= sum/score.length;
	    return avg;
	}    
	//public double getOverallScore() { 
		//return 5; 
	//}
	
	public int[] getScoreArray() {
		 return score;
	 }
	
	public String getFullDetails(int ID, String name, int age, double score, int level, String email, String category, String arr) {
		return String.format("Competitor number:%d, category:%s name:%s, email:%s. \n %s is a level %d aged %d and was given score:%s and has a overall score of %.1f.", ID, category, name, email, name,level, age,arr, score );
	}
	public String getShortDetails(int ID, String name, double overallscore) {
		return String.format("CN %d (%s) has overall score %.1f" , ID, getInitials(name), overallscore);
	}
	 public static int calculateTotalScore(int tennis, int iceSkate, int athletics, int electronicGame) {
	       
	        return tennis+ iceSkate+athletics+electronicGame;
	    }
	public static String getInitials(String fullName) {
		int idxLastWhitespace = fullName.lastIndexOf(' ');
        return fullName.charAt(0) + fullName.substring(idxLastWhitespace + 1, idxLastWhitespace + 2);
    }  
}
