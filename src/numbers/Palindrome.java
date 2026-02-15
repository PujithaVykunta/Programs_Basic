package numbers;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	int rev=0;
	int copy=num;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
		
	}
	if(rev==copy) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}
