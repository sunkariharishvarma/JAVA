package project1;
import java.util.Scanner;
public class palindram 
{
	public static void main(String[] args)
	{
		int rev=0,rem,temp;
		Scanner s=new Scanner(System.in);
				 System.out.println("enter a number");  
				 int num=s.nextInt();
				 temp=num;
				 while(num!=0)
				 {
					 rem=num%10;
					 rem=rev*10+rem;
					 num=num/10;
				 }
				 if(rev==temp)
				 {
					 System.out.println("its a palindram");
				 }
				 else
				 {
					 System.out.println("not palindram");
				 }
	}

}
