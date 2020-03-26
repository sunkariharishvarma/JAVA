package collections;
import java.util.Scanner;
import java .io.BufferedReader;
import java.io.FileReader;
import java.util.TreeSet;
public class NamesAsending
{
	public static void main(String[] args) 
	{
		try {
			BufferedReader br=new BufferedReader(new FileReader("D://students.info.txt"));
			TreeSet ts=new TreeSet();
			String line=null;
			while((line=br.readLine())!=null)
			{
				String std[]=line.split(" ,");
				ts.add(std[1]+", "+std[0]+", "+std[2]);
			}
			for(Object obj:ts.descendingSet())
			{
			System.out.println(obj);	
			}
		}
		catch(Exception e)
		{
			
		}

	}

}
