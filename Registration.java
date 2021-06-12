package gofo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Menna Lashin, Youssef Hesham
 * class for registration player and owner and add them to arrays to manipulate operations on them 
 */
public class Registration {
	static ArrayList<player> players = new ArrayList<player>();
	static ArrayList<owner> owners = new ArrayList<owner>();
	Scanner input= new Scanner(System.in);
	/**
	 * method take object from type player and add it to list (players) we take all information in main class
	 * @param p as player
	 */
	public void registerforplayer(player p) {
			players.add(p);
		System.out.print("\nsuccessful Registration\n\n");
	}
	
	/**
	 *  method take object from type owner and add it to list (owners) we take all information in main class
	 * @param p as owner
	 */
	public void registerforowner(owner p) {
		owners.add(p);	
	System.out.print("\nsuccessful Registration\n\n");
}
	
	/**
	 * this class check will validate if email and password is exist arrays or not (registered before) 
	 * @param email
	 * @param password
	 * @return index for player or owner if exits , else return -1 
	 */
	public int login(String email,String password) {
		for(int i=0; i<players.size(); i++) {
			if(email.equalsIgnoreCase(players.get(i).getEmail()) && password.equalsIgnoreCase(players.get(i).getPassword())) {
				return i;
			}
		}
		
		for(int i=0; i<owners.size(); i++) {
			if(email.equalsIgnoreCase(owners.get(i).getEmail()) && password.equalsIgnoreCase(owners.get(i).getPassword())) {
				return i;			
				}
		}
		return -1;
	}
	
	/**
	 * @param email
	 * @param password 
	 * @return 1 if user is player , 2 if user is owner
	 */
	public int PlayerOrOwner(String email,String password) {
		for(int i=0; i<players.size(); i++) {
			if(email.equalsIgnoreCase(players.get(i).getEmail()) && password.equalsIgnoreCase(players.get(i).getPassword())) {
				return 1;
			}
		}
		
		for(int i=0; i<owners.size(); i++) {
			if(email.equalsIgnoreCase(owners.get(i).getEmail()) && password.equalsIgnoreCase(owners.get(i).getPassword())) {
				return 2;			
				}
		}
		return -1;
	}
	
	/**
	 * display all playground that are added from any owner 
	 */
	public void allplaygrounds() {
		for(int i=0; i<owners.size(); i++) {
			owners.get(i).displayplaygrounds();
		}
	}
	/**
	 * display all not booked playgrounds (There are hours available)  
	 */
	public void allnotBookingPlayGrounds() {
		for(int i=0; i<owners.size(); i++) {
			owners.get(i).notBookingPlayGrounds();
		}
	}
	 /**
	  * search by id for all playground to booking it 
	  * @param id
	  */
	public void searchplaygroungd(int id) {
		for(int i=0; i<owners.size(); i++) {
			owners.get(i).searchbyid(id);
		}
	}

}
