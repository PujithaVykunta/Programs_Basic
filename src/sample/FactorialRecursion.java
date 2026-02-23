package sample;

public class FactorialRecursion {
public static void main(String[] args) {
	long fact=factorial(5);
	System.out.println(fact);
}
public static  long factorial(int n) {
	
	if(n<=1) {
	return 1;
	}
	return n*factorial(n-1);
			
	
}
}
