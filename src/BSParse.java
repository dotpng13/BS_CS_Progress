import java.util.*;
import java.io.*;

/**
 * The BSParse class parses the BS text fill appropiately to be implemented in
 * the main file.
 */
public class BSParse {
	
	private Scanner scanner; //scanner of file
	private ArrayList<BSParseObject> arrayList;
	
	public BSParse(String fileName) throws FileNotFoundException {
		scanner = new Scanner(new File(fileName));
		arrayList = new ArrayList<BSParseObject>();
		while (scanner.hasNextLine()) {
			//break down .nextLine()
			//make BSParseObject
			//add BSParseObject to arrayList
		}
	}
	
}