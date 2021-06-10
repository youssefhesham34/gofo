package gofo;

import java.util.Scanner;
/**
 * this class is inherited from class user and take all his attributes 
 * @author youssef hesham
 *
 */
public class player extends User {
	Scanner input= new Scanner(System.in);
	player(){}
	/**
	 * take all attributes and send them to user class to set them
	 * @param Name
	 * @param id
	 * @param phone
	 * @param email
	 * @param Password
	 * @param location
	 */
	player(String Name, int id, int phone, String email, String Password, String location) {
		super(Name, id, phone, email, Password, location);
		
	}
	
	/**
	 * this method that enable player to booking a playground 
	 * this method print all unbooked playgrounds to user to select from them 
	 * user enter id and we search by id to find playground and book it by using methid in registration searchplaygroungd(idplay)
	 */
	public void booking() {
		Registration r = new Registration(); 
		System.out.print("\nthis all playGround that not reserved yet \n");
		r.allnotBookingPlayGrounds();
		System.out.print("please enter playground id that you will book  \n");
		int idplay = input.nextInt();
		r.searchplaygroungd(idplay);		
	}
	
}
