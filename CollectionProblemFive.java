import java.util.*;
public class CollectionProblemFive
{
	public static void main(String[] args) 
	{ 

		String[] names = {"abcd", "efgh", "ijkl", "abcd","mnop", "qrst", "uvw", "xyz"}; 
		List<String> EVEN=new ArrayList<String>();
		List<String> ODD=new ArrayList<String>();
		for(int i=0;i<names.length;i++)
		{
			if(((names[i].length())%2)==0)
			{
				EVEN.add(names[i]);
			}
			else
			{
				ODD.add(names[i]);
			}
			
		}
		System.out.println("Even Length"+EVEN);
		System.out.println("Odd Length"+ODD);

	} 

}
