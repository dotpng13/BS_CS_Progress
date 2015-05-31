/**
 * The CSParseObject class represents an object of the ArrayList in the CSParse
 * class.
 */
public class CSParseObject {

	private String classID; //class name
	private String type;    //CS requirement type
	
	/**
	 * Constructs a CSParse object with the given information.
	 * 
	 * @param classID The class name.
	 * @param type The CS requirement type.
	 */
	public CSParseObject (String classID, String type){
		this.classID = classID;
		this.type = type;
	}
	
	/**
     * Returns the class name.
     * 
     * @return The class name.
     */
	public String getCode() {
		return classID;
	}
	
	/**
     * Returns the CS requirement type.
     * 
     * @return The CS requirement type.
     */
	public String getClassReq() {
		return type;
	}
}