package Practice;

public class RevString 
{
	public static void main(String[] args) 
	{
		//Reversing a string value without using for loop
		String x="123456";
		String revstr="";// storing in reverse order
		
		char ch;// extracting the characters
		
		System.out.println(x);
		System.out.println("--------");
		StringBuilder sbuild=new StringBuilder(x);
		sbuild.reverse();
		System.out.println(sbuild);
		System.out.println("--------");
		
		//Reversing using for loop
		for(int i=0; i<x.length();i++)
		{
			ch=x.charAt(i);
			revstr=ch+revstr;
		}
		System.out.println(revstr);
	}

}