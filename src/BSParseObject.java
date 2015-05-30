/**
 * The BSParseObject class represents an object of the ArrayList in the BSParse
 * class.
 */
public class BSParseObject {

	private String code;       //geBLC code letter
	private String classReq;   //class subject requirement
	private String creditReq;  //credit number requirement
	private String type;       //type of geBLC code letter
	private String numClasses; //number of classes needed
	
	/**
	 * Constructs a BSParse object with the given information.
	 * 
	 * @param code The geBLC code letter.
	 * @param classReq The class subject requirement.
	 * @param creditReq The credit number requirement.
	 * @param type The type of geBLC code letter.
	 * @param numClasses The number of classes needed.
	 */
	public BSParseObject (String code, String classReq,
			String creditReq, String type, String numClasses){
		this.code = code;
		this.classReq = classReq;
		this.creditReq = creditReq;
		this.type = type;
		this.numClasses = numClasses;
	}
	
	/**
     * Returns the geBLC code letter.
     * Throws a NullPointerException if element does not exist.
     * 
     * @return The geBLC code letter.
     * @throws NullPointerException if element does not exist.
     */
	public String getCode() throws NullPointerException {
		if (code.equals("na")) 
    		throw new NullPointerException();
		return code;
	}
	
	/**
     * Returns the class subject requirement.
     * Throws a NullPointerException if element does not exist.
     * 
     * @return The class subject requirement.
     * @throws NullPointerException if element does not exist.
     */
	public String getClassReq() throws NullPointerException {
		if (classReq.equals("na")) 
    		throw new NullPointerException();
		return classReq;
	}
	
	/**
     * Returns the credit number requirement.
     * Throws a NullPointerException if element does not exist.
     * 
     * @return The credit number requirement.
     * @throws NullPointerException if element does not exist.
     */
	public String getCreditReq() throws NullPointerException {
		if (creditReq.equals("na")) 
    		throw new NullPointerException();
		return creditReq;
	}
	
	/**
     * Returns the type of geBLC code letter.
     * Throws a NullPointerException if element does not exist.
     * 
     * @return The type of geBLC code letter.
     * @throws NullPointerException if element does not exist.
     */
	public String getType() throws NullPointerException {
		if (type.equals("na")) 
    		throw new NullPointerException();
		return type;
	}
	
	/**
     * Returns the number of classes needed.
     * Throws a NullPointerException if element does not exist.
     * 
     * @return The number of classes needed.
     * @throws NullPointerException if element does not exist.
     */
	public String getNumClasses() throws NullPointerException {
		if (numClasses.equals("na")) 
    		throw new NullPointerException();
		return numClasses;
	}
}