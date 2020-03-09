package project1;
import java.util.Scanner;
public class FunctionArmstrong
{
	int digits=0,rem,start,end,temp,stop,opt;
	double sum=0,number;
	public void armstrong(int start,int end)
	{
		while(start<=end)
		{
			temp=start;
			while(start!=0)
			{
				start=start/10;
				digits++;
			}
			start=temp;
			while(start!=0)
			{
				rem=start%10;
				sum=sum+Math.pow(rem,digits);
				start=start/10;
			}
			start=temp;
			if(sum==start)
			{
				System.out.println("armstrong number      "+ sum);
			}
			start++;
			digits=0;
			sum=0;
		}
	}
	public void strong(int start,int stop)
	{int fact=1;
		while(start<=stop)
		{
			temp=start;
			while(start!=0)
			{
				rem=start%10;
			for(int i=1;i<=rem;i++)
				{
					fact=fact*i;
				}
				sum+=fact;
				fact=1;
				start=start/10;
			}
		
		start=temp;
		if(start==sum)
		{
			System.out.println(start);
		}
		sum=0;
		fact=1;
		start++;
		}
		
	}
	public void input()
	{
		System.out.println("enter start and stop numbers");
		Scanner s=new Scanner(System.in);
		start=s.nextInt();
		stop=s.nextInt();
		
	}
	public void option()
	{
		
		System.out.println("1.Armstrong");
		System.out.println("2.strong number");
		do
		{
			System.out.println("enter an option");
			Scanner s=new Scanner(System.in);
			int opt=s.nextInt();
			if(opt==1)
			{
				input();
				armstrong(start,stop);
			}	
			else if(opt==2)
			{
				input();
				strong(start,stop);
			}
		}
		while(opt!=0);
	
	}
	public static void main(String[] args)
	{
		FunctionArmstrong obj=new FunctionArmstrong();
		obj.option();

	}

}







