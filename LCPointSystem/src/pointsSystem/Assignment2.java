
//This eclipse assignment is the second one issued this year
//You are required to write an application for entering Leaving Certificate grades for a student
//and calculating the points achieved.
//The user should be asked to enter each subject’s name and corresponding grade. Using
//a for loop, which will execute six times, to take in the subject names and grades.
//Calculate the number of points achieved by each subject using if statements.
//Tell the user the total number of points scored.
// I am required to write a class called PointsCalculator. This class will contain all the methods to
//process the user input and convert the grades entered to points achieved. Name the
//main class UsePointsCalculator, which will contain the main method.
//I will the ultimately combine both files into a class called assignment2EO.
//All inputs must be validated for error checking using a method.
//Class PointsCalculator contains no main method (so it cannot run)
//I need a another class(UsePointsCalculator) which contains the main method
//This class PointsCalculator is a blueprint for UsePointsCalculator which has all student information
//An addition of Validation Method will be implemented in PointsCalculator which will only take in
//digits and not letters
package pointsSystem;
import java.util.Scanner;

public class Assignment2 {//Start Outer class
	static Scanner input = new Scanner(System.in);
	static String userIntake;
	static int total;
	static public class PointsCalculator {//start Inner class
		//Global variables will be used in the future constructors and Get/Set Methods
		private String subjectName;
		private String studentName;
		private int courseGrade_1;
		//Global variables used in several methods and maybe Get/Sets
		private int totalMarks;// 'calculated'(using if statements) by the method totalMarksConvertor
		private int total_2;
		//***************************** CONSTRUCTORS ******************************\\
		public PointsCalculator() {}//empty constructor
			
		//A constructor with three parameters
		public PointsCalculator(String courseName, String studentName, int courseGrade) {//start PointsCalculator
			this.subjectName=courseName;
			this.studentName=studentName;
			this.courseGrade_1=courseGrade;
		}//end PointsCalculator

		//***************************** GET/SET METHODS****************************\\
		public String getCourseName() {//start getCourseName
			return subjectName;
		}//end getCourseName

		public String getStudentName() {//start getStudentName
			return studentName;
		}//end getStudentName

		public int getCourseGrade() {//start getCourseGrade
			return courseGrade_1;
		}//end getCourseGrade

		public int getTotalMarks() {//start getTotalMarks
			return totalMarks;
		}//end getTotalMarks
		
		public int getTotal() {//start getTotal
			return total_2;
		}//end getTotal

		public void setCourseName(String courseName) {//start setCourseName
			this.subjectName = courseName;
		}//end setCourseName

		public void setStudentName(String studentName) {//start setStudentName
			this.studentName = studentName;
		}//end setStudentName

		public void setCourseGrade(int courseGrade) {//start setCourseGrade
			this.courseGrade_1 = courseGrade;
		}//end setCourseGrade

		public void setTotalMarks(int totalMarks) {//start setTotalMarks
			this.totalMarks = totalMarks;
		}//end setTotalMarks
		
		public void setTotal(int total) {//start setTotal
			this.total_2 = total;
		}//end setTotal

		//************************ OTHER METHODS *******************\\
		//This method prints out our final information including points achieved
		public void displayMenu(){
			System.out.println("Student Name --> "+studentName);
			System.out.println("Congratulations on completing your Leaving Certificate of 2020!");
		}//end displayMenu
		//Method to convert Grades to Marks/Points
		public void totalMarksConvertor(){//start totalMarksConvertor
			if(getCourseGrade()>=90){//start if
				setTotalMarks(100);
				total_2=totalMarks+total_2;
			}//end if
			else if(getCourseGrade()>=80){//start else if
				setTotalMarks(88);
				total_2=totalMarks+total_2;
			}//end else if
			else if(getCourseGrade()>=70){//start else if
				setTotalMarks(77);
				total_2=totalMarks+total_2;
			}//end else if 
			else if(getCourseGrade()>=60){//start else if
				setTotalMarks(66);
				total_2=totalMarks+total_2;
			}//end else if
			else if(getCourseGrade()>=50){//start else if
				setTotalMarks(56);
				total_2=totalMarks+total_2;
			}//end else if
			else if(getCourseGrade()>=40){//start else if
				setTotalMarks(46);
				total_2=totalMarks+total_2;
			}//end else if
			else if(getCourseGrade()>=30){//start else if
				setTotalMarks(36);
				total_2=totalMarks+total_2;
			}//end else if
			else{//start else
				setTotalMarks(0);
				total_2=totalMarks+total_2;
			}//end else
			System.out.println("The total points achieved in this subject by this student is:"+totalMarks);
		}//end totalMarksConvertor
		
	}//end Inner class
	public static void main(String[] args) {//start main method
		//Create a PointsCalculator object and assign it a reference value
		PointsCalculator LCpoints  = new PointsCalculator("Enoch","King",1);
		System.out.println("Hello! ^_^");
		System.out.println("===============================================");
		System.out.println("Welcome to the Noch's Leaving Cert Points System!");
		System.out.println("===============================================");
		//Take user input
		System.out.println("");
		System.out.println("Please enter the Student Name:");
		System.out.println("");
		LCpoints.setStudentName(input.nextLine());
		for(int i=1;i<=6;i++){//start for loop
			System.out.println("");
			System.out.println("Please enter the Subject Name:");
			System.out.println("");
			LCpoints.setCourseName(input.next());
			System.out.println("");
			System.out.println("Please enter the Subject Grade:");
			System.out.println("");
			//LCpoints.setCourseGrade(input.nextInt());
			userIntake=input.next();
			while(!userIntake.matches("\\d+")){
				System.out.println("Error Digits Only");
				System.out.println("Please try again");
				userIntake=input.next();
			}//end while
			int number1=Integer.parseInt(userIntake);
			LCpoints.setCourseGrade(number1);
			//do math
			LCpoints.totalMarksConvertor();
			//LCpoints.setTotalMarks(number);
			total=total+LCpoints.getTotalMarks();
		}//end for loop
		
		System.out.println("*******************************************************************");
		LCpoints.displayMenu();
		//LCpoints.totalMarksConvertor();
		System.out.println("The Overall Total Points is:"+total);
	}//end main method
}//End Outer class
