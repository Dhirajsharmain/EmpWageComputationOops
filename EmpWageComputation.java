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

class EmployeeWage {
    public static final int EMP_RATE_PER_HOUR = 20;
    int isFullTime = 1;
    int isPartTime = 2;
    int empHrs = 0;
    int empWage;

    /**
     * Method for taking attendance of employee.
     */
    public void attendance() {
        Random random = new Random();
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        if (empCheck == isFullTime) {
            System.out.println("Employee is Present Full Time");
            empHrs = 8;
        } else if (empCheck == isPartTime) {
            System.out.println("Employee is Present Part Time ");
            empHrs = 4;
        } else {
            System.out.println("Employee is Absent ");
        }
    }

    /**
     * Method for calculating daily wage for employee.
     */
    public void calculatingWage() {
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage is : " + empWage);
    }
}

public class EmpWageComputation {

    /**
     * This is main method, This is a starting point of EmpWageComputation program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        EmployeeWage EmployeeWageObject = new EmployeeWage();
        EmployeeWageObject.attendance();
        EmployeeWageObject.calculatingWage();
    }
}
