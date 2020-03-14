package project2;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		BankOperations obj=new BankOperations();
		System.out.println("enter pin");
		int pin=s.nextInt();
		boolean status=obj.validate(pin);
		int i=0,amt;
		if(status)
			do
			{
				i=obj.viewoptions();
				if(i==1)
				{
					System.out.println("enter deposite amount");
					amt=s.nextInt();
					obj.deposite(amt);
				}
				else if(i==2)
				{
					System.out.println("enter withdraw amt");
					amt=s.nextInt();
					obj.withdraw(amt);
				}
				else if(i==3)
				{
					
				}
				else if(i==0)
				{
					System.out.println("thank you");
				}
				else
				{
					System.out.println("invalid option");
				}
			}
			while(i!=0);
	}

}
