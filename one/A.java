package one;



/*public class A
{ 
	

	protected void m1() 
	{ 

		System.out.println("inside a"); 

	} 
	
} */

public class A
{
  private static class C 
  {
	public void m2()
	{
		System.out.println("protected classes");
	}

  }
  public static class d extends C
  {
	  
  }
}
