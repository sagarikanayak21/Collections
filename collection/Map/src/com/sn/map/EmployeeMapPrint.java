package com.sn.map;

import java.util.HashMap;
import java.util.Map;

import com.sn.map.entity.Employee;

public class EmployeeMapPrint {
	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap();
		
		Employee emp1 = new Employee(102, "Sagarika", 500.80);
        Employee emp2 = new Employee(103, "Mama", 200.40);
        Employee emp3 = new Employee(101, "Lucky", 700.20);
        
        map.entrySet();
		
		
	}
}
