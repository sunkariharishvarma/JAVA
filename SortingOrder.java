package collections;
import java.util.Scanner;
import java.util.TreeSet;
public class SortingOrder
{
	public static void main(String[] args)
	{
		int i,max=0,smax=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
		System.out.println("enter"+n+"values");
		TreeSet ts=new TreeSet();
		for(i=0;i<n;i++)
		{
			ts.add(s.nextInt());
		}
		System.out.println(ts);
		//System.out.println(ts.descendingSet());

	}

}
