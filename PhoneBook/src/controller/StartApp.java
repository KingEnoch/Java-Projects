package controller;

import java.util.Scanner;//Java Library
import model.Contact;//Our own library of classes
import view.MobilePhone;//Our own library of classes
import java.io.IOException;//Our own library of classes
import java.nio.file.Files;//Our own library of classes
import java.nio.file.Path;//Our own library of classes
import java.nio.file.Paths;//Our own library of classes
/*
 * This the engine of this application --> Entry point to the other classes --> Main method lies here
 * The Controller 
 * I will design, implement and test a solution to the given problem, adhering to industry standard best practice.
 * I will also be required to determine any reusable elements in my program and to store these as separate files, to which the final product will link.
 * My program that I will be creating simulates a mobile phone contacts app with the following capabilities:
 * Add contact names and mobile phone numbers
 * Remove contact names and mobile phone numbers
 * Sort contact names alphabetically
 * Print to a text file the list of contact names
 * I created the following four classes and used the MCV model for package names:
 * A class called Person which will be in the Model Package to contain name and phone number.
 * A class called Contact which will be in the Model Package and will also be extending the Person class file
 * A class MobilePhone which will be in the View Package that holds the ArrayList of Contacts. MobilePhone should do everything with Contact objects only.
 * A StartApp which will be in the Controller Package class which will contain the main method. I will add a menu of options that are available to this class.
Options: 
Shutdown
Show contacts
Add a new contact
Sort contacts alphabetically
Print out contact list to a text file
Show a list of available actions  
 */
public class StartApp {//start class
	/*
	 * Make reference to Contacts
	 * Create an object of Contacts
	 */
	static Contact reg = new Contact();
	static MobilePhone phone = new MobilePhone();
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {//start main
		while (true) {//start while loop
			//User is given options
			System.out.println("Hello Customer! ^_^");
			System.out.println("++==========================================++");
			System.out.println("Welcome to AtomX Inc Online PhoneBook System");
			System.out.println("++==========================================++");
			System.out.println("Please choose one of the following options:");
			timeDelayBreak();//This displays the methods in time intervals
			System.out.println("1.Add a new Person:");timeDelayBreak();
			System.out.println("2.Remove Person:");timeDelayBreak();
			System.out.println("3.Show Members:");timeDelayBreak();
			System.out.println("4.Sort Register Members Alphabetically:");timeDelayBreak();
			System.out.println("5.Print Information to phoneBook:");timeDelayBreak();
			System.out.println("6.Exit:");timeDelayBreak();
			timeDelayBreak();//This displays the methods in time intervals
			String option = input.next();
			switch (option) {//start switch
			case "1":
				addPersonDetails();//This method adds the person details
				break;
			case "2":
				removePerson();//This method removes the person from the database system
				break;
			case "3":
				phone.showPersonDetails();//This method shows all my members registered in the database system
				break;
			case "4":
				sortPerson();//This method sorts the members in alphabetical order
				break;
			case "5":
				goToNotepad();//This method prints out all my information on to a NotePad file called phoneBook.txt
				break;
			case "6":
				exitMyPhoneBook();//This method allows the user to exit the application
				System.exit(0);
			default:
				System.out.println("Please try again");
			}//end switch
		}//end while loop
	}//end main

//********************************* METHODS *******************************\\
	private static void addPersonDetails() {//start addPersonDetails
		System.out.println("Please enter your Name:");
		reg.setPersonName(input.next());
		System.out.println("Please enter your Number:");
		reg.setClientNumber(input.next());
		Contact newReg = new Contact(reg.getPersonName(),reg.getClientNumber());
		phone.addPersonInfo(newReg);
		System.out.println("Successfully Done!");
	}//end addPersonDetails

	private static void removePerson() {//start removePerson
		System.out.println("Enter Name To Remove Person:");
		System.out.println("User Is Now Gone!");
		phone.removePerson(input.next());
	}//end removePerson
	
	private static void sortPerson() {//start sortPerson
		System.out.println("Users Has Been Sorted Alphabetically!");
		phone.sortPersonInfo();
		phone.showPersonDetails();
	}//end sortPerson
	
	private static void goToNotepad() {//start goToNotepad
		//I created the file phoneBook.txt to write to it
		System.out.println("Successfully Printed To goToNotepad!");
		Path path = Paths.get("phoneBook.txt");//Using Paths from Java 8
		String text= phone.toString();
		try {//start try
			Files.write(path, text.getBytes());
		} catch (IOException e) {//start catch
			e.printStackTrace();
		}//end catch
	}//end goToNotepad
		
	private static void exitMyPhoneBook() {//start exitMyPhoneBook
		System.out.println("++================================================++");
		System.out.println("You have exited your AtomX PhoneBook System");
		System.out.println("Enjoy your day ( ^_^ ),Goodbye see you next time!");
		System.out.println("++================================================++");
	}//end exitMyPhoneBook
	
//********************************* Time Delay Method *******************************\\
	private static void timeDelayBreak() {//start method	
  		Thread.currentThread();
  		try {//start try 
  			Thread.sleep(800);
  		} catch (InterruptedException e) {//start catch
  			e.printStackTrace();
  		}//end catch
  	}//end method
	
}//end class
