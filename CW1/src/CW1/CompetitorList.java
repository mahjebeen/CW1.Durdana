package CW1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class CompetitorList {
	public static int totalScore;
	//private static String line;
	

	private List<Competitor> competitors;
	//private int totalScore;
	
	public CompetitorList() {
		competitors= new ArrayList<>();
		
		
	}
	
	public static void CompetitorStatus() {
		try{
			FileReader fr = new FileReader("/Users/Dana/Downloads/RunCompetitor.csv");
			BufferedReader br = new BufferedReader(fr);
		
			System.out.printf("-----------------competition-----------------%n");
			//System.out.printf("|%-2s|%-5s|%-5s|%-5s|%-5s|%5s| %n", "CN", "NAME", "AGE"," GENDER", "COUNTRY", "SCORES");
			while (br.ready()) {
				
				String line= br.readLine();
			
             String[] columns = line.split(",");
            for (String column : columns) {
                System.out.print(column + " "); 
            }
            System.out.println();
      
            String id = columns[0];
            String name = columns[1] ;
            int age = Integer.parseInt(columns[2]);
            String gender = columns[3];
            String country = columns[4];

            int iceSkate = Integer.parseInt(columns[5]);
            int tennis = Integer.parseInt(columns[6]);
            int athletics = Integer.parseInt(columns[7]);
             int electronicGame = Integer.parseInt(columns[8]);

            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age +
                    ", Gender: " + gender + ", Country: " + country +
                    ", IceSkate: " + iceSkate + ", Tennis: " + tennis + ", Athletics: " + athletics +", Electronic Game: "+ electronicGame);

           
             totalScore = Competitor.calculateTotalScore(tennis,iceSkate,athletics,electronicGame);
            System.out.println("Total Score for " + name + ": " + totalScore);
            System.out.println("Average Score for " + name + ": " + ( totalScore/4.0)) ;

            System.out.println();
        }
           
			br.close();
			}catch(Exception e){
			// exception case
			System.out.println("Something went wrong");
			// print exception
			System.out.println(e.getMessage());
			}
			}
	

	}

