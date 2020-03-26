package collections;
import java.util.Scanner;
import java.util.TreeSet;
public class Top3 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
		TreeSet ts=new TreeSet();
		for(int i=1;i<n;i++)
		{
			ts.add(s.nextInt());
		}
		System.out.println("enter k value");
		int k=s.nextInt();
		if(k<=n)
		{
			while(ts.size()>k)
			{
				ts.remove(ts.last());
			}
			System.out.println(ts);
		}
		else
		{
			System.out.println("k value should be less than "+n);
		}

	}

}
