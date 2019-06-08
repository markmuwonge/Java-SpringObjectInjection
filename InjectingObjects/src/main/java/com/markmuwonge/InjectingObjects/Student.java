package com.markmuwonge.InjectingObjects;

public class Student {

	private int studentId;
	private String studentName;
	private University university;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setUniversity(University university) {
		this.university = university;
	}
	
	
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}


	public void enrolInUniversity(int studentId, String studentName) {
		university.enrolStudent(studentId, studentName);
	}



}
