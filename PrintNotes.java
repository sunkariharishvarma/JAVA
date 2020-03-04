 package project1;
 import java.util.Scanner;
public class PrintNotes 
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter amt");
		int amt=s.nextInt();
		if(amt%100==0)
		{
			if(amt>=2000)
			{
				a=amt/2000;
				amt=amt-(a*2000);
				System.out.println("2000 rupees notes are"+a);
				if(amt>=500)
				{
					b=amt/500;
					amt=amt-(b*500);
					System.out.println("500 rupees notes are"+b);
					if(amt>=100)
					{
						c=amt/100;
						System.out.println("100 rupees notes are");
					}
					else
					{
						System.out.println("invalid amt");
					}
				}
			}
		}
		
		
	
	}
}