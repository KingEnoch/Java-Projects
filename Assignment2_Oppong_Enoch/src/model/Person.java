package model;
/*
 * This is a blueprint for a Person to register to a PhoneBook Database System
 * Used other files 
 * In this file I declare my variables for the Name & Number
 * I have two constructors here
 * One constructor is empty
 * One constructor contains the two variables, Name & Number
 * And lastly my toString method which also prints out the information
 * I created the following four classes and used the MCV model for package names:
 * A class called Person which will be in the Model Package to contain name and phone number.
 * A class called Contact which will be in the Model Package and will also be extending the Person class file
 * A class MobilePhone which will be in the View Package that holds the ArrayList of Contacts. MobilePhone should do everything with Contact objects only.
 * A StartApp which will be in the Controller Package class which will contain the main method.
 * 
 */
public class Person {//start class
	//Global Variables(Fields)
	private String personName;//Private --> Not visible --> Maybe secure
	private String clientNumber;//Access by Get/Set Methods
	
//**************************** CONSTRUCTORS **************************\\	
	public Person() {}//empty constructor
	/*
	 * Two constructors with the same name --> Overloading (Allowed in Java)
	 */
	//Constructor with 2 parameters
	public Person(String personName, String clientNumber) {//start Person constructor
		super();
		this.personName = personName;
		this.clientNumber = clientNumber;
	}//end Person constructor
	//**************************** GETS/SETS **************************\\	
		public String getPersonName() {//start getPersonName
			return personName;
		}//end getPersonName
		public void setPersonName(String personName) {//start setPersonName
			this.personName = personName;
		}//end setPersonName
		public String getClientNumber() {//start getClientNumber
			return clientNumber;
		}//end getClientNumber
		public void setClientNumber(String clientNumber) {//start setClientNumber
			this.clientNumber = clientNumber;
		}//end setClientNumber
		
	//**************************** TOSTRING **************************\\		
		//Method to Overwrite the default toString Method
		@Override
		public String toString() {//start toString
			return "Person [Name-->" + getPersonName() + ", Number-->" + getClientNumber() + "]";
		}//end toString
		
}//end class
