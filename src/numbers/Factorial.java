package numbers;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	System.out.println("enter num1");
//	int a=sc.nextInt();
//	int fact=1;
//	for(int i=1;i<=a;i++) {
//		fact=fact*i;
//	}
//	System.out.println("factorial of a number "+fact);
//	int i=1;
//	while(a!=0) {
//		fact=fact*i;
//		i++;
//		a--;
//	}
//	System.out.println("factorial of a number "+fact);
//	
	System.out.println(factorial(5));
}
public static long factorial(int a) {
	if(a<=1) {
		return 1;
	}
	return a*factorial(a-1);
}
}
