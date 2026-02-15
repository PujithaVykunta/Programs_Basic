package numbers;

import java.util.Scanner;

public class PrimeNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num1");
	int a=sc.nextInt();
	System.out.println("enter num2");
	int b=sc.nextInt();
	
	int count=0;
	boolean flag=false;
	if(a>1&&b>1) {
		
		for(int i=a;i<=b;i++) {
			if(b%i==0) {
				count++;
				flag=false;
			}
		}
		if(count==2) {
			System.out.println(" prime");
		}
		//this will applicable only the number is same and the factor is one
//		if(count==1) {
//			System.out.println(" prime");
//		}
		else {
			System.out.println("not a prime");
		}
	}
	else {
		System.out.println("not a prime");
	}
	
}
}
