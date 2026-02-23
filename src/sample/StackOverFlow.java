package sample;

public class StackOverFlow {
	public static void method1() {
		System.out.println("hello");
		method2();
	}
	public static void method2() {
		System.out.println("byee");
	//	method1();
	}
public static void main(String[] args) {
	method1();
}
}
