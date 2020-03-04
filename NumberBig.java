package project1;
import java.util.Scanner;
public class NumberBig 
{
	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter num1 and num2 values");
		num1=s.nextInt();
		num2=s.nextInt();
		
		if(num1>num2)
		{
			System.out.println("num1 is big"+num1);
		}
		else
		{
			System.out.println("num2 is big"+num2);
		}
		
	}

}
