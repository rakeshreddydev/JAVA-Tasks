
public class GenericFunction {
	public <T extends Number> Number Sum(final T x,final T y)
	{
		if(x instanceof Double)
		{
			return x.doubleValue()+y.doubleValue();
		}
		else if(x instanceof Short)
		{
			return x.shortValue()+y.shortValue();
		}
		return x.intValue()+y.intValue();
		 
	}

	public static void main(String[] args) {
		
		GenericFunction f=new GenericFunction();
		System.out.println(f.<Integer>Sum(100,100));
		System.out.println(f.<Double>Sum(100.12,100.33));
		System.out.println(f.<Double>Sum(10.12,0.33));
		
		

	}

}
