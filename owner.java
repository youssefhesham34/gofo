package gofo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * this class is inherited from class user and take all his attributes 
 * methods in this class manipulate booking playgrounds because each owner have playgrounds
 * @author youssef hesham
 *
 */
public class owner extends User {
	Scanner input= new Scanner(System.in);
	/**
	 *  take all attributes and send them to user class to set them
	 * @param Name
	 * @param id
	 * @param phone
	 * @param email
	 * @param Password
	 * @param location
	 */
	owner(String Name, int id, int phone, String email, String Password, String location) {
		super(Name, id, phone, email, Password, location);
		
	}

	ArrayList<playground> playgrounds = new ArrayList<playground>();
	static int numOfPlaygrounds = 0;
	/**
	 * take object from class playground and add it to its owner 
	 * increment numOfPlaygrounds by one to know how much playgrounds the owner have
	 * @param playGround
	 */
	public void addplayground(playground playGround) {
		playgrounds.add(playGround);
		numOfPlaygrounds++;
	}
	/**
	 * display all playgrounds the owner have and all information related to it
	 */
	public void displayplaygrounds() {
		for(int i=0; i<playgrounds.size(); i++) {
			System.out.println(playgrounds.get(i));
			System.out.println("availableHours :-");
			playgrounds.get(i).displayavailableHours();
			System.out.println("\n");
		}
	}
	
	/**
	 * display all unbooked playgrounds the owner have and all information related to it
	 */
	public void notBookingPlayGrounds() {
		for(int i=0; i<playgrounds.size(); i++) {
			if(playgrounds.get(i).availableHours.size() != 0) {
				System.out.println(playgrounds.get(i));
				System.out.println("availableHours :- ");
				playgrounds.get(i).displayavailableHours();
				System.out.println("\n");
			}
		}
	}
	/**
	 * search by id for all playground to booking it 
	 * if we find the playground, mark it that is booked 
	 * take all time slots the player want to book it and remove it from available Hours
	 * @param s
	 */
	public void searchbyid(int s) {
		int time; String choose;
		for(int i=0; i<playgrounds.size(); i++) {
			playgrounds.get(i);
			if(playground.getId() == s) {
				playgrounds.get(i).setReserved(true);
				System.out.print("\nselect dates that you want to book at (one by one)\n");
				while(true) {
					time = input.nextInt();
					playgrounds.get(i).deletehours(time);
					System.out.print("do you want another hour ? : enter yes or no : ");
					choose = input.next();
					if(choose.equalsIgnoreCase("no")) {
						break;
					}
				}
				System.out.print("\nsuccessful booking\n");
				break;
			}
		}
	}
	
	/**
	 * 
	 * @return numOfPlaygrounds
	 */
	public int getNumOfPlaygrounds() {
		return numOfPlaygrounds;
	}
	
}
