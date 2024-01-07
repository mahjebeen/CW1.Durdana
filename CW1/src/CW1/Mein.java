package CW1;

import java.util.Arrays;

public class Mein {
	public class Main {
	    public static void main(String[] args) {
	        //int[] scores= {2,5,4,3,1};
	        Competitor competitor = new Competitor("John Doe", 2589, 5);
	        String getFullDetails = competitor.getFullDetails(2589, "John Doe", 24, competitor.getOverAllScore(), 3,"john34@gmail.com","long jump", Arrays.toString(competitor.getScoreArray()));
            String getShortDetails= competitor.getShortDetails(2589,"John Doe", competitor.getOverAllScore());
	        System.out.println(getFullDetails);
	        System.out.println(getShortDetails);
             
	        IceSkate comp= new IceSkate();
	        System.out.println(comp.getOverAllScore());
	        System.out.println(Arrays.toString(comp.getScoreArray()));
            String details= comp.getFullDetails(5464, "safwat khan choudhury", 25, comp.getOverAllScore(), 3,"john994@gmail.com","high jump", Arrays.toString(comp.getScoreArray()));
            System.out.println(details);
	    }
	}
}
