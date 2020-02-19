package com.lab3.test;

public class SalesEmployee extends Employee{//start Sales Employee
	//Attributes associated with this class
		private double commissionEarned;
		
		//********************************* CONSTRUCTORS *****************************\\
		public SalesEmployee(String firstName, String surName, int staffNumber, double annualSalary, double commissionEarned) {
			super(firstName, surName, staffNumber, annualSalary);
				this.commissionEarned=commissionEarned;
		}//start SalesEmployee

		//*********************************** GETTERS/SETTERS ****************************\\
		public double getCommissionEarned() {//start getCommissionEarned
			return commissionEarned;
		}//end getCommissionEarned

		public void setCommissionEarned(double commissionEarned) {//start getCommissionEarned
			this.commissionEarned = commissionEarned;
		}//end setCommissionEarned

		//****************************** toSTRING***************************\\
		@Override
		public String toString() {//start String toString
			return super.toString()+" / Commission Earned --> " + commissionEarned + "";
		}//end String toString
		
		//****************************** OTHER METHODS ***************************\\
		public double calculatePay() {//start calculatePay
			return (getAnnualSalary()/12)+commissionEarned;
		}//end calculatePay
}//end Sales Employee
