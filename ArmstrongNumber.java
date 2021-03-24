package java_class_Assignment1;

public class ArmstrongNumber {
	public static void main(String[]args) {
	int n= 371;
	int c=0,a,temp;{
	
	temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong Number");
			
	}
}
}