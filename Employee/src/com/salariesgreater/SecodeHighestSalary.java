package com.salariesgreater;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
                new Emp(7, "siri", "HR", 2000L) ,
                new Emp(8, "Apply", "HR", 2500L) 
        );
        
       Map<String, List<Emp>> second = empobj.stream()
    		   .collect(Collectors.groupingBy(Emp::getDep));
       
       
       second.forEach((department, employees) -> {
           List<Long> sortedSalaries = employees.stream()
                   .map(Emp::getSal)
                   .sorted((sal1, sal2) -> Long.compare(sal2, sal1)) 
                   .collect(Collectors.toList());

           
           if (sortedSalaries.size() >= 2) {
               System.out.println("Department: " + department);
               System.out.println("Second Highest Salary: " + sortedSalaries.get(1));
           }
       });
        		
    }
        
        
      
}

/*
 * empobj.stream():-  converts the list into a stream of Emp objects

 * collect():-  method is used to accumulate the results of the stream operations.
 
 * Collectors.groupingBy(Emp::getDep):-  is a collector that groups the employees based on their department. Here, 
   Emp::getDep is a method reference that refers to the getDep() method in the Emp class, which presumably returns the department of an employee.
   
 * The result is stored in a Map<String, List<Emp>>, where the key is the department name (a String), and the value is a list of employees belonging to that department.  
 */


/* 
1.  employeesByDepartment is likely a Map where each key is a department (of type String, for example), and the value is a collection (like a List) of employees belonging
     to that department.
2. The forEach method is used to iterate over each entry in the map. For each department, it provides two parameters: department (the key) and employees (the value).

3.   employees into a Stream, allowing for functional-style operations.
4.  .map(Emp::getSal) applies the getSal method of the Emp class to each employee object in the stream. This method presumably returns the salary of an employee as a Long. 
    The result is a stream of salaries.
    
5.  The .sorted() method sorts the stream of salaries. The lambda expression (sal1, sal2) -> Long.compare(sal2, sal1) specifies that the sorting should be done in descending order. 
    This is achieved by comparing sal2 to sal1, which effectively reverses the natural order of sorting (ascending).   
    
6. Finally, .collect(Collectors.toList()) collects the sorted salaries into a new List<Long>. This list will contain the salaries in descending order.     
 
 
  */
	

