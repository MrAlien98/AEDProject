package model;
/**
 * This class represents a bombing point(represent a vertex)
 * 
 * 
 * 
 */
public class BombingPoint implements Comparable<BombingPoint>{

	/**
	 * the String name that the class will contain
	 * 
	 * 
	 * 
	 */
	private String name;
	
	
	
	/**
	 * constructor method for the bombingPoint class 
	 * 
	 */
	public BombingPoint(String name) {
		this.name=name;
	}

	
	/**
	 * Method to get the name of the class
	 * @return the String name of the class BombingPoint
	 */
	
	public String getName() {
		return name;
	}

	
	/**
	 * Method to modify the name of the class
	 * @param the new String name that will replace the current name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * Method to return a String with the name of the class
	 * @return the String name of the class BombingPoint
	 */
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(BombingPoint o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
