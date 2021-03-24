package java_class_Assignment1;

public class ReverseString {
	public static void main(String[]args) {
		String originalString="ABCD";
		String temp="";
		
		int length = originalString.length();
		for(int i=length-1;i>=0;i--) {
			temp=temp+ originalString.charAt(i);
		}
		System.out.println("Before reverse:"+originalString);
		System.out.println("After reverse:"+temp);
	}

}
