package sample;

public class Fibonacci {
public static void main(String[] args) {
	//print 10 fibonacci numbers
	for(int i=0;i<=10;i++) {
		System.out.print(fib(i)+" ");
	}
	System.out.println();
	//up t0 20 print fibonacci number what  are there 
	int p1=0;int p2=1;int max=20;
	
	while(p1<=max) {
		System.out.print(p1+" ");
		int temp=p1+p2;
		p1=p2;
		p2=temp;
	}
}
public static int fib(int a) {
	if(a<=1) {
		return a;
	}
	return fib(a-1)+fib(a-2);
}
}
