package com.bridgelabz.empwage;
/*
 * UC6 : Calculate wages till condition of total working hours of 100 or max days 20 is reached for a month
 */
public class EmpWage {
	public static final	int IS_PARTTIME = 1;
	public static final	int IS_FULLTIME = 2;
	public static final	int EMP_RATE_PER_HOUR = 20;
	public static final	int NUM_WORKING_DAYS = 20;
	public static final int WORKING_HRS_IN_MONTH = 100;
	
	public static void main(String[] args) {
	System.out.println("Welcome To Employee Wage Computation Problem");
	 int empHrs,totalEmpWage,totalEmpHrs = 0,totalWorkingDays = 0;
	 while(totalEmpHrs<=WORKING_HRS_IN_MONTH && totalWorkingDays<NUM_WORKING_DAYS)
	    {
		 	totalWorkingDays++;
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
	totalEmpHrs +=empHrs;
	System.out.println(" Day: "+totalWorkingDays  +  " Total EmpHours: "+totalEmpHrs);
	    }
	 totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
	 System.out.println("Total Emp Wage Is:"+totalEmpWage);

	}

}
