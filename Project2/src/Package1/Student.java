package Package1;

public class Student 
{
	int age,rollNo,studentID;
	public void Auto1() 
	{
		System.out.println("Automation is Very Easy.");
	}
	public void Auto2() 
	{
		System.out.println("Welcome to all of you.");
	}
	public static void main(String[] args) 
	{
		Student ref=new Student();
		ref.Auto1();
		ref.Auto2();
		ref.age=40;
		ref.rollNo=44568973;
		ref.studentID=1234;
		System.out.println(ref.age);
		System.out.println(ref.rollNo);
		System.out.println(ref.studentID);
	}
}	
