public class ThreadThrows extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args)  throws InterruptedException 
	{
		ThreadThrows obj=new ThreadThrows();
		ThreadThrows obj1=new ThreadThrows();
		Thread.currentThread().setName("harishvarma");
		obj.start();
		obj1.start();
		System.out.println(Thread.currentThread().getName());
	

	}

}
