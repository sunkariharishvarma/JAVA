package collections;
import java.util.Scanner;
import java.util.TreeSet;
public class SecondMax 
{
	public static void main(String[] args)
	{
		int i,max=0,smax=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
		System.out.println("enter"+n+"values");
		TreeSet ts=new TreeSet();
		for(i=1;i<n;i++)
		{
			ts.add(s.nextInt());
		}
		for(Object obj:ts)
		{
			int value=Integer.parseInt(obj.toString());
			if(max<value)
			{
				smax=max;
				max=value;
			}
			else if(smax<value)
			{
				smax=value;
			}
		}
		System.out.println("max : "+max);
        System.out.println("smax : "+smax);

	}

}
