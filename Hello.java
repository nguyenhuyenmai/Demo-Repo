package First;

import java.io.*;
import java.util.Date;

public class Hello {
	public static void main(String args[]) {
	      /* Create two objects using constructor */
	      Employee empOne = new Employee("James Smith");
	      Employee empTwo = new Employee("Mary Anne");

	      // Invoking methods for each object created
	      empOne.empAge(26);
	      empOne.empDesignation("Senior Software Engineer");
	      empOne.empSalary(1000);
	      empOne.printEmployee();

	      empTwo.empAge(21);
	      empTwo.empDesignation("Software Engineer");
	      empTwo.empSalary(500);
	      empTwo.printEmployee();
	      
	      // Instantiate a Date object
	      Date date = new Date();

	      // display time and date
	      String str = String.format("Current Date/Time : %tc", date );

	      System.out.printf(str);
	   }
}
