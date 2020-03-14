package project2;
import java.util.Scanner;
public class Programmes
{
	public void factors()
	{
		int num,i,fc=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				fc++;
				System.out.println("no of factors"+i);
			}
		}
		
	}
	public void rev()
	{
		int rev=0,num,temp,rem;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse num"+rev);
	}
	public void prime()
	{
		int fc=0,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				fc++;
			}
		}
		if(fc==1)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	public void Armstrong()
	{
		int sum=0,rem,digits=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to chect its armstrong number or not");
		int num=s.nextInt();
		temp=num;
		while(num!=0)
		{
			num=num/10;
			digits++;
		}
		num=temp;
		while(num!=0)
		{
			rem=num/10;
			sum+=Math.pow(num%10, digits);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}
	}
	public void evenoddsum()
	{
		int i=1,num,esum=0,osum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		for(i=1;i<n;i++)
		{
		if(i%2==0)
		{
			esum=esum+i;
		}
		else
		{
			osum=osum+i;
		}
		}
		System.out.println("sum of even"+esum);
		System.out.println("sum of even"+osum);
	}
	

	public static void main(String[] args)
	{
		Programmes obj=new Programmes();
		obj.factors();
		obj.rev();
		obj.prime();
		obj.Armstrong();
		obj.evenoddsum();
	}

}
