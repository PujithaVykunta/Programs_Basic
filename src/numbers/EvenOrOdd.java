package numbers;

import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter starting num");
	int start=sc.nextInt();
	System.out.println("enter ending num");
	int end=sc.nextInt();
	
	for(int i=start;i<=end;i++) {
		if(i%2==0) {
			System.out.println("even number :"+i);
		}
		else {
			System.out.println("odd number :"+i);
		}
	}
	
	System.out.println("enter number");
	int num=sc.nextInt();
	//boolean a=num>1||num==0?true:false;
	if(num>1||num==0) {
		System.out.println("positive");
	}
	else {
		System.out.println("negative");
	}
	//largest of two numbers
	int a=10,b=20;
	int c=a>b?a:b;
	System.out.println(c+" largest number");
	//largest of three numbers
	int m=10,n=20,p=25;
	int var=m>n?m:n;
	int var1=var>p?m:p;
	System.out.println("largest number "+var1);
	//sum of first n natural numbers
	System.out.println("enter number");
	int n1=sc.nextInt();
	int sum=0;
	for(int i=0;i<=n1;i++) {
		sum=sum+i;
	}
	System.out.println(sum);
}	
}

