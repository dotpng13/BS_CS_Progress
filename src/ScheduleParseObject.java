/**
 * The ScheduleParseObject class represents an object of the ArrayList in the
 * ScheduleParse class.
 */
public class ScheduleParseObject {

	private String term;    //term when class was taken
	private String classID; //class name
	private String ge;      //Gen Ed type of class
	private String b;       //Breadth type of class
	private String l;       //level of class
	private String c;       //type of credit
	private String cr;      //number of credits from class
	
	/**
	 * Constructs a BSParse object with the given information.
	 * 
	 * @param term The term when class was taken.
	 * @param classID The class name.
	 * @param ge The Gen Ed type of class.
	 * @param b The Breadth type of class.
	 * @param l The level of class.
	 * @param c The type of credit.
	 * @param cr The number of credits from class.
	 */
	public ScheduleParseObject (String term, String classID, String ge,
			String b, String l, String c, String cr) {
		this.term = term;
		this.classID = classID;
		this.ge = ge;
		this.b = b;
		this.l = l;
		this.c = c;
		this.cr = cr;
	}
	
	/**
     * Returns the term when class was taken.
     * 
     * @return The term when class was taken.
     */
	public String getTerm() {
		return term;
	}
	
	/**
     * Returns the class name.
     * 
     * @return The class name.
     */
	public String getClassID() {
		return classID;
	}
	
	/**
     * Returns the geBLC code of the class.
     * 
     * @return The geBLC code of the class.
     */
	public geBLC getGeBLC() {
		String geBLC = ge + b + l + c;
		geBLC temp = new geBLC(classID, geBLC);
		return temp;
	}
	
	/**
     * Returns the number of credits from class.
     * 
     * @return The number of credits from class.
     */
	public int getNumCredits() {
		int intNumCredits = Integer.parseInt(cr);
		return intNumCredits;
	}
}