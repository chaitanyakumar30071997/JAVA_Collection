package com.findoutsalry;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpSalary {
	
	public static void main(String[] args) {
		
	

	List<Emp> empobj = Arrays.asList
			(new Emp(1, "nag", "it", 2000L), 
			new Emp(2, "nihal", "it", 3000L),
			new Emp(3, "mani", "it", 2000L),
			new Emp(4, "rishi", "HR", 4000L), 
			new Emp(5, "nihan", "Admin", 2000L),
			new Emp(5, "siri", "HR", 2000L));
	// stream intermediate, terminal operators

	// Comparator --> comparing two object

	// Finding the employee with the highest salary
	
	Optional<Emp> highestEmp = empobj.stream().max(Comparator.comparingLong(Emp::getSal));

	// System.out.println(highestEmp.get().getName() + ":"dephigh +
	// highestEmp.get().getSal());
	
	// Grouping employees by department and getting the highest salary per department
	Map<String, Optional<Emp>> dephigh = empobj.stream()
			.collect(Collectors.groupingBy(Emp::getDep, Collectors.maxBy(Comparator.comparingLong(Emp::getSal))));
	
	
	   // Print highest salary per department
	   dephigh.forEach ((dep, emp) -> 
	   
	   System.out.println(dep + " : " + emp.get().getSal()));
	   
	}
	
}
