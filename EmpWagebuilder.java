package com.bridgelabz.empwagebuilder;

public class "Welcome to Employee Wage Computation Program"
{
	public static void main(String[] args) {
	        int FULLDAY = 8;
		int WAGE_PER_HOUR = 20;
		double IS_EMP_PRESENT = 1.0;
		double empCheck = Math.floor(Math.random() * 10) % 2 ;
         if (empCheck == IS_EMP_PRESENT) {
        	int dailywage = FULLDAY *WAGE_PER_HOUR;
       System.out.println("Employee is Present");
        	System.out.println("daily Employee Wage is : "+ dailywage);
        }
       else
    	   System.out.println("Employee is Absent");
	}

	}
}
