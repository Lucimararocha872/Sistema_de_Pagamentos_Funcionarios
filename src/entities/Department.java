package entities;

import java.util.ArrayList;
import java.util.List;


public class Department {

	private String name;
	private Integer payDay;

	private Address address;

	private List<Employee> employees = new ArrayList<>();

	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> employee() {
		return employees;
	}

	public void addEmployee(Employee item) {
		employees.add(item);
	}

	public void removeEmployee(Employee item) {
		employees.remove(item);
	}

	public Double payroll() {
		Double sum = 0.0;
		for (Employee salary : employees) {
			sum += salary.getSalary();
		}
		return sum;
	}
}