package numbers;

import java.util.Scanner;

public class ReveseNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num");
	int num=sc.nextInt();
	
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;//1234%10=4
		num=num/10; //1234/10=123
	}
	System.out.println("reverse of number "+rev);
}
}
