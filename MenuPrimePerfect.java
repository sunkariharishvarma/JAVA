package project1;
import java.util.Scanner;
public class MenuPrimePerfect
{
	public void prime(int n)
	{
	int i,fc=0;
	for(i=1;i<=n/2;i++)
	{
		if(n%i==0)
		{
			fc++;
		}
	}
	if(fc==1)
	{
		System.out.println("prime number"+n);
	}
	else
	{
		System.out.println("not a prime number"+n);
	}
	}
	public void perfect(int n)
	{
		int i,sum=0;
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}	
		if(sum==n)
		{
			System.out.println("its perfect number"+n);
		}
		else
		{
			System.out.println("not a perfect"+n);
		}
	}
	public void reverse(int n)
	{
		int rev=0,rem=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("rev"+rev);
	}
	public void viewoperations()
	{
		int n,opt=0;
		
			Scanner s=new Scanner(System.in);
			System.out.println("1.prime number");
			System.out.println("2.perfect number");
			System.out.println("3.reverse number");
			do 
			{
			System.out.println("enter option between 1-3");
			opt=s.nextInt();
			if(opt==1)
			{
				System.out.println("to check is primenumber or not");
				n=s.nextInt();
				prime(n);
			}
			else if(opt==2)
			{
				System.out.println("perfect");
				n=s.nextInt();
				perfect(n);
			}
			else if(opt==3)
			{
				System.out.println("reverse number");
				n=s.nextInt();
				reverse(n);
			}
			
		}
		while(opt!=0);
	}

	public static void main(String[] args) 
	{
		MenuPrimePerfect obj=new MenuPrimePerfect();
		obj.viewoperations();
	}

}
