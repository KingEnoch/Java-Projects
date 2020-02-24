
//This is my first FOOP Assignment issued at the year
//This program is designed to simulate a simple Registration System to take in the user details
//The operator will be instructed to enter their following information such as: Name/UserName, Password, Location and E-mail
//
package regSystem;
import java.util.Scanner;

public class Assignment1 {//start outer class
	static Scanner input= new Scanner(System.in);
	public static class Registrar {//start inner class
		//Global Variables
		private String memberName_1;
		private String user_Location;
		private String userEmail_Address;
		private int memberPassword;
		
		//*************************** CONSTRUCTORS ******************************\\
		public Registrar() {}//This is an empty constructor
		
		//Constructor with three parameters
		public Registrar(String memberName_1, String user_Location, String userEmail_Address, int memberPassword) {//start constructor
			this.memberName_1=memberName_1;
			this.user_Location=user_Location;
			this.userEmail_Address=userEmail_Address;
			this.memberPassword=memberPassword;
			
		}//end constructor

		//************************** GET/SET METHODS ******************************\\
		public String getMemberName_1() {//start getMemberName_1
			return memberName_1;
		}//end getMemberName_1

		public String getUser_Location() {//start getUser_Location
			return user_Location;
		}//end getUser_Location

		public String getUserEmail_Address() {//start getUserEmail_Address
			return userEmail_Address;
		}//end getUserEmail_Address

		public int getMemberPassword() {//start getMemberPassword
			return memberPassword;
		}//end getMemberPasswrd

		public void setMemberName_1(String memberName_1) {//start setMemberName
			this.memberName_1 = memberName_1;
		}//end setMemberName_1

		public void setUser_Location(String user_Location) {//start setUser_Location
			this.user_Location = user_Location;
		}//end setUser_Location

		public void setUserEmail_Address(String userEmail_Address) {//start setUserEmail_Address
			this.userEmail_Address = userEmail_Address;
		}//end setUserEmail_Address

		public void setMemberPassword(int memberPassword) {//start setMemberPassword
			this.memberPassword = memberPassword;
		}//end setMemberPassword

		//************************* OTHER METHODS ***********************\\
		public void displayMenu(){
			System.out.println("Name:"+memberName_1);
			System.out.println("Password:"+memberPassword);
			System.out.println("Location:"+user_Location);
			System.out.println("E-mail Address:"+userEmail_Address);
		}//end displayMenu
		
	}//end inner class
  public static void main(String[] args) {//start main
		
		//make a reference to Registrar to create an instance of the Registrar class
		Registrar register =new Registrar("Enoch","Dublin","eoppong@2018.cdcfe.ie",1234);
		System.out.println("Hello! ^_^");
		System.out.println("=====================================");
		System.out.println("Welcome to the CDCFE REGISTER SYSTEM");
		System.out.println("=====================================");
		
		System.out.println("Please enter your Name:");
		register.setMemberName_1(input.nextLine());
		
		System.out.println("Please enter your Password:");
		register.setMemberPassword(input.nextInt());
		
		System.out.println("Please enter your Location:");
		register.setUser_Location(input.next());
		
		System.out.println("Please enter your E-mail Address:");
		register.setUserEmail_Address(input.next());
		System.out.println("");
		//final printout
		register.displayMenu();
		
	}//end main
}//end outer class

