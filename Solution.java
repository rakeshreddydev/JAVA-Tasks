

class Adder extends Arthimetic1
{
	/*int add(int m1,int m2)
	{
		return m1+m2;
	}*/
}

public class Solution{ 

public static void main(String []args)
{ 
Adder a=new Adder(); 
System.out.println("My superclass is:"+a.getClass().getSuperclass().getName());
System.out.print(a.add(10,32)+" "+a.add(10,3)+" "+a.add(10,10)+"\n"); 

} 

} 
