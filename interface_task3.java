interface Arithmetic
{
    int operation(int r1,int r2);
   
}
class Sum implements Arithmetic
{
	public int operation(int a1,int a2)
	{
		return a1+a2;
	}
    
}
class Subtract implements Arithmetic
{
	public int operation(int r1,int r2)
	{
		return r1-r2;
	}
    
}

class interface_task3
{ 

	public static void main(String[] args)
	{
		Arithmetic a = new Sum(); 
		Arithmetic b = new Subtract(); 
		System.out.println("Sum of 1 and 2 is " + a.operation(1,2)); 
		System.out.println("Subtract of 3 and 1 is "+ b.operation(3,1)); 
	}


} 

