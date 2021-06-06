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
    int isPresent = 1;

    /**
     * Method for taking attendance of employee.
     */
    public void attendance() {
        Random random = new Random();
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == isPresent) {
            System.out.println("Employee is Present ");
        } else {
            System.out.println("Employee is Absent ");
        }
    }
}

public class EmpWageComputation {

    /**
     * This is main method, This is a starting point of EmpWageComputation program.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        EmployeeWage EmployeeWageObject = new EmployeeWage();
        EmployeeWageObject.attendance();
    }
}
