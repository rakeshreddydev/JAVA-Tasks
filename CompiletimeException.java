import java.io.*;
class User 
{
String name;
public void show() 
{
	System.out.println("Enter any name");
	FileWriter f1 = new FileWriter("d:\\Java Stuff\\newFile.txt");
	f1.write("rakesh");
	System.out.println("name="+name);
	f1.close();
}
}
class CompiletimeException
{
	public static void main(String args[])
	{
		User us=new User();
		us.show();
	}
}
