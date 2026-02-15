package numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num1");
	int a=sc.nextInt();
	System.out.println("enter num2");
	int b=sc.nextInt();
	List<Integer> list=new ArrayList<Integer>(); 
	int sumPrime=0;
	for(int i=a;i<=b;i++) {
		if(primeCheck(i)) {
			System.out.println(i+" :prime");
			list.add(i);
			sumPrime=sumPrime+i;
			
		}
//		else {
//			System.out.println(i+"not a prime");
//		}
	}
	System.out.println("sumprime :"+sumPrime);
	System.out.println(list);
	
}
public static boolean primeCheck(int n) {
	if(n<=1) {
		return false;
	}
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
}
