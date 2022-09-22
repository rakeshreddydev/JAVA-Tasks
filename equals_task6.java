class Person 
{ 
    String name; 
    public String getName()
    { 
        return name; 
        
    } 
    public void setName(String name) 
    { 
        this.name = name; 
    } 
    public Person(String name) 
    { 
        super();
        this.name = name; 
    } 
    public boolean equals(Object obj)
    {
    	String name1=this.name;
    	Person s=(Person)obj;
    	String name2=s.name;
    	if(this.name==s.name)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    	
    	
 
    }

} 

 

public class equals_task6
{ 

    public static void main(String args[])
    { 

        Person p1 = new Person("argano"); 

        Person p2 = new Person("argano"); 

        System.out.println(p1.equals(p2)); 

    } 

}