package gofo;
/**
 * 
 * @author Salma samir
 *	class user that initialize basic attributes for any user 
 */
public class User {
	private String Name;
	private String Password;
	private String location;
	private String email;
	private int id;
	private int phone;
	
	User(){id = 0; phone=0 ; Name= "";}
	/**
	 * parameter constructor to set all basic attributes (name,id,phone,email,password,location)
	 * @param Name
	 * @param id
	 * @param phone
	 * @param email
	 * @param Password
	 * @param location
	 */
	User(String Name,int id,int phone,String email,String Password,String location){
		this.Name = Name;
		this.location = location;
		this.Password = Password;
		this.email = email;
		this.id = id;
		this.phone = phone;
	}
	
	/**
	 * getter for name
	 * @return name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * setter for name
	 * @param Name
	 */
	public void setName(String Name) {
		this.Name = Name;
	}
	/**
	 * getter for location
	 * @return location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * setter for name
	 * @param Name
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * getter for password
	 * @return password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * setter for Password
	 * @param Password
	 */
	public void setPassword(String Password) {
		this.Password = Password;
	}
	/**
	 * getter for email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * setter for email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * getter for id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * setter for id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * getter for phone
	 * @return phone
	 */
	public int getPhone() {
		return phone;
	}
	/**
	 * setter for phone
	 * @param phone
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}
