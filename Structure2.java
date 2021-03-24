package java_class_Assignment1;

public class Structure2 {
	public static void main(String[]args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
				i=i+1;
				System.out.println();
		}
		for(int i=1;i<=n;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			i=i-1;
			System.out.println();
		}
	}

}
