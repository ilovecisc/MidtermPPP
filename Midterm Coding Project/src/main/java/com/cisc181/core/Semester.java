package com.cisc181.core;
import java.util.UUID;
import java.util.Date;
public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	public Semester(){	
	}
	public Semester(UUID semesterID, Date startDate, Date endDate) {
		SemesterID=semesterID;
		StartDate=startDate;
		EndDate=endDate;
	}
	public void setSemesterID(UUID semesterID) {
		this.SemesterID=semesterID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setStartDate(Date startDate) {
		this.StartDate=startDate;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setEndDate(Date endDate) {
		this.EndDate=endDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
}
