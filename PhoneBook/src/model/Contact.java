package model;
/*
 * This class holds the person information
 * It extends the Person class file 
 * This class contains two constructors
 * The first constructor is empty
 * The second constructor is a super method from the Person file
 * I created the following four classes and used the MCV model for package names:
 * A class called Person which will be in the Model Package to contain name and phone number.
 * A class called Contact which will be in the Model Package and will also be extending the Person class file
 * A class MobilePhone which will be in the View Package that holds the ArrayList of Contacts. MobilePhone should do everything with Contact objects only.
 * A StartApp which will be in the Controller Package class which will contain the main method.
 */
public class Contact extends Person{//start class
//****************************** CONSTRUCTORS ******************************\\
	public Contact() {}//empty constructor
	//Constructor is generated from the Super Class (when you click on 'Source')
	public Contact(String personName, String clientNumber) {//start Contact constructor
		super(personName, clientNumber);
	}//end Contact constructor
//******************************* METHODS *****************************\\
	//Over write the default toString method
	@Override
	public String toString() {//start toString
		return "Contact [" + super.toString() + "]";
	}//end toString 
	
}//end class
