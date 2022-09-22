
import java.util.*;

public class CollectionProblemFour 
{
	public static void main(String[] args) 
	{ 
		int count=0;
		String[] st = {"abcd", "efgh", "ijkl", "abcd","mnop","abcd","abcd","qrst", "uvw", "xyz"}; 
	
		List<String> l1=Arrays.asList(st);
		
		System.out.println(l1.lastIndexOf("abcd"));
	
		 Set<String> hSet = new HashSet<String>();
	      for (String x : l1)
	            hSet.add(x);
	      
	      int n=hSet.size();
	      
	      List<String> aList = new ArrayList<String>(n);
	      for (String x : hSet)
	            aList.add(x);
	      
	      
		for(int i=0;i<aList.size();i++)
		{
			System.out.print(aList.get(i)+" ");
			/*
			for(int j=0;j<l1.size();j++)
			{
				
				if(aList.get(i).equals(l1.get(j)))
				{
					System.out.println(j);
				}
			}
			System.out.println("");*/
			System.out.print(l1.indexOf(aList.get(i))+ " ");
			/*System.out.print(l1.firstIndexOf(aList.get(i)));*/
			System.out.println(l1.lastIndexOf(aList.get(i)));
			
		}
		

	} 
}
