package project2;
import java.util.Scanner;
interface Bank
{
	public boolean withdraw(int amt);
	public boolean deposite(int amt);
	public boolean validate(int pin);
	public int viewoptions();
}
public class BankOperations implements Bank
{
	int pincount=1;
	double acbal=10000;
	Scanner s=new Scanner(System.in);
			boolean status=false;
			public boolean validate(int pin)
			{
				if(pin==1234)
				{
					status=true;
				}
				else
				{
					pincount++;
					if(pincount<=3)
					{
						System.out.println("invali pin please try again");
						System.out.println("re enter your pin");
						pin=s.nextInt();
						validate(pin);
					}
					else
					{
						System.out.println("your card is block 24 hours");
					}
				}
				return status;
			}
			public int viewoptions()
			{
				System.out.println("1.deposite");
				System.out.println("2.withdraw");
				System.out.println("3.balance enquiry");
				System.out.println("4.enter your option");
				int opt=s.nextInt();
				return opt;
			}
			public boolean deposite(int amt)
			{
				boolean b=false;
				if(amt%100==0)
				{
					if(amt<=50000)
					{
						acbal+=amt;
						b=true;
					}
					else
					{
						System.out.println("deposit limit 50000 only");
					}
				}
				else
				{
					System.out.println("invalid amount");
				}
				return b;
			}
			public boolean withdraw(int amt)
			{
				boolean b=false;
				if(amt%100==0)
				{
					if(amt<=acbal)
					{
						if(amt<=2000)
						{
							acbal-=amt;
							b=true;
						}
					}
				}
				return b;
			}
}

