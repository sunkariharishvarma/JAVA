package project1;
import java.util.Scanner;
public class PerfectNumber
{
	public static void main(String[] args)
	{
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to chect its perfect or not");
		int n=s.nextInt();
		for(i=1;i<n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("i");
		}
		if(sum==n)
		{
			System.out.println("its perfect number");
		}
		else
		{
			System.out.println("not perfect");
		}
		


	}

}
