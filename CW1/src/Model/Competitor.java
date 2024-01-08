package Model;
//import java.util.ArrayList; 

public class Competitor {
	
	private String name, category, country, gender;
	private int  competitorID, age;
	
	int[] score= new int[3];
	
	 public Competitor() {
		
	}
	 


	public Competitor(String name, String country, String gender, int competitorID, int age) {
		//super();
		this.name = name;
		this.country = country;
		this.gender = gender;
		this.competitorID = competitorID;
		this.age = age;
	}



	/*
	 * public Competitor(int competitorID, String name) { super(); this.competitorID
	 * = competitorID; this.name = name; }
	 * 
	 * 
	 * public Competitor(String name, int competitorID, int level) { //super();
	 * this.name = name; this.competitorID = competitorID; this.level = level; }
	 */
	 
 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getFullDetails(int competitorID)
	//(int ID, String name, int age, double score, int level, String email, String category, String arr)
	//after aged (and was given score:%s)
	{
		return String.format("Competitor number:%d, name:%s.\n%s is aged %d, gender: %s from %s and has a overall score of %.2f.", competitorID, getName(), getName(), this.age, this.gender, getCountry(), CompetitorList.averageScore);//score );

		//return String.format("Competitor number:%d, category:%s name:%s, email:%s. \n %s is a level %d aged %d and was given score:%s and has a overall score of %.1f.", competitorID, category, name, email, name,level, age, arr, score );
	}
	public String getShortDetails(int competitorID) {
		//Score sc= new Score();
		
		return String.format("CN %d (%s) has overall score %.2f" , competitorID, Name.getInitials(name), CompetitorList.averageScore);//sc.getOverAllScore());//overAllScore
	}
	
	public static int calculateTotalScore(int tennis, int iceSkate, int athletics, int electronicGame) {
	       
        return tennis+ iceSkate+athletics+electronicGame;
    }
	//int ID, String name, double overallscore
	
	/*public static String getInitials(String fullName) {
		int idxLastWhitespace = fullName.lastIndexOf(' ');
        return fullName.charAt(0) + fullName.substring(idxLastWhitespace + 1, idxLastWhitespace + 2);
    }  */
}
