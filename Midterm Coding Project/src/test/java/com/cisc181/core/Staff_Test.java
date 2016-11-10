package com.cisc181.core;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.cisc181.eNums.eTitle;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.core.PersonException;
import com.cisc181.core.*;
import com.cisc181.core.Staff;
public class Staff_Test {
	static ArrayList<Staff> StaffList = new ArrayList<Staff>();
	@BeforeClass
	public static void setup() throws PersonException{
		Staff A=new Staff("Naruto","Null", "Uzumaki", Date(1997,1,18), "606 Canton Dr", "(302)-432-2346", "cisc181@udel.edu", "time", 1, 1000, Date(2015,1,1), eTitle.MR);
		Staff B=new Staff("Sasuke","Null", "Uchiha", Date(1978,4,7), "503 Canton Dr", "(254)-623-1352", "cisc181@udel.edu", "time", 2, 2000, Date(2057,6,2), eTitle.MS);
		Staff C=new Staff("Sakura","Null", "Haruno", Date(1900,1,4), "20 Ray", "5423246523", "cisc181@udel.edu", "time", 3, 3000, Date(1876,9,21), eTitle.MRS);
		Staff D=new Staff("Madara","Null", "Uchiha", Date(1972,6,7), "301 Acedamy", "1234567890", "cisc181@udel.edu", "time", 4, 4000, Date(2016,10,16), eTitle.MS);
		Staff E=new Staff("Kakashi","Null", "Hatake", Date(1949,10,1), "1 Changanjie", "0987654321", "cisc181@udel.edu", "time", 5, 5000, Date(1900,1,1), eTitle.MRS);
		StaffList.add(A);
		StaffList.add(B);
		StaffList.add(C);
		StaffList.add(D);
		StaffList.add(E);
	}
	
	private static Date Date(int Year, int Month, int Day) {
		Calendar calendar=Calendar.getInstance();
		Date date=new Date(Year, Month, Day);
		calendar.setTime(date);
		return calendar.getTime();
	}

	@Test
	public void testOfSalary() {
		double temp=0;
		for (Staff i: StaffList)
			temp+=i.getSalary();
		assertEquals(3000,(temp/5.0), 0);
	}	
	public void testOfPhone() throws PersonException{
		Staff f=new Staff("Fn","Mn","Ln",Date(1987,1,1),"432 College Ave","4236351436","cisc181@udel.edu", "time", 6, 8000, Date(2012,1,6), eTitle.MR);
	}
	public void testOfBOD() throws PersonException{
		Staff C=new Staff("Sakura","Null", "Haruno", Date(1900,1,4), "20 Ray", "5423246523", "cisc181@udel.edu", "time", 3, 3000, Date(1876,9,21), eTitle.MRS);
		
	}
}
