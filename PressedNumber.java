package java_class_Assignment1;

import java.util.Scanner;

public class PressedNumber {
	public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
	
	switch(number) {
	case 0:
		System.out.println("press 0");
		break;
		
	case 1:
		System.out.println("press 1");
		break;
		
	case 2:
		System.out.println("press 2");
		break;
		
	case 3:
		System.out.println("press 3");
		break;
		
	case 4:
		System.out.println("press 4");
		break;
		
	case 5:
		System.out.println("pressed 5");
		break;
		
	default:
		System.out.println("Not Allowed");
		break;
	}
}

}
