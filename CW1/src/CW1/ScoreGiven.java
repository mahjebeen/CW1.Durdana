package CW1;

public class ScoreGiven {
         private int scoreId, scoreGiven;

		public int getScoreGiven() {
			return scoreGiven;
		}

		public void setScoreGiven(int scoreGiven) {
			this.scoreGiven = scoreGiven;
		} 
		public int overallScore(int i) {
			int score=0;
			for (i=0; i<5; i++)
				score+=i;
			return score;
				
		}
}
