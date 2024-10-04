package com.hemuworld.springdemo;

public class Student {

	private int studentId;
	private String studentName;
	private String studentAddress;
	
	public Student() {
		super();
	}
	
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public int getStudentId() {
		System.out.println("getStudentId");
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("setStudentId");
		this.studentId = studentId;
	}
	public String getStudentName() {
		System.out.println("getStudentName");
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("setStudentName");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		System.out.println("getStudentAddress");
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("setStudentAddress");
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}


}
