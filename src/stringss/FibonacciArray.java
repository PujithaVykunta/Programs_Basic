package stringss;

public class FibonacciArray {
public static void main(String[] args) {
	
	int n=10;
	int  a[]=new int [n];
	a[0]=0;
	a[1]=1;
	for(int i=2;i<=n-1;i++) {
		a[i]=a[i-1]+a[i-2];
	}
	
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]+" ");
	}
}
}
