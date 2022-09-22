import java.util.*;
import java.io.*;
public class CollectionProblemTen
{ 

    public static void main(String[] args)
    { 

        String[] keys = {"company", "street", "building" ,"block", "floor"}; 

        String[] values = {"Keste", "Madhapur", "cyberperal" ,"block - A", "4th"}; 
        Map<String,String> map = new HashMap<String,String>();
        Map<String,String> map2 = new HashMap<String,String>();
        Properties p1=new Properties();
        
        try {
        
        	FileWriter output = new FileWriter("d:\\Java Stuff\\newFile.txt");
        	
        	
        	for(int i=0;i<keys.length;i++)
        	{
        		p1.put(keys[i], values[i]);
        		p1.store(new FileOutputStream("d:\\Java Stuff\\task10.txt"),null);
        		
      
            
        	}
        	
        	
            
        	p1.store(new FileOutputStream("d:\\Java Stuff\\task10.txt"),null);
        	
        	 p1.put("pincode","500075");
        	 p1.store(new FileOutputStream("d:\\Java Stuff\\task10.txt"),null);
        	 
        	p1.load(new FileInputStream("d:\\Java Stuff\\newFile.txt"));
        	
        	for(String key : p1.stringPropertyNames())
        	{
        		map2.put(key,p1.getProperty(key).toString());
        	}
        	
        	
        	
     
        
        
       
        map2.put("pincode","500075");
        
        System.out.println(map2);
        
        }
        catch(Exception e) {
            e.getStackTrace();
          }
        
        finally {
        	
        }
        
        
    }
    
}

