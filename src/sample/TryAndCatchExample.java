package sample;

public class TryAndCatchExample  {
	
public static void main(String[] args) {
	try {
		int a[]= {1,2,3,4,5};
		System.out.println(a[5]);
	
	}
	catch(ArrayIndexOutOfBoundsException e) {	
            System.out.println(e.getMessage());
		try {
			int a1=10,b1=0;
			int c=a1/b1;
			System.out.println(c);
		}catch(ArithmeticException e1) {
			System.out.println(e1.getMessage());
			System.out.println("arithmetic exception handeled here");
		}
	}
	finally {
		System.out.println("the program runs");
	}
//	try {
//		int a1=10,b1=0;
//		int c=a1/b1;
//		System.out.println(c);
//	}
//	catch(ArithmeticException e) {
//		System.out.println("arithmetic exception handeled here");
//	}
//	catch(ArrayIndexOutOfBoundsException  e1) {
//		System.out.println("ArrayIndexOutOfBoundsexception handled here");
//	}catch(Exception e2) {
//		System.out.println("exception handled");
//	}
	
}
}
