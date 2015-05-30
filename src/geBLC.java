import java.util.*;
//This is a test commit- Andrew Nguyen
/**
 * The geBLC class represents a single class that keeps track of its
 * title and geBLC code in terms of its components.
 */
public class geBLC {
	
	private String name;   //The name of the class
	private String geBLC;  //The geBLC code

	/**
     * Constructs a class with the given title and geBLC code.
     * 
     * @param name The name of this class.
     * @param geBLC The geBLC code of this class.
     */
    public geBLC(String name, String geBLC) {
        this.name = name;
        this.geBLC = geBLC;
    }
    
    /**
     * Returns the name of this class.
     * 
     * @return The name of this class.
     */
    public String getName() {
    	return name;
    }
    
    /**
     * Returns the geBLC code of this class.
     * 
     * @return The geBLC code of this class.
     */
    public String getGeBLC() {
    	return geBLC;
    }
    
    /**
     * Returns the General Education component of the geBLC code of this class.
     * Throws a NullPointerException if component does not exist.
     * 
     * @return The General Education component of the geBLC code of this class.
     * @throws NullPointerException if component does not exist.
     */
    public String getGenEd() throws NullPointerException {
    	String genEd = geBLC.substring(0,1);
    	if (genEd.equals("-")) 
    		throw new NullPointerException();
    	return genEd;
    }
    
    /**
     * Returns the Breadth component of the geBLC code of this class.
     * Throws a NullPointerException if component does not exist.
     * 
     * @return The Breadth component of the geBLC code of this class.
     * @throws NullPointerException if component does not exist.
     */
    public String getBreadth() throws NullPointerException {
    	String breadth = geBLC.substring(1,2);
    	if (breadth.equals("-")) 
    		throw new NullPointerException();
    	return breadth;
    }
    
    /**
     * Returns the Level component of the geBLC code of this class.
     * Throws a NullPointerException if component does not exist.
     * 
     * @return The Level component of the geBLC code of this class.
     * @throws NullPointerException if component does not exist.
     */
    public String getLevel() throws NullPointerException {
    	String level = geBLC.substring(2,3);
    	if (level.equals("-")) 
    		throw new NullPointerException();
    	return level;
    }
    
    /**
     * Returns the Credit component of the geBLC code of this class.
     * Throws a NullPointerException if component does not exist.
     * 
     * @return The Credit component of the geBLC code of this class.
     * @throws NullPointerException if component does not exist.
     */
    public String getCredit() throws NullPointerException {
    	String credit = geBLC.substring(3,4);
    	if (credit.equals("-")) 
    		throw new NullPointerException();
    	return credit;
    }
}