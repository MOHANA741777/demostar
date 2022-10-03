package org.test;

import org.test1.Location;

public class BasicClass {
 public void  studentDetails() {
	 System.out.println("The student name is Mohana");
 }
	public static void main(String[] args) {	
	 BasicClass b = new BasicClass();
	 b.studentDetails();
	 CourseName c = new CourseName();
	 c.nameOfCourse();
	 Location l = new Location();
	 l.exactLocation(); 
	} 
}

