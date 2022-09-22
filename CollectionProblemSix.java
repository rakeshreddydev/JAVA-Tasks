import java.util.*;
public class CollectionProblemSix 
{
	public static void main(String[] args) 
	{ 

		String[] st = {"abcd", "efgh", "ijkl", "abcd","mnop", "qrst", "uvw",   "xyz"};
		List<String> l1=Arrays.asList(st);
		for(int i=0;i<l1.size();i++)
		{
			if(i%2==0)
			{
				l1.set(i,"Even");
			}
			else
			{
				l1.set(i,"Odd");
			}
		}
		System.out.println(l1);
	}
}
