package collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SampleCollection
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(34);
	    ts.add(78);
	    ts.add(38);
	    ts.add(90);
	    ts.add(12);
	    System.out.println(ts);
	    System.out.println(ts.descendingSet());

	}

}
