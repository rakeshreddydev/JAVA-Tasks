
class thr2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
	    {
	    	System.out.println("World");
	    }
	}
}
public class runnable_threadimpl {

	public static void main(String[] args) 
	{
		thr2 t2 = new thr2();
		Thread t = new Thread(t2);
		t.start();
		
		for(int i=0;i<10;i++)
	    {
	    	System.out.println("System");
	    }
	}
}
