package view;
/*
 * This class contains our Array List Database
 * It uses the class Person to create an Array List
 * Only use two methods at start for testing
 * Add and Show 
 * Here I have various methods 
 * I have a addPerson to the Array Method
 * I have a remove person from the Array Method
 * I have a sort person from the Array Method
 * I have a show person from the Array Method
 * I also have toString Methods here
 * I created the following four classes and used the MCV model for package names:
 * A class called Person which will be in the Model Package to contain name and phone number.
 * A class called Contact which will be in the Model Package and will also be extending the Person class file
 * A class MobilePhone which will be in the View Package that holds the ArrayList of Contacts. MobilePhone should do everything with Contact objects only.
 * A StartApp which will be in the Controller Package class which will contain the main method.
 */
import java.util.ArrayList;//This is for the ArrayList
import java.util.Collections;//This is our Java Library
import java.util.Comparator;//This is our Java Library
import model.Person;//This our own import
public class MobilePhone implements Comparator <Person>{//start MobilePhone class
	//Create Array List
    static ArrayList<Person> signup= new ArrayList<>();
	public MobilePhone() {}//empty constructor
//******************************* METHODS *****************************\\
	//1.Add Person To Array List 
	public void addPersonInfo(Person person) {//start addPersonDetails
		signup.add(person);
	}//end addPersonDetails
	
	//2.Remove Person from Array List
	public void removePerson(String name) {//start removePerson
		for(int i=0;i<signup.size();i++) {//start for
			if(name.matches(signup.get(i).getPersonName())) {//start if
				System.out.println("Registerd User Has Been Found!");
				signup.remove(i);
			}//end if
		}//end for
	}//end removePerson
	
	//3.Sort the people who register Alphabetically
	public void sortPersonInfo() {//start sortPerson
		Collections.sort(signup,new MobilePhone());
	}//end sortPerson
	
	//4.Show Person 
	public void showPersonDetails() {//start showPersonDetails
		System.out.println(signup.toString());
	}//end showPersonDetails
	
//**************************** TOSTRING **************************\\				
	@Override
	public int compare(Person a, Person b) {//start toString
		return a.getPersonName().compareTo(b.getPersonName());
	}//end toString

	@Override
	public String toString() {//start toString
		return signup.toString();
	}////end toString
	
}//end MobilePhone class

