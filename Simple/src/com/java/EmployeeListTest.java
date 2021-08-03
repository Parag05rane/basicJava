package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeListTest {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Parag", 25));
		l.add(new Employee("Ajay", 2));
		l.add(new Employee("Rohit", 3));
		l.add(new Employee("Sonam", 15));

		System.out.println(l);

		List<String> name = new ArrayList<String>();

		for (Employee e : l) {
			if (e.getId() > 10) {
				name.add(e.getName());
			}
		}
		System.out.println(name);

		List<String> nst = l.stream().filter(Employee -> Employee.getId() > 10).map(Employee -> Employee.getName())
				.collect(Collectors.toList());

		System.out.println(nst);
		
		System.out.println(EmployeeListTest.Get("Parag Rane"));

	}

	public static String Get(String nm) {
		try {
			return nm;
		} catch (Exception e) {
			return null;
		} finally {
			System.out.println("Final block");
		}
	}

}
