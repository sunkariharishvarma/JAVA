package project1;
import java.util.Scanner;
public class NumberDigits 
{
	public void numberofdigits()
	{
	int digits=0;
		System.out.println(" to find out no of digits given number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		while(num!=0)
		{
			num=num/10;
			digits++;
		}
		System.out.println("no of digits"+digits);
	
	}

	

	public static void main(String[] args)
	{
		NumberDigits obj=new NumberDigits();
		obj.numberofdigits();
		

	}

}
