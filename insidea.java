abstract class A 
{ 
    
    public void m1()
    { 
        System.out.println("inside a"); 
    } 
} 

class B extends A
{ 
    B() 
    { 
        super.m1(); 
    } 

    public void m1() 
    { 
        System.out.println("inside b"); 
    } 
} 

public class insidea
{ 
    public static void main(String[] args) 
    { 
        B instance = new B(); 
        instance.m1(); 
    } 

}  

