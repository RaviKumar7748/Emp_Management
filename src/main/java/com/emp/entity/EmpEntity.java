package com.emp.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class EmpEntity {
	private String Name;

	private String Address;

	private String Email;

	private Long PhoneNumber;

	private Double Salary;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "EmpEntity [Name=" + Name + ", Address=" + Address + ", Email=" + Email + ", PhoneNumber=" + PhoneNumber
				+ ", Salary=" + Salary + "]";
	}

}
