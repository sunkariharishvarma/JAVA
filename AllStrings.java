package project2;
import java.util.Scanner;
public class AllStrings
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		System.out.println(str.length());
		for(int i=0;i<str.length();i++)
		{
			str.charAt(i);
		}
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.contains("hii"));
		System.out.println(str.equals("hii hello harish"));
		System.out.println(str.equalsIgnoreCase("Hii hEllo harish"));
		System.out.println(str.length());
		System.out.println(str.startsWith("hii"));
		System.out.println(str.endsWith("sh"));
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,9));
		System.out.println(str.trim());

	}

}
