package Com.testing;

public class DefaultConstructor {
	
	public DefaultConstructor()
	{
		System.out.println("Default Constructor");
		
	}
	
	public DefaultConstructor(int a)
	{
		System.out.println(a);
		
	}
	
	public DefaultConstructor(String a)
	{
		System.out.println(a);
		
	}
	
	

	public static void main(String[] args) 
	{
		DefaultConstructor Con=new DefaultConstructor();
		DefaultConstructor Con1=new DefaultConstructor(20);
		DefaultConstructor Con2=new DefaultConstructor("Ram");
		
		

	}

}
