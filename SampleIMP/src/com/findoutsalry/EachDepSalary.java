package com.findoutsalry;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EachDepSalary {
	
	public static void main(String[] args) {
		
	List<Emp> empobj = Arrays.asList
			(new Emp(1, "shiva", "it", 2000L), 
			new Emp(2, "laxmi", "it", 3000L),
			new Emp(3, "pravte", "it", 2000L),
			new Emp(4, "ventates", "HR", 4000L), 
			new Emp(5, "mani", "Admin", 2000L),
			new Emp(5, "siri", "HR", 2000L));
	
	Optional<Emp> hightEmp = empobj.stream().max(Comparator.comparingLong(Emp::getSal));
	System.out.println("Max  Salary in the Emp "+hightEmp.get().getName() + " : " + hightEmp.get().getSal());
	 
	Map<String , Optional<Emp>>  dephigh =  empobj.stream().collect(Collectors.groupingBy(Emp::getDep,Collectors.maxBy(Comparator.comparingLong(Emp::getSal))));
		

	dephigh.forEach((dep,emp) -> 
	System.out.println( " in Dep Highte is the  "+dep+ ": " + emp.get().getSal()));
	
	
	    }
	}  

