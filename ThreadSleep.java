public class ThreadSleep extends Thread
{
	public void run()
	{
		for(int i=0;i<15;i++)
		{
			System.out.println("child");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)
	{
		 ThreadSleep obj=new  ThreadSleep();
		 obj.start();
			for(int i=0;i<15;i++)
			{
				System.out.println("main");
				try{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
		 
		

	}

}
