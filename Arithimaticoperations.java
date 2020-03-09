package project1;
import java.util.Scanner;
public class Arithimaticoperations
{
	public void add()
	{
	int c;
	System.out.println("enter values");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	c=a+b;
	System.out.println("add"+c);
	}
	public void mul()
	{
		int c;
		System.out.println("enter values");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		c=a*b;
		System.out.println("mul"+c);
	}

	public static void main(String[] args)
	{
		Arithimaticoperations obj=new Arithimaticoperations();
		obj.add();
		obj.mul();

	}

}
