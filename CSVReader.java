
/**
* The goal of this class is to read from a CSV file and store
* the data inside a 1D array.
*/

import java.io.*;
import java.util.Scanner;

public class CSVReader {

	private String path;
	private String[] myList;

	public CSVReader(String path, int row) {
		this.path = path;
	    this.myList = new String[row];
	}

	public String[] getData() {

	    try {

	    	Scanner sc = new Scanner(new FileReader(path));

	        int lineN = 0; // lineN will keep track of every single line from the CSV Data
	        String[] lineValues;
	        
	        int l=0; // l is used to store store the category section in the first column.
	        
	        while(sc.hasNextLine()) {
	        	String line = sc.nextLine();
	        	lineValues = line.split(",");
	        	
	        	if (l++ == 0) 
	        		continue;

	            myList[lineN] = lineValues[0];
	                                
	            lineN++;
	        }

	    } catch (FileNotFoundException e) {
	        System.err.println(e.getMessage());
	    }

	    	return myList;

	} // end Data()

} // end CSVReader