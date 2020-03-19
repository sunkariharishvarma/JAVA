
public class ThreadExamplePriority extends Thread
{
	public void run()
	{
		System.out.println("child : "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) 
	{
		ThreadExamplePriority obj=new ThreadExamplePriority();
		obj.run();
		Thread.currentThread().setPriority(4);
		System.out.println("main : "+Thread.currentThread().getPriority());
	}

}