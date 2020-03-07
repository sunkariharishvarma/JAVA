package project1;
import java.util.Scanner;
public class ReverseNum 
{
	public static void main(String[] args)
	{
	int rev=0,rem,temp;
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int num=s.nextInt();
	temp=num;
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println("reverse number"+rev);
	}

}
