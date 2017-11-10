package br.ufc.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParserCsv {
	
	public static void main(String[] args) throws IOException {
	
	 String csvFile = "eps=1.0min_samples=10stops.csv";
     BufferedReader br = null;
     String line = "";
     String cvsSplitBy = ",";
     
     
     try {
    	 
		br = new BufferedReader(new FileReader(csvFile));
		 while ((line = br.readLine()) != null) {
			 
             String[] country = line.split(cvsSplitBy);
             System.out.println("(" + country[2] + "," + country[0] + "," + 
             country[1] +"," + "ST_SETSRID(ST_POINT("
             +  country[1] +  "," + 	
             country[0] + "),4326))," );

		 }
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
