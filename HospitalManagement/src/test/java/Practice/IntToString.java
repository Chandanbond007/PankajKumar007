package Practice;

public class IntToString 
{
	public static void main(String[] args) 
	{
		int x=123456;
		System.out.println(x);
		
		//Converting int value to string without usinh toString()...
		
		String x1=""+x;
		System.out.println(x1);
		
		//By using toString()
		String x2=Integer.toString(x);
		System.out.println(x2);
		
		
	}
}
