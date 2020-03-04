package project1;
import java.util.Scanner;
public class EvenOdd 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to check the even or odd");
		num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("its even number"+num);
		}
		else
		{
			System.out.println("its odd num"+num);
		}

	}

}
