package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import com.cisc181.core.Person;
import java.util.regex.Matcher;
public class PersonException extends Exception {
	private Person ifValid;
	private String Number;
	private Date DOB;
	public PersonException(Person ifValid) {
		super();
		this.ifValid=ifValid;
	}
	public Person getifValid() {
		return ifValid;
	}
	public void setNumber(String newNumber) throws Exception{
		Number=newNumber;
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		Pattern pattern = Pattern.compile(regex);
		if(pattern.matcher(Number).matches()){
			return;
		}
		else{
			throw new Exception(this);
		}
	}
	public Date getDOB(){
		return DOB;
	}
	public void serDOB(Date DOB) throws Exception{
		this.DOB=DOB;
		Calendar today=Calendar.getInstance();
		Calendar birthDate=Calendar.getInstance();
		birthDate.setTime(this.DOB);
		int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
		if(age>100){
			throw new Exception(this);
		}
	}
}