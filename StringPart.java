package stringliterals;

public class StringPart {

	public static void main(String[] args) {
	
		String str = "participate";
		System.out.println(str.substring(4, 11));
		
		String str1 = "your transaction id is: 12345 and reference id is 34567";
		
		
		String num1 = str1.substring(24, 29);
		String num2 = str1.substring(50, 55);
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
