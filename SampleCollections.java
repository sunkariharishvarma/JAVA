package collections;
import java.util.HashSet;
public class SampleCollections
{
	public static void main(String[] args)
	{
		
		   HashSet hs=new HashSet();
		   HashSet hs1=new HashSet();
		   hs1.add(23);
		   hs1.add("hai");
		   hs1.add('a');
		   
		   hs.add(23);
		   hs.add(new Integer(78));
		   hs.add(89.6);
		   hs.add("hai");
		   
		   hs.add(true);
		   hs.add("hai");
		   hs.add(23);
		   
		   System.out.println(hs);
		   hs.removeAll(hs1);
		   System.out.println(hs);
	

	}

}
