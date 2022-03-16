package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayInt {

	public static void main(String args[]) {
		Employe emp3 = new Employe(100,"pqas","vishwa");
		Employe emp = new Employe(100,"ash","vishwa");
		Employe emp4 = new Employe(100,"ash","xyz");
		Employe emp2 = new Employe(100,"xyz","vishwa");
		List<Employe> lst = new ArrayList<>();
		
		lst.add(emp);
		lst.add(emp2);
		lst.add(emp3);
		lst.add(emp4);

		
		Comparator<Employe> com2 = new Comparator<Employe>() {
			
			@Override
			public int compare(Employe o1, Employe o2) {
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
			
		};
		
		Collections.sort(lst, com2);
		lst.stream().forEach(i -> System.out.println(i.empName + " " +i.empLastName));
		
	}
	
}

class Employe implements Comparable<Employe>{
	int employeeId;
	String empName;
	String empLastName;
	
	public Employe(int employeeId, String empName, String empLastName) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.empLastName = empLastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	@Override
	public int compareTo(Employe o) {
		
		return this.empLastName.compareTo(o.empLastName);
	}
	
	
}
