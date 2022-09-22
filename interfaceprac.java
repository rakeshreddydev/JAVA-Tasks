interface m1
{
	int add(int n1,int n2);
	
}
public class interfaceprac implements m1
{
	
	public int add(int n1,int n2)
	{
		return n1+n2;
	}

	public static void main(String[] args) 
	{
		
		interfaceprac p1=new interfaceprac();
		p1.add(50, 60);

	}

}
