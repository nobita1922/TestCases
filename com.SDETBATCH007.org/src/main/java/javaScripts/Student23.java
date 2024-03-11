package javaScripts;

public class Student23 {
	int srollno;
	String sname;
	long scontact;
	Student23(String name, int rollno, long contact) {
		this.sname = name;
		this.srollno = rollno;
		this.scontact = contact;
	}
	public static void main(String[] args) {
		Student23 s1 = new Student23("SDET", 007, 999999999999L);
		System.out.println(s1.sname);
		System.out.println(s1.srollno);
		System.out.println(s1.scontact);

		Student23 s2 = new Student23("abc", 123, 1234567890L);
		System.out.println(s2.sname);
		System.out.println(s2.srollno);
		System.out.println(s2.scontact);

		Student23 s3 = new Student23("xyz", 321, 9876543210L);
		System.out.println(s3.sname);
		System.out.println(s3.srollno);
		System.out.println(s3.scontact);

	}

}
