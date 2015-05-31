import java.util.*;
import java.io.*;

/**
 * The BSParse class parses the BS text file appropiately to be implemented in
 * the main file.
 */
public class BSParse {
	
	private Scanner scanner;                    //scanner of file
	private ArrayList<BSParseObject> arrayList; //ArrayList of requirements
	
	public BSParse(String fileName) throws FileNotFoundException {
		scanner = new Scanner(new File(fileName));
		arrayList = new ArrayList<BSParseObject>();
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] elements = line.split("\\\\");
			BSParseObject temp = new BSParseObject(elements[0], elements[1],
					elements[2], elements[3], elements[4]);
			arrayList.add(temp);
		}
	}
	
	/**
     * Returns the ArrayList of requirements.
     * 
     * @return The ArrayList of requirements.
     */
	public ArrayList<BSParseObject> getRequirements() {
		return arrayList;
	}
}