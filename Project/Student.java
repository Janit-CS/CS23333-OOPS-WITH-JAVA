package Studentinfo;

public class Student
{
	String name;
	int roll;
	public Student(String name, int roll)
	{
		this.name = name;
		this.roll = roll;
	}
	public void studdisp()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+roll);
	}
}