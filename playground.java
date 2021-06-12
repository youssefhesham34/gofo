package gofo;

import java.util.ArrayList;

/**
 *  
 * @author menna lashin
 *	class user that initialize basic attributes for playground 
 *	class contain methods (addhour(),deletehours(),displayavailableHours(,isReserved())
 */

public class playground {
	ArrayList<Integer> availableHours = new ArrayList<Integer>();
	private double price;
	private double size;
	private String Name;
	private boolean reserved; 
	static private int id = 0;
	
	/**
	 * constructor set reserved = 0 and increment id by 1
	 */
	playground(){
		setReserved(false);
		size = price = 0;
		setId(getId() + 1);
	}
	
	/**
	 * parameter constructor to set all basic attributes (name,size,price)
	 * @param Name
	 * @param size
	 * @param price
	 */
	playground(String Name, double size,double price){
		this.price = price;
		this.Name = Name;
		this.size = size;
		setId(getId() + 1);
	}
	/**
	 * getter for price per hour
	 * @return price per hour
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * setter for price per hour
	 * @param price per hour
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * getter for name playground
	 * @return name playground
	 */
	public String getName() {
		return Name;
	}
	/**
	 * setter for name playground
	 * @param price name playground
	 */
	public void setName(String Name) {
		this.Name = Name;
	}
	/**
	 * getter for size of playground
	 * @return name size of playground
	 */
	public double getSize() {
		return size;
	}
	/**
	 * setter for size of playground
	 * @param price size of playground
	 */
	public void setSize(double size) {
		this.size = size;
	}
	/**
	 * method for add hour to availableHours list 
	 * @param hour
	 */
	public void addhour(int hour) {
		availableHours.add(hour);
	}
	/**
	 * method for display available Hours that has not booked yet (stored in availableHours list)
	 */
	public void displayavailableHours() {
		for(int i=0; i<availableHours.size(); i++) {
			System.out.print(availableHours.get(i) + " ");
		}
	}
	/**
	 * method for delete Hour that player want to book (stored in availableHours list)
	 * @param hour
	 */
	public void deletehours(int hour) {
		for(int i=0; i<availableHours.size(); i++) {
			if(availableHours.get(i) == hour) {
				availableHours.remove(i);
			}
		}
	}
	
	/**
	 * return true if playground is booked, false otherwise 
	 * @return reserved
	 */
	public boolean isReserved() {
		return reserved;
	}
	/**
	 * setter for reserved
	 * @param reserved
	 */
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	/**
	 * getter for id
	 * @return
	 */
	public static int getId() {
		return id;
	}
	/**
	 * setter for id
	 * @param id
	 */
	public static void setId(int id) {
		playground.id = id;
	}
	
	@Override
	public String toString() {
		return  "playground name is : "+ Name +"\nplayground id is : "+ id + "\nplayground name is : " + size + "\nprice per hour :" + price;
	}

	
	
}
