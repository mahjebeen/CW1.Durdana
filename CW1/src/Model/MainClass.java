
package Model;


import Controller.*;

public class MainClass {

	public static void main(String[] args) {
		Manager manager = new Manager();
        manager.readFromFile("/Users/Dana/Documents/Assignment/CW1/src/RunCompetitor.csv");
      

		//IceSkater iceSkater= new IceSkater("josh", "uk", "male", 122, 12);
        for(Competitor competitor:manager.getAllCompetitors())
        {
        	System.out.println(competitor.getFullDetails());
        	System.out.println(competitor.getShortDetails());

        }
        

	}
	

}