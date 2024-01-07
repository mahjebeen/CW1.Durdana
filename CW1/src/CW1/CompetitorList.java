package CW1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CompetitorList {
	//private static String line;
	private List<Competitor> competitors;
	public CompetitorList() {
		competitors= new ArrayList<>();
		
		
	}
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("/Users/Dana/Downloads/RunCompetitor.csv");
			BufferedReader br = new BufferedReader(fr);
			String s="";
			
			System.out.printf("-----------------competition-----------------%n");
			System.out.printf("| %-5s | %-10s | %-15s | %-10s| %-10s| %10s %n", "CN", "NAME", "AGE"," GENDER", "COUNTRY", "SCORES");
			while (br.ready()) {
				
				
				String line= br.readLine();
				//line=s.split(",");
				line = line.replaceAll(","," ");
				
				System.out.println(line);
			}
		
			//line.split(",");
			br.close();
			}catch(Exception e){
			// exception case
			System.out.println("Something went wrong");
			// print exception
			System.out.println(e.getMessage());
			}
			}
			

	}

