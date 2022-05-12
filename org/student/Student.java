package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public static void main(String[] args) {

		// week3.day1 assigment2( multilevel inheritance)
		// create Methods for CollegeName, CollegeCode and CollegeRank
		

		// College obj1 = new College();
		// Department obj2 = new Department();
		
		//create object for Student class and call all the methods of College and Department
		Student obj3 = new Student();
		obj3.collegeName();
		obj3.collegeCode();
		obj3.collegeRank();
		obj3.depName();
		obj3.studentName();
		obj3.studentDept();
		obj3.studentId();

	}

	public void studentName() {
		System.out.println("Student Name is XXXX");
	}

	public void studentDept() {
		System.out.println("Student Department is B.tech");
	}

	public void studentId() {
		System.out.println("Student ID is 14569");
	}

}
