package Practice;

public class StrBuffStrBuild 
{
	public static void main(String[] args) 
	{
		// Storing a three different string values using one reference variable 
		
		StringBuffer sb=new StringBuffer();
		sb.append("Qspiders?");
		sb.append("Jspiders?");
		sb.append("Pyspiders");
		System.out.println(sb);
		System.out.println("---------");
		// Storing it in three different references from the given string first we have to
		//convert it into string value
		 
		String s=new String(sb);	// Converting it to string
		
		String s1=s.split("\\?")[0];
		System.out.println(s1);
		System.out.println("---------");
		String s2=s.split("\\?")[1];
		System.out.println(s2);
		System.out.println("---------");
		String s3=s.split("\\?")[2];
		System.out.println(s3);
	}
}