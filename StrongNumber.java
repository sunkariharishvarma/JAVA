package project1;
import java.util.Scanner;
public class StrongNumber
{
	public static void main(String[] args) 
	{
		int rem,temp = 0,sum=0,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to check its strong number or not");
		int num1=s.nextInt();
		while(num1!=0)
		{
			rem=num1%10;
			while(rem>=1)
			{
				 
				fact=fact*rem;
				rem--;
			}
			sum+=fact;
			fact=1;
			num1=num1/10;
		}
		if(temp==sum)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}

	}

}
