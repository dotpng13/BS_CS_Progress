import java.util.*;
import java.io.*;

/**
 * The BSParse class parses the BS text file appropiately to be implemented in
 * the main file.
 */
public class CSParse {
	
	private Scanner scanner;                    //scanner of file
	private ArrayList<CSParseObject> arrayList; //ArrayList of requirements
	
	public CSParse(String fileName) throws FileNotFoundException {
		scanner = new Scanner(new File(fileName));
		arrayList = new ArrayList<CSParseObject>();
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] elements = line.split("\\\\");
			CSParseObject temp = new CSParseObject(elements[0], elements[1]);
			arrayList.add(temp);
		}
	}
	
	/**
     * Returns the ArrayList of requirements.
     * 
     * @return The ArrayList of requirements.
     */
	public ArrayList<CSParseObject> getRequirements() {
		return arrayList;
	}
}