package numbers;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter starting num");
	int start=sc.nextInt();
	System.out.println("enter ending num");
	int end=sc.nextInt();
	
	for(int i=start;i<=end;i++) {
		if(isPerfect(i)) {
			System.out.println("perfect numbers  :"+i);
		}
	}
}
public static boolean isPerfect(int num) {
      int sum=0;
	for(int i=1;i<=num/2;i++) {
		if(num%i==0) {
			sum=sum+i;
		}
	}
	return sum==num;
}
}
