package numbers;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt(); //145
	int copy=num;
	long sum=0;
	while(num!=0) {
		int rem=num%10;
	    sum=sum+factorial(rem);
		num=num/10;
	}
	System.out.println(sum);
	if(sum==copy) {
		System.out.println("strong number");
	}
	else {
		System.out.println("not a strong number");
	}
}
public static long factorial(int n) {
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	return fact;
}
}
