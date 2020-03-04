package project1;
import java.util.Scanner;
public class Salary 
{
	public static void main(String[] args) 
	{
		double basic,hra,da,gs;
		Scanner s=new Scanner(System.in);
		System.out.println("enter basic salary");
		basic=s.nextFloat();
		if(basic<=10000)
		{
			hra=(basic*0.8);
			da=(basic*0.3);
		}
		else if(basic<=20000)
		{
			hra=(basic*0.85);
			da=(basic*0.35);
		}
		else
		{
			hra=(basic*0.9);
			da=(basic*0.4);
		}
		gs=basic+hra+da;
			System.out.println("hra" +hra);
			System.out.println("da" +da);
			System.out.println("grass" +gs);
	}

}
