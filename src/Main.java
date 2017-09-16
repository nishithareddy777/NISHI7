import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup stugrp=new StudentGroup(10);
		Date d=new Data(1997,01,25);
		Student s1=new Student(89,"dhriti",d,61.0);
		stugrp.addFirst(s1);
		system.out.println(stugrp.getStudent(0).getId());
	}

}
