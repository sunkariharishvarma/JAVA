package project1;
import java.util.Scanner;
public class Example
{
	public static void main(String[] args)
	{
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		str=s.nextLine();
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.contains("hii"));
		System.out.println(str.equals("hii hello"));
		System.out.println(str.equalsIgnoreCase("hii hello"));
		
		

	}

}
