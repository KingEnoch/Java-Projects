package assignment1_EO;
/* This class is a blueprint for application named Cygnus Inc 
 * It has no main method and is used by another file named StartATM
 * This is my first F.O.O.P assignment issued to me this year.
 * I will design, implement and test a solution to the given problem, making use of system libraries where suitable, and adhering to industry standard best practice.
 * I am expected to write a java application to simulate a bank ATM machine system. 
 * My requirements for my application are:
 * Hard code five users for my ATM machine system. Each user will have a name, pin, balance and overdraft facility. These must be all stored in arrays.
 * The user should be asked to log-in. Once they log-in a display menu with options such as Check Bank Statement, Withdraw Money, Deposit Money, Change Pin and Exit. The menu will loop until the user selects Exit. If an incorrect pin is entered the user should be given three attempts.
 * When the user deposits or withdraws money the user’s balance should be changed 
 * Two java classes should be created for this assignment. On of them is named Account and the second class is named StartATM
 * The StartATM class contains the main method and it creates an object of class Account.
 * All inputs must be validated for error checking using a validation method
 * Change Pin will pass the new pin to a method. The method will check that the pin is not already in use for any object. If it is in use the user should be asked to use a different set of digits. If it is successful the pin should update
 * Both class will evidently form together under one folder named Assignment1_EO.
 * My ATM System is named Cygnus Inc
 * I will also produce evidence of my own work by using screenshots and a write up which can be found at the upload station 
 */
import java.util.Scanner;//This is the Java Library class
public class Account {//start class
	static Scanner input = new Scanner(System.in);
	//Global Variables (Can be used anywhere in the class)
	private String acc_Name;//This is my global variable for the User Name
	private int myBalance;//This is my global variable for the User Balance
	private String acc_Pin;//This is my global variable for the User Pin
	private int overDraft1;//This is my global variable for the User OverDfrat (If they have one)
	private static int marker;//This is my global variable for the User Attempts to get their pin right (Only 3 attempts given)
	//******************************************************************************************\\
	static int pin;//What the user inputs in the program will be checked against array of pins
	static int index;//The most important value as it gives the customer

	//*************************** CONSTRUCTORS *******************************\\
	//This is the empty constructor
	Account(){}

	//Generated Constructors for my Global Variables
	public Account(String name, int balance, String pin, int overdraft) {//start constructor
		this.acc_Name=name;
		this.myBalance=balance;
		this.acc_Pin=pin;
		this.overDraft1=overdraft;
	}//end constructor

	//*************************** GET/SET METHODS *******************************\\
	//This is my Get/Set Methods for my Global Variables declared in the class
	public String getAcc_Name() {//start getAcc_Name
		return acc_Name;
	}//end getAcc_Name

	public void setAcc_Name(String acc_Name) {//start setAcc_Name
		this.acc_Name = acc_Name;
	}//end setAcc_Name

	public int getMyBalance() {//start getMyBalance
		return myBalance;
	}//end getMyBalance

	public void setMyBalance(int myBalance) {//start setMyBalance
		this.myBalance = myBalance;
	}//end setMyBalance

	public String getAcc_Pin() {//start getAcc_Pin
		return acc_Pin;
	}//end getAcc_Pin

	public void setAcc_Pin(String acc_Pin) {//start setAcc_Pin
		this.acc_Pin = acc_Pin;
	}//end setAcc_Pin

	public int getOverDraft1() {//start getOverDarft1
		return overDraft1;
	}//end getOverDarft1

	public void setOverDraft1(int overDraft1) {//start setOverDarft1
		this.overDraft1 = overDraft1;
	}//end setOverDarft1

	//*************************** ALL OTHER METHODS *******************************\\
	//This is my chooseYourOptions Method this allows the customer to pick whatever option below
	public void chooseYourOptions() {//start chooseYourOptions method
		while(true) {//start while loop
			System.out.println("");
			System.out.println("1.Display Bank Statement\n2.Deposit Money\n3.Withdraw Money\n4.Change Pin\n5.Exit");
			String option=input.next();
			//Switch statement to choose options
			switch(option) {//start switch
			case "1":
				displayAccountFormat();break;
			case "2":
				depositMoney();break;
			case "3":
				withdrawMoney();break;
			case "4":
				pinChecker();break;
			case "5":
				exitMyAccount();
				System.exit(0);
				break;
			default:
				System.out.println("");
				System.out.println("Incorrect Option! Please try again");
				System.out.println("");
			}//end switch
		}//end while loop
	}//end chooseYourOptions

	//The displayAccount Method is to show account details
	public void displayAccountFormat() {//start displayAccountFormat method
		System.out.println("");
		System.out.println("Your Cygnus UserName Is: "+acc_Name);
		System.out.println("Your Bank Account Balance is: €"+myBalance);
		System.out.println("Your Pin Number For You Account Is: "+acc_Pin);
		System.out.println("Your OverDraft Is: "+overDraft1);
		System.out.println("");
		if(overDraft1==0) {//start if
			System.out.println("You have NO OverDraft");
		}//end if
		else {//start else
			System.out.println("You have AN OverDraft");
		}//end else
	}//end displayAccountFormat

	//The depositMoney Method allows the customer to add as much money into their account as possible
	public void depositMoney() {//start depositMoney method
		System.out.println("You have: €"+myBalance);
		System.out.println("Please enter the amount you would like to deposit");
		String atm = input.next();
		int ka_ching=validateInput(atm);
		//Do Math
		myBalance=myBalance+ka_ching;
		System.out.println("Your New Balance Is: €"+myBalance);
	}//end depositMethod

	//The withdrawMoney Method allows the customer to take out money from their account as long as they do not take out higher than what is in their account
	public void withdrawMoney() {//start withdrawMoney method
		System.out.println("You have: €"+myBalance);
		System.out.println("How much do you want to withdraw?");
		String atmWithdraw = input.next();
		int ka_ching= validateInput(atmWithdraw);
		if((myBalance<ka_ching)&&(getOverDraft1()==0)){//start if
			System.out.println("Sorry Insufficient Funds!");
			System.out.println("You only have: €"+myBalance);
		}//end if
		else {//start else
			//Do Math
			myBalance=myBalance-ka_ching;
			System.out.println("Your New Balance Is: €"+myBalance);	
		}//end else
	}//end withdrawMoney

	//The pinChecker method allows the customer to change their pin if they wish to do so
	private void pinChecker() {//start pinChecker method
		System.out.println("Enter your new pin");
		acc_Pin=StartATM.changeATMpin(input.next());
	}//end pinChecker

	//This exitMyAccount method allows the user to exit their account after they have finish operating the atm machine
	public void exitMyAccount() {//start exitMyAccount method
		System.out.println("You have exited your Cygnus Bank Account");
		System.out.println("Enjoy your day ( ^_^ ),Goodbye see you next time!");
	}//end exitMyAccount

	//This is my incorrectDetails method this method tells the user if they have entered any wrong information
	public  void incorrectDetails() {//start incorrectDetails
		System.out.println("Incorrect Pin, Try Again!");
		counterIndicator();//This is the counter method
		StartATM.UserloginInfo();//Start system with a Login
	}//end incorrectDetails

	//This is the counterIndicator method. This gives the user only three attempts on the pin
	public static void counterIndicator() {//start counterIndicator
		marker++;
		System.out.println("Attempt Number "+marker);
		//If statements to stop user having more than three attempts
		if(marker==3) {//start if
			System.out.println("Sorry,No More Attempts!");
			System.out.println("GoodBye (0_0)");
			System.exit(0);
		}//end if
	}//end method

	//This Validation method ensures that only numbers are placed in certain method instead of letters
	//**************Validation Method(Used for all inputs that should be digits)***********\\
	public static int validateInput(String stringInput){//start validateInput
		while(!stringInput.matches("\\d+")){//start while
			System.out.println("Error, Numbers Only");
			System.out.println("Please Enter Again");
			stringInput=input.nextLine();
		}//end while
		return Integer.parseInt(stringInput);
	}//end validate input

}//end class


