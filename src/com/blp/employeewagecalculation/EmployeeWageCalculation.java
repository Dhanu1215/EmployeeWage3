package com.blp.employeewagecalculation;

/**
 * Employee Wage Calculation Program
 * Check Employee Is Present Or Absent
 */
public class EmployeeWageCalculation {

    public static void main(String[] args) {
        //Use random function to check employee is present or absent
        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
        if ( empCheck == 1 ) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
