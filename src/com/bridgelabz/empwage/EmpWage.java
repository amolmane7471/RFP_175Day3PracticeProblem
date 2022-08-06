package com.bridgelabz.empwage;
/*
 * UC4 : emp wage Using switch case statements
 */
public class EmpWage {
	public static final int EMP_RATE_PER_HOUR = 20;
	
	public static void main(String[] args) {
	System.out.println("Welcome To Employee Wage Computation Problem");
    final int IS_PARTTIME = 2;
	final int IS_FULLTIME = 1;
	int empHrs;
	int empWage;
	int empcheck = (int)Math.floor(Math.random()*10)%3;
	switch (empcheck) {
	case IS_PARTTIME:
					System.out.println("Emp Is Part Time Present");
					empHrs=4;
					break;
	case IS_FULLTIME:
					System.out.println("Emp Is Full Time Present");
					empHrs=8;
					break;
	default:
					System.out.println("Emp Is Absent");
					empHrs=0;
	}
	empWage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("Emp Wage:"+empWage);	
	}

}
