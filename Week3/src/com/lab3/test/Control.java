/*
 * Author --> Enoch Oppong
 * Date --> 12/02/20
 * Control --> The purpose of this class
 */
package com.lab3.test;

public class Control {//start Control

	public static void main(String[] args) {//start main
		//This is for Employee Class!
		Employee emp1 = new Employee("Enoch", "Oppong", 1, 5000.00);
		System.out.println(emp1);

		//This is for HourlyEmployee Class!
		HourlyEmployee hourEmp1 = new HourlyEmployee("Thamsanqa", "Sibanda", 2, 7, 9);
		System.out.println(hourEmp1);
		
		SalesEmployee sale1 = new SalesEmployee("Sultan", "Alghamdi", 3, 2000.00, 200);
		System.out.println(sale1);
		
		//Polymorphism/Arrays
		Employee[] employee = new Employee[3];
		employee[0]=emp1;
		employee[1]=hourEmp1;
		employee[2]=sale1;
		
		//For Loop for Calculating Pay
		for(int i=0;i<employee.length;i++) {//start for loop
			double display = employee[i].calculatePay();	
			System.out.println(display);
		}//end for loop
	}//end main

}//end Control
