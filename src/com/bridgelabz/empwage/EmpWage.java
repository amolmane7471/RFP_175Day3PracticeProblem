package com.bridgelabz.empwage;
/*
 * UC4 : emp wage Using switch case statements
 * UC5 : calculate total wages for month
 */
public class EmpWage {
	public static final	int IS_PARTTIME=1;
	public static final	int IS_FULLTIME=2;
	public static final	int EMP_RATE_PER_HOUR=20;
	public static final	int NUM_WORKING_DAYS=20;
	
	public static void main(String[] args) {
	System.out.println("Welcome To Employee Wage Computation Problem");
	int empHrs,empWage,totalEmpWage=0;
	 for (int day=1;day<=NUM_WORKING_DAYS;day++)
	 {
	int empcheck = (int)Math.floor(Math.random()*10)%3;
	switch (empcheck) {
	case IS_PARTTIME:
					System.out.println("Emp Is Part Time Present");
					empHrs = 4;
					break;
	case IS_FULLTIME:
					System.out.println("Emp Is Full Time Present");
					empHrs = 8;
					break;
	default:
					System.out.println("Emp Is Absent");
					empHrs = 0;
	}
	empWage=empHrs*EMP_RATE_PER_HOUR;
	totalEmpWage+=empWage;
	System.out.println("Emp Wage:"+empWage);
	}
	System.out.println("Total Emp Wage Is:"+totalEmpWage);

	}

}
