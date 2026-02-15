package numbers;

import java.util.Scanner;

public class LcmAndHcf {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num1");
	int a=sc.nextInt();
	System.out.println("enter num2");
	int b=sc.nextInt();
	int hcf=1;
	for(int i=1;i<=b;i++) {
	  if(a%i==0&&b%i==0) {
		   hcf=i;
	  }
	}
	System.out.println("hcf of two numbers :"+hcf);
	int lcm=(a*b)/hcf;
	System.out.println("lcm of two numbers :"+lcm);
}
}
