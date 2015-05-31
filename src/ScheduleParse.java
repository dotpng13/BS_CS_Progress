import java.util.*;
import java.io.*;

/**
 * The ScheduleParse class parses the Schedule text file appropiately to be
 * implemented in the main file.
 */
public class ScheduleParse {
	
	private Scanner scanner;                          //scanner of file
	private ArrayList<ScheduleParseObject> arrayList; //ArrayList of classes
	
	public ScheduleParse(String fileName) throws FileNotFoundException {
		scanner = new Scanner(new File(fileName));
		arrayList = new ArrayList<ScheduleParseObject>();
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] elements = line.split("\\\\");
			ScheduleParseObject temp = new ScheduleParseObject(elements[0],
					elements[1], elements[2], elements[3], elements[4],
					elements[5], elements[6]);
			arrayList.add(temp);
		}
	}
	
	/**
     * Returns the ArrayList of classes.
     * 
     * @return The ArrayList of classes.
     */
	public ArrayList<ScheduleParseObject> getClasses() {
		return arrayList;
	}
}