
public class x
{
 
  public static void main(String[] args)
  {
	  y.C yob=new y.C();
	  
  }
}
class y
{
  private class C extends y
  {
	void m2()
	{
		System.out.println("protected classes");
	}

  }

}