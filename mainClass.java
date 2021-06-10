package gofo;

import java.util.Scanner;
/**
 * main class to test all methods we created and validate them 
 * @author youssef hesham
 *
 */
public class mainClass {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Registration r = new Registration();
		player Player = null;
		owner Owner = null;
		while(true) {
		System.out.print("(press 1 or 2)\n 1- register \n 2- login \n 3- exit \n");
		int choice = input.nextInt();
		int choice1 = 0,ch =0 ,log = 0,choice3 = 0, ch1 = 0;
		if(choice == 1) {
			System.out.print("(press 1 or 2)\n 1- register for player \n 2- register for owner\n");
			 choice1 = input.nextInt();
			 System.out.print("enter your email : "); String email = input.next();
			 System.out.print("enter your password : "); String password = input.next();
			 System.out.print("enter your name : "); String name = input.next();
			 System.out.print("enter your location : "); String location = input.next();
			 System.out.print("enter your id : "); int id = input.nextInt();
			 System.out.print("enter your phone : "); int phone = input.nextInt();
			if(choice1 == 1) {
				 Player = new player(name, id, phone, email, password, location); 
				r.registerforplayer(Player);
			}
			else if(choice1 == 2) {
				 Owner = new owner(name, id, phone, email, password, location); 
				r.registerforowner(Owner);
			}
			System.out.print("login to enter to your dashboard\n");
			System.out.print("enter your email : "); String name1 = input.next(); 
			System.out.print("enter your password : "); String pass1 = input.next();
			log = r.login(name1, pass1);
			ch = r.PlayerOrOwner(name1, pass1);
		}
		else if(choice == 2) {
			System.out.print("login to enter to your dashboard\n");
			System.out.print("enter your email : "); String name = input.next(); 
			System.out.print("enter your password : "); String pass = input.next();
			log = r.login(name, pass);
			ch = r.PlayerOrOwner(name, pass);
		}
		else {break;}
		if(ch == 2) {
			while(true) {
				System.out.print("\nthis dashboard for owners\n 1-add playground\n 2-display all your playgrounds\n 3-display your unbooked playgrounds\n 4-exit\n");
				choice3 = input.nextInt();
				if(choice3 == 1) {
					System.out.print("enter your playground name : "); String Name = input.next(); 
					System.out.print("enter your playground size : "); double size = input.nextDouble();
					System.out.print("enter your playground price : "); double price = input.nextDouble();
					playground g = new playground(Name,size,price);
					while(true) {
						System.out.print("enter avaliable hour for this play ground (dates) : ");
						int time = input.nextInt();
						g.addhour(time);
						System.out.print("do you want add another avaliable hour ? : enter yes or no : ");
						String r1 = input.next();
						if(r1.equalsIgnoreCase("no")) {
							break;
						}
					}
					Registration.owners.get(log).addplayground(g);
				}
				else if(choice3 == 2) {
				Registration.owners.get(log).displayplaygrounds();
				}
				else if(choice3 == 3) {
					Registration.owners.get(log).notBookingPlayGrounds();
				}
				else {break;}
			}
		}
		
		else if(ch == 1) {
			while(true) {
				System.out.print(" 1- booking playground\n 2-display all playgrounds\n 3-display your unbooked playgrounds\n 4-exit");
				ch1 = input.nextInt(); 
				if(ch1 == 1) {
					Registration.players.get(log).booking();
				}
				else if(ch1 == 2) {
					r.allplaygrounds();
				}
				else if(ch1 == 3) {
					r.allnotBookingPlayGrounds();
				}
				else {
					break;
				}
			}
		}
		
	}
}}
