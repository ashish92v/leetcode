package com.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class EmployeeSort {


		public static void main(String args[]) {
			Employee2 emp3 = new Employee2(100,"pqas","vishwa");
			Employee2 emp = new Employee2(100,"ash","vishwa");
			Employee2 emp4 = new Employee2(100,"ash","xyz");
			Employee2 emp2 = new Employee2(100,"xyz","vishwa");
			List<Employee2> lst = new ArrayList<>();
			
			lst.add(emp);
			lst.add(emp2);
			lst.add(emp3);
			lst.add(emp4);

		
			Function<Employee2, String> empFirst = Employee2::getEmpName;
			Function<Employee2, String> empLast = Employee2::getEmpLastName;
			
			Comparator<Employee2> comp = Comparator.comparing(empFirst).thenComparing(empLast);
		
			lst.stream().sorted(comp).forEach(i -> System.out.println(i.empName + " " +i.empLastName));
			
		}
		
	}

	class Employee2{
		int employeeId;
		String empName;
		String empLastName;
		
		public Employee2(int employeeId, String empName, String empLastName) {
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

}
