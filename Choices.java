package java_class_Assignment1;

import java.util.Scanner;

public class Choices {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		char repeat ='Y';
		while(repeat=='y') {
			System.out.println("What is the command keyword to exit a loop in java?");
			System.out.println("a-int");
			System.out.println("b-continue");
			System.out.println("c-break");
			System.out.println("exit");
			System.out.println("Enter your choice");
			char answer = in.next().charAt(0);
			if((answer=='a')||(answer=='b')||(answer=='d')) {
				System.out.println("incorrect!");
				System.out.println("again press y");
				repeat=in.next().charAt(0);
				
			}
			else {
				System.out.println("correct !");
				repeat='n';
			}
		}
	}

}
