package Model;

//import java.util.ArrayList;
//import java.util.List;
public class IceSkater extends Competitor{
	/*public IceSkater()
	{
		super()
	}*/
  int[] Ashok= {2,2,2,5};
  
  
  
  public int[] getScoreArray() {
		 return Ashok;
	 }
  public double getOverAllScore() {
		double sum=0;
		for (int i=0; i<Ashok.length; i++) {
			sum+=Ashok[i];
		}
		//return sum;
		double avg= sum/Ashok.length;
	    return avg;
	}  
  public String getFullDetails(int ID, String name, int age, double score, int level, String email, String category, String arr) {
		return String.format("Competitor number:%d, category:%s name:%s, email:%s. \n %s is a level %d aged %d and was given score:%s and has a overall score of %.1f.", ID, category, name, email, name,level, age,arr, score );
	}
}