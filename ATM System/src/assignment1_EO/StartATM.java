package assignment1_EO;
//This is the entry point to my online banking service named Cygnus Inc
/*In this class the User Login Information and the Change Pin Methods is given to the customer.
 * I Hard coded five users for my ATM machine system.
 * Each user will have a name, pin, balance and overdraft facility so that they would be able to operate the ATM System.
 * All This information would be stored in arrays
 */
import java.util.Scanner;
public class StartATM {//start class
	static Scanner input = new Scanner(System.in);	
	//Global Variables (Can be used anywhere in the class)
	String acc_Pin;
	static String pin;
	//Create an object of PalAccount type
	static Account [] ka_ching = new Account[5];//Cygnus gives you access to Account
	public static void main(String[] args) {//start main
		//These are my hard coded user into arrays. Their Name, Balance, Pin and OverDraft is stored here.
		ka_ching[0]= new Account("Enoch",5000,"1234",0);
		ka_ching[1]= new Account("Bart",6000,"2468",0);
		ka_ching[2]= new Account("Alex",7000,"4321",1);
		ka_ching[3]= new Account("Pat",8000,"2233",1);
		ka_ching[4]= new Account("Gareth",9000,"5566",0);

		//Start system with a Login
		UserloginInfo();
	}//end main

	//This is my UserloginInfo method.This is what the user is greeted to when operating the ATM 
	public static void UserloginInfo() {//start UserloginInfo method
		System.out.println("Hello Customer! ^_^");
		System.out.println("+======================================+");
		System.out.println("Welcome to Cygnus Inc Online ATM System");
		System.out.println("+======================================+");
		System.out.println("Please enter pin to get started:");
		pin=input.next();
		//For loop to test the whole array
		for(int i=0;i<ka_ching.length;i++) {//start for loop
			//If statement to login and get correct account
			if(pin.matches(ka_ching[i].getAcc_Pin())) {//start if statement
				ka_ching[i].chooseYourOptions();
			}//end if
		}//end for loop	
		for(int i=0;i<ka_ching.length;i++) {//start for loop
			//If statement to login and get correct account
			if(!pin.matches(ka_ching[i].getAcc_Pin())) {//start if statement
				ka_ching[i].incorrectDetails();
			}//end if statement
		}//end for loop
	}//end UserloginInfo method

	//This changeATMpin method allows the user to change up their pin if they wish so
	public static String changeATMpin(String new_pin) {//start changeATMpin method
		int validpin = 1;
		for(int i=0;i<ka_ching.length;i++) {//start for loop
			if(new_pin.equals(ka_ching[i].getAcc_Pin())) {//start if statement
				System.out.println("Pin Already Taken... (-__-)");
				System.out.println("Please Try A Different Pin!");
				System.out.println("");
				validpin = 0;
			}//end if statement
		}//end for loop
		if(validpin==1) {//start if statement
			System.out.println("Your pin has being successfully changed ^_^");
			System.out.println("Please press 1 to view your new pin number");
			System.out.println("");
		}//end if statement
		return new_pin;
	}//end changeATMpin method

}//end class

