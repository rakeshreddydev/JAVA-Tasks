class thread2 extends Thread
{
 public void run()
 {
	for(int i=0;i<10;i++)
	{
	System.out.println("Increments");
	}
 }
}

public class thread1{
	
	public static void main(String[] args) {
		
         thread2 t1=new thread2();
         t1.start();
         for(int i=0;i<10;i++)
     	{
     	System.out.println("System");
     	}
	}
}
