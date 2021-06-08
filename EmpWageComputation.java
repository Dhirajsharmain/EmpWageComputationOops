/**
 * Compilation:  javac -d bin EmpWageComputation.java
 * Purpose: Compute the Employee Wages.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 06-06-2021
 */

package bridgelabz;

import java.util.Random;

public class EmpWageComputation {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMont;

    public EmpWageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMont) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMont = maxHoursPerMont;
    }


    /**
     * Class method for computing the wage for employee.
     */
    private void wageComputation() {
        int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;
        Random random = new Random();
        while (totalEmpHrs < maxHoursPerMont && totalWorkingDays < numOfWorkingDays) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }

        int empWage = totalEmpHrs * empRatePerHour;
        System.out.println("Employee Wage for company " + company + " is : " + empWage);
    }

    /**
     * This is main method, This is a starting point of EmpWageComputation program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        EmpWageComputation dMart = new EmpWageComputation("dMart", 20, 2, 10);
        dMart.wageComputation();
        EmpWageComputation reliance = new EmpWageComputation("reliance", 30, 4, 14);
        reliance.wageComputation();
    }
}