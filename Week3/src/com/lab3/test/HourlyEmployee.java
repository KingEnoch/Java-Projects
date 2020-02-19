package com.lab3.test;

public class HourlyEmployee extends Employee{//start HourlyEmployee
	//Attributes associated with this class!
		 private double hoursWorked;
		 private double hourlyRate;
		 
		//********************************* SUPER CONSTRUCTORS **************************\\
		public HourlyEmployee(String firstName, String surName, int staffNumber, double annualSalary, double hoursWorked, double hourlyRate) {//start hourlyRate constructor
			super(firstName, surName, staffNumber, annualSalary);
				this.hoursWorked=hoursWorked;
				this.hourlyRate=hourlyRate;
		}//end HourlyRate constructor
		
		//********************************* CONSTRUCTORS **************************\\
		public HourlyEmployee(String firstName, String surName, int staffNumber, double hoursWorked, double hourlyRate) {//start hourlyRate constructor
			super(firstName, surName, staffNumber);
				this.hoursWorked=hoursWorked;
				this.hourlyRate=hourlyRate;
		}//end HourlyRate constructor	
		//*********************************** GETTERS/SETTERS ****************************\\
		public double getHoursWorked() {//start getHoursWorked
			return hoursWorked;
		}//end getHoursWorked

		public void setHoursWorked(double hoursWorked) {//start setHoursWorked
			this.hoursWorked = hoursWorked;
		}//end setHoursWorked

		public double getHourlyRate() {//start getHourlyRate
			return hourlyRate;
		}//end getHourlyRate

		public void setHourlyRate(double hourlyRate) {//start setHourlyRate
			this.hourlyRate = hourlyRate;
		}//end setHourlyRate

		//****************************** toSTRING***************************\\
		@Override
		public String toString() {//start String toString
			return super.toString()+" / Hourly-Worked -->" + hoursWorked + ", / Hourly-Rate -->" + hourlyRate + "";
		}//end String toString

		//****************************** OTHER METHODS ***************************\\
		public double calculatePay() {//start calculatePay
			double empHour = hoursWorked * hourlyRate;
			return empHour;
		}//end calculatePay 
}//end HourlyEmployee
