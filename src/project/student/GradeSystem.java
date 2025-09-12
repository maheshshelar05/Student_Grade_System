package project.student;

public class GradeSystem extends student implements Result{

	public GradeSystem(int rollNo, String name, int[] marks) {
		super(rollNo, name, marks);
		
	}

	@Override
	public void calculateResult() {
		
		int[] m=getMarks();
		
		int total=0;
		
		for(int i=0; i<m.length;i++)
		{
			total=total+m[i];
		}
		
		double avarage= total/3f;
		String grade="";
		if(avarage>=75)
			grade="A";
		else if(avarage>=60)
			grade="B";
		else if(avarage>=40)
			grade="C";
		else 
			grade="Fail";
		
		
		System.out.println("Roll No : "+getRollNo());
		System.out.println("Name : "+getName());
		System.out.println("Total : "+total);
		System.out.println("Average : "+avarage);
		System.out.println("Grade : "+grade);
		System.out.println("___________________________");
		
	}
	
	

}
