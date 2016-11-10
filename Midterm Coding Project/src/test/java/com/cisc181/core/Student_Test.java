package com.cisc181.core;
import java.util.Date;
import static org.junit.Assert.*;
import com.cisc181.eNums.eMajor;
import java.util.ArrayList;
import java.util.Calendar;
import com.cisc181.core.Student;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {
	static ArrayList<Course> coursesList=new ArrayList<Course>();
	static ArrayList<Student> studentList=new ArrayList<Student>();
	static ArrayList<Semester> semesterList=new ArrayList<Semester>();
	static ArrayList<Section> sectionList=new ArrayList<Section>();
	@BeforeClass
	public static void setup() throws PersonException{
		Course.add(new Course("Business", 202, eMajor.PHYSICS));
		Course.add(new Course("Chemistry", 303, eMajor.CHEM));
		Course.add(new Course("Nursing", 404, eMajor.NURSING));
	}
	@Test
	public void test() {
		assertEquals(1, 1);
	}
}