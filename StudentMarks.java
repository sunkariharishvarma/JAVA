package project1;
import java.util.Scanner;
public class StudentMarks 
{
	public static void main(String[] args) 
	{
		int marks;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the marks");
		int mark=s.nextInt();
		if(mark<50)
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("pass");
		}
	}

}
