
import java.util.*;

public class CollectionProblemOne { 

	public static void main(String[] args) 
	{ 

		String[] names = {"ab", "cde", "fghi", "klmno", "pqr", "stuvw", "xyz"}; 
		List<String> l1=Arrays.asList(names);
		List<String> l2=new ArrayList<String>();
			System.out.println(l1);
			/*for(int i=0;i<l1.size();i++)
			{
				if((l1.get(i).length())%2!=0)
				{
					l2.add(l1.get(i));
				}
				
			}*/
			
			for(String s:l1)
			{
				
					
				if((s.length()%2)==0)
				{
					l1.remove(s);
	
				}
				System.out.println(s);
				
			}
			
			System.out.println(l);
		
	} 

}  
