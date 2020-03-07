package project1;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[] args)
	{
		int num,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num1=s.nextInt();
		while(num1>1)
		{
			fact=fact*num1;
			num1--;
		}
		System.out.println("factorial number"+fact);

	}

}
