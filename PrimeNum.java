package project1;
import java.util.Scanner;
public class PrimeNum 
{
	public static void main(String[] args) 
	{
		int fc=0,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to check its prime or not");
		int n=s.nextInt();
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				fc++;
			}
		}
		System.out.println("no of factor");
		if(fc==1)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}

}
