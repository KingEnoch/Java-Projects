/*
 * Author --> Enoch Oppong
 * Date --> 12/02/20
 * Employee --> The purpose of this class
 */
package com.lab3.test;

public class Employee {//start Employee class
//Attributes associated with this class!
	private String firstName;
	private String surName;
	private int staffNumber;
	private double annualSalary;
	
	//********************************* CONSTRUCTORS **************************\\
	public Employee(String firstName, String surName, int staffNumber, double annualSalary) {//start Employee constructor
		this.firstName=firstName;
		this.surName=surName;
		this.staffNumber=staffNumber;
		this.annualSalary=annualSalary;
	}//end Employee constructor

	//********************************* CONSTRUCTORS **************************\\
		public Employee(String firstName, String surName, int staffNumber) {//start Employee constructor
			this.firstName=firstName;
			this.surName=surName;
			this.staffNumber=staffNumber;
			this.annualSalary = 0;
		}//end Employee constructor
		
	//*********************************** GETTERS/SETTERS ****************************\\
	public String getFirstName() {//start getFirstName
		return firstName;
	}//end getFirstName

	public void setFirstName(String firstName) {//start setFirstName
		this.firstName = firstName;
	}//end setFirstName

	public String getSurName() {//start getSurName
		return surName;
	}//end getSurName

	public void setSurName(String surName) {//start setSurName
		this.surName = surName;
	}//end setSurName

	public int getStaffNumber() {//start getStaffNumber
		return staffNumber;
	}//end getStaffNumber

	public void setStaffNumber(int staffNumber) {//start setStaffNumber
		this.staffNumber = staffNumber;
	}//end setStaffNumber

	public double getAnnualSalary() {//start getAnnualSalary
		return annualSalary;
	}//end getAnnualSalary

	public void setAnnualSalary(double annualSalary) {//start setAnnualSalary
		this.annualSalary = annualSalary;
	}//end setAnnualSalary
	
	//****************************** toSTRING***************************\\
	public String toString() {//start toString
		//By convention toString return the object values e.g. the attributes value
		return "First Name --> " +firstName+ " / SurName --> " +surName+ " / Staff-Number --> " +staffNumber+ " / Annual Salary --> "+annualSalary;
		}//end toString
	
	//****************************** OTHER METHODS ***************************\\
	//Other Methods!
	public double calculatePay() {//start calculatePay
		return annualSalary/12;
	}//end calculatePay
}//end Employee class
 