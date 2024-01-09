package Model;
public abstract class Competitor {
	
	private String name, category, country, gender;
	private int  competitorID, age;
	
	int[] score= new int[3];
	
	
	public Competitor() {
		
	}
	 


	public Competitor(String name, String country, String gender, int competitorID, int age) {
		this.name = name;
		this.country = country;
		this.gender = gender;
		this.competitorID = competitorID;
		this.age = age;
	}
	public  double getOverallScore()
	{
		return 5;
	}
	public abstract void setScore(int[] score) ;
	 
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
	 public int[] getScore() {
			return score;
		}


	public String getFullDetails() {
	    System.out.println();
		return "Competitor number: " + competitorID + ", name: " + getName() +
	           ".\n" + getName() + " is aged " + age + ", gender: " + gender +
	           " from " + getCountry() + " and has an overall score of " +
	           String.format("%.2f",getOverallScore()) + ".";
	}

	public String getShortDetails() {
	    return "CN: " + competitorID + " (" + Name.getInitials(name) + ") has an overall score " + String.format("%.2f", getOverallScore()) + ".";
	}

	public static int calculateTotalScore(int l1, int l2, int l3, int l4) {
	       
        return l1+l2+l3+l4;
    }
	
}
