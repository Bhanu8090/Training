package com.bs.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain{

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "d", 100));
        empList.add(new Employee(3, "a", 200));
        empList.add(new Employee(5, "v", 300));
        empList.add(new Employee(2, "f", 400));
        empList.add(new Employee(4, "b", 500));
        

        for(Employee i: empList) {
        	if(((Employee) i).getSal()>=300)
        		System.out.println(i);
        	}
        }
	}
	
	
