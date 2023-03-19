package stringliterals;

public class DemoString {
	
	public static void main(String args[])
	{
	
	
	String str = "Shuchi";//String literals
	String str1 = "Shuchi";
	System.out.println(str==str1);//Here values stored in str and str2 will be compared 
	
	String str2 = new String("Shuchi");//Creating obj of String class
	System.out.println(str==str2);//Here address of str and str1 will be compared
	
	
	

	}
	
}

