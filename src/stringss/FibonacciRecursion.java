package stringss;

public class FibonacciRecursion {
public static void main(String[] args) {
	
	System.out.println(fibonacci(8));
}
public static long fibonacci(int n) {
	
	if(n<=1) {
		return n;
	}
	int first=0,second=1;
	for(int i=2;i<=n;i++) {
		int temp=first+second;
		first=second;
		second=temp;
	}
	return second;
}
}
