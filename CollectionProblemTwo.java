import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionProblemTwo 
{
	public static void main(String[] args) 
	{ 

		String[] names = {"ab", "cde", "fghi", "klmno", "pqr", "stuvw", "xyz"}; 
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
		/*System.out.println(EVEN);*/
		/*System.out.println(ODD);*/
		Map<String, List<String>> myMaps = new HashMap<String, List<String>>();
		myMaps.put("Even",EVEN);
		myMaps.put("Odd",ODD);
		System.out.println(myMaps);
	
		
	}

}
