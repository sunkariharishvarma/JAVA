
public class ThreadPriorityExample2 extends Thread
{
	public void run()
	{
		for(int i=0;i<15;i++)
		{
			System.out.println("child thread");
		}
	}
	public static void main(String[] args)
	{
		ThreadPriorityExample2 obj=new ThreadPriorityExample2();
		obj.start();
		Thread.currentThread().setPriority(10);
		for(int i=0;i<15;i++)
		{
			System.out.println("main");
		}

	}

}
