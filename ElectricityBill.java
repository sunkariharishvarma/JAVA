package project1;
import java.util.Scanner;
public class ElectricityBill
{
	public static void main(String[] args) 
	{
		double bill;
		Scanner s=new Scanner(System.in);
		System.out.println("enter units");
		int unit=s.nextInt();
		if(unit<=50)
		{
			bill=unit*0.5;
		}
		else if(unit<=150)
		{
			bill=(50*0.5)+(unit-50)*0.75;
		}
		else if(unit<=250)
		{
			bill=(50*0.5)+(100*0.75)+(unit-150)*1.20;
		}
		else
		{
			bill=(50*0.5)+(100*0.75)+(100*1.20)+(unit-250)*1.20;
		}
		bill=bill+(bill*20)/100;
		System.out.println(bill);
	}

}
