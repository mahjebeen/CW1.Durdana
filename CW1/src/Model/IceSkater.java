package Model;


public class IceSkater extends Competitor{
	private   int[] scores;
	public IceSkater(String name, String country, String gender, int competitorID, int age) 
	{
		super(name,country,gender,competitorID,age);
		scores=new int[4];
		
	}

  public int[] getScoreArray() {
		 return scores;
	 }
  public void setScore(int[] score) {
	  this.scores=score;
  }
  @Override
  public double getOverallScore() {
		double sum=0;
		for (int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
	
		double avg= sum/scores.length;
	    return avg;
	}  
  public String getFullDetails(int ID, String name, int age, double score, int level, String email, String category, String arr) {
		return String.format("Competitor number:%d, category:%s name:%s, email:%s. \n %s is a level %d aged %d and was given score:%s and has a overall score of %.1f.", ID, category, name, email, name,level, age,arr, score );
	}
}