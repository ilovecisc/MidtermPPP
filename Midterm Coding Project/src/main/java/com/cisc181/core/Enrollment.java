package com.cisc181.core;
import java.util.UUID;
import com.cisc181.eNums.*;
public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	private Enrollment() {
	}
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.StudentID=StudentID;
		this.SectionID=SectionID;
		this.EnrollmentID=UUID.randomUUID();
	}
	public void setGrade(double Grade) {
		this.Grade=Grade;
	}
	public double getGrade() {
		return this.Grade;
	}
	public void setStudentID(UUID studentID) {
		StudentID=studentID;
	}
	public UUID getStudentID() {
		return this.StudentID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID=sectionID;
	}
	public UUID getSectionID() {
		return this.SectionID;
	}
}