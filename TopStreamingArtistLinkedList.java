// The List TopStreamingArtists is composed of a series of artist names
// number of appearances and number of times their songs was streamed.

import java.io.*;

public class TopStreamingArtistLinkedList {

	public Artist first;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void sortInsertion(String name) {
		
		Artist newArtist = new Artist(name);
		Artist previous = null;
		Artist current = first;
		
		while(current !=null && (name.compareTo(current.name))>0) {
			previous = current;
			current = current.next;
		}
		
		if (previous == null)
			first = newArtist;
		else
			previous.next = newArtist;
		
		newArtist.next = current;
	}
	
	public void display() throws FileNotFoundException {
		
		String pathOutput = "/Users/alpha/Desktop/eclipse-workspace/SongsProcessing"
				+ "LinkedList/src/Linked List Output.csv";
		
		PrintStream ps = new PrintStream(new File(pathOutput));
		Artist current = first;
		
		ps.println("\t\t\tSorted Artists List \t\t\t");
		
		while (current != null) {
			ps.println(current.name);
			current = current.next;
		}
	}
}
