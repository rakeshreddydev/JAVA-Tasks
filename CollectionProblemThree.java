import java.util.*;
public class CollectionProblemThree 
{
	public static void main(String[] args) 
	{ 

		String[] names = {"a", "e", "d", "a" ,"b" ,"c"}; 
		List<String> l1=new ArrayList<String>();
		/*List<String> l1=Arrays.asList(names);
		Set<String> hSet = new HashSet<String>();*/
		/*HashMap<String,Integer> hashmap = new HashMap<String,Integer>(); 
		int arr[]=new int[26];
		List<String> l1=new ArrayList<String>();*/
		int flag=0;
		for(int i=0;i<names.length;i++)
		{
			flag=0;
		
			for(int j=0;j<l1.size();j++)
			{
				if(l1.get(j)==names[i])
				{
					
					flag=1;
				}
				else
				{
					
				}
			}
			if(flag==0)
			{
			l1.add(names[i]);
			}
			
		}
		System.out.println(l1);
		
       
	}
}
