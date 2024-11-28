package com.salariesgreater;

import java.util.Arrays;

import java.util.List;


public class SalaryGreater {
	
	public static void main(String[] args) {
        List<Emp> empobj = Arrays.asList(
                new Emp(1, "shiva", "it", 2000L),
                new Emp(2, "laxmi", "it", 3000L),
                new Emp(3, "pravte", "it", 2000L),
                new Emp(4, "ventates", "HR", 4000L),
                new Emp(5, "mani", "Admin", 2000L),
                new Emp(6, "siri", "HR", 2000L) 
        );

        
          empobj.stream().filter(e -> e.getSal() >= 2500L)
        .forEach(e -> System.out.println(e.getName() + "::" + e.getSal()));
        
    }

	 
}


/* .filter:-  operation is used to filter elements in the stream based on a given condition.
 *  Collectors.toList():-  method creates a new List containing the filtered elements */

