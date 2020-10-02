import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		String path = "/Users/alpha/Desktop/eclipse-workspace/SongsProcessing"+
						"LinkedList/src/Artists-Daily08312020.csv";
		int row = 133; // row is the number row inside the path file
		
		// Instantiation of a CSVReader object below
		CSVReader csv = new CSVReader(path, row);
		
		//The below array contains all the artist name
		
		String[] artistArr = new String[row];
		
		artistArr = csv.getData();
		
		// Now, we are going to insert the unordered artist name from
		// the 'artistArr' into a sorted linked list 'myList'
		
		TopStreamingArtistLinkedList myList = new TopStreamingArtistLinkedList();
		
		for (String val: artistArr)       // This loop inserts the artists' name
			myList.sortInsertion(val);    // into the linked list
		
		myList.display();
		
	} // end main
}
	
	