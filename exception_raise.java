
class MyOwnException extends Exception {
   public MyOwnException(String msg){
      super(msg);
   }
}

class exception_raise{
   static void  Age(int age) throws MyOwnException{
      if(age < 20)
         throw new MyOwnException("you are not eligible for marriage as you are too young");
      else if(age >40)
    	  throw new MyOwnException("you are not eligible for marriage as you are too old");
      else
         System.out.println("Input is valid!!");
   }
   public static void main(String[] args) {
       try 
       {
            Age(50);
       }
       catch (MyOwnException e) 
       {
         e.printStackTrace();
       }
       finally
       {
    	   System.out.println("Code cleanup Completed");
       }
   }
}