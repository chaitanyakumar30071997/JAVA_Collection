package com.salariesgreater;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SecodeHighestSalary {
	
	public static void main(String[] args) {
        List<Emp> empobj = Arrays.asList(
                new Emp(1, "shiva", "it", 2000L),
                new Emp(2, "laxmi", "it", 3000L),
                new Emp(3, "pravte", "it", 2000L),
                new Emp(4, "ventates", "HR", 4000L),
                new Emp(5, "mani", "Admin", 2000L),
                new Emp(6, "manikantha", "Admin", 1000L),
                new Emp(7, "siri", "HR", 2000L) 
        );
        
        Map<String, List<Emp>>  employeesByDepartment = empobj.stream()
        		.collect(Collectors.groupingBy(Emp::getDep));
        
        
        employeesByDepartment.forEach((department,employees)-> {
        	List<Long> sortedSalaries = employees.stream()
        			.map(Emp::getSal)
                    .sorted((sal1, sal2) -> Long.compare(sal2, sal1)) 
                    .collect(Collectors.toList());
        	if (sortedSalaries.size() >= 2 ) {
        		System.out.println("Department: " + department);
                System.out.println("Second Highest Salary: " + sortedSalaries.get(1));
        	}
        	
        });
    }
        
        
      
}

	

