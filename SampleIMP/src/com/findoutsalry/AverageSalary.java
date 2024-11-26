package com.findoutsalry;

import java.util.Arrays;
import java.util.List;

public class AverageSalary {

    public static void main(String[] args) {
        List<Emp> empobj = Arrays.asList(
                new Emp(1, "shiva", "it", 2000L),
                new Emp(2, "laxmi", "it", 3000L),
                new Emp(3, "pravte", "it", 2000L),
                new Emp(4, "ventates", "HR", 4000L),
                new Emp(5, "mani", "Admin", 2000L),
                new Emp(6, "siri", "HR", 2000L) // Changed the ID to 6
        );

        // Calculate total salary
        long totalSalary = empobj.stream().flatMapToLong(Emp::getSalary).sum();

        // Determine the number of employees
        int numberOfEmployees = empobj.size();

        // Compute average salary
        double averageSalary = (double) totalSalary / numberOfEmployees;

        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Average Salary: " + averageSalary);
    }
}
