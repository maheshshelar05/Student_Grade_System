package project.student;

public class student {

	private int rollNo;
	private String name;
	private int marks[];
	
	public student(int rollNo,String name,int marks[])
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
	public int[] getMarks()
	{
		return marks;
	}
}
