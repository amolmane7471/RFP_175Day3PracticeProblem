package com.bridgelabz.empwage;
public class EmpWage {

	public static void main(String[] args) {
	System.out.println("Welcome To Employee Wage Computation Problem");
	int IS_PARTTIME = 2;
	int IS_FULLTIME = 1;
	int EMP_RATE_PER_HOUR = 20;
	int empHrs;
	int empWage;
	double empcheck = Math.floor(Math.random()*10)%3;
	/*
	 * UC1 : Employee Attendance
	 */
	if(empcheck == IS_FULLTIME)
	{
	empHrs = 8;
	System.out.println("Emp is Full Time Present");
	}
	/*
	 * UC3 : Part Time Employee and wage
	 */
	else if(empcheck == IS_PARTTIME)
	{
	empHrs = 4;
	System.out.println("Emp is Part Time Present");
	}
	else 
	{
	empHrs=0;
	System.out.println("Emp is Absent");
	}
	/*
	 * UC2 : calculate daily emp wages
	 */
	empWage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("Emp Wage:"+empWage);	
	}

}
