package project1;
import java.util.Scanner;
public class Armstrong 
{
	public static void main(String[] args)
	{
	int sum=0,rem,digits=0,temp;
	Scanner s=new Scanner(System.in);
	System.out.println("enter number to chect its strong number or not");
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
	}

