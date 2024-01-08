package CW1;

import Model.Competitor;

public class Score extends Competitor {
	/* public static int calculateTotalScore(int tennis, int iceSkate, int athletics, int electronicGame) {
	       
	        return tennis+ iceSkate+athletics+electronicGame;
	    }
	*/
	 public int[] getScoreArray() {
		 return score;
	 }
	 
	 public double getOverAllScore() {
			double sum=0;
			for (int i=0; i<score.length; i++) {
				sum+=score[i];
			}
			
			double avg= sum/score.length;
		    return avg;
		}    
		
		
}
