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
    public static final int EMP_RATE_PER_HOUR = 20;

    public static int empHrs = 0;
    public static int totalEmpHrs = 0;
    public static int numOfWorkingDays = 20;

    /**
     * Method for computing the wage for employee.
     */
    private static void wageComputation() {
        Random random = new Random();
        for (int i = 0; i < numOfWorkingDays; i++) {
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

        int empWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage is : " + empWage);
    }

    /**
     * This is main method, This is a starting point of EmpWageComputation program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        wageComputation();
    }
}