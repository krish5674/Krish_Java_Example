package corejava;

class Student
{
	 int rno;
	 String sname;
	 Student()
	 {
		 System.out.println("Deafult constructor");
		 
	 }
	 Student(int rno,String sname)
	 {
		this();
		this.rno=rno;
		this.sname=sname;
	 }
	 void display(Student s)
	 {
		 System.out.println("Roll No : "+s.rno);
		 System.out.println("Student Nmae : "+s.sname);
		 
	 }
	 void show()
	 {
		this.display(this);
	 }
	 
}

public class ThisDemo {

}
