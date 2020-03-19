 interface Runnable
{
     public void run();
}
public class ThreadExample  implements Runnable
{
	public void run() 
	{
	  for(int i=0;i<=25;i++)
	  {
		  System.out.println("child");
	  }
	}

	public static void main(String[] args)
	{
		ThreadExample obj=new ThreadExample();
		Thread t=new Thread(obj);
		t.start();
		
		for(int i=0;i<=25;i++)
		  {
			  System.out.println("main");
		  }
		
	}


}