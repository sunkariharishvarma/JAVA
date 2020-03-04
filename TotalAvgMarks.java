package project1;
import java.util.Scanner;
public class TotalAvgMarks 
{
	public static void main(String[] args) 
	{
		int s1,s2,s3,total,avg;
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks");
		int mark=s.nextInt();
		s1=s.nextInt();
		s2=s.nextInt();
		s3=s.nextInt();
		total=s.nextInt();
		avg=s.nextInt();
		if(s1>=48 && s2>=48 && s3>=48)
		{
			total=s1+s2+s3;
			avg=total/3;
			System.out.println("total marks"+total);
			System.out.println("avg marks"+avg);
		}
		else
		{
			System.out.println("fail");
		}
	}

}
