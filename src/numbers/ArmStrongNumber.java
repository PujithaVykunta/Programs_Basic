package numbers;

import java.util.Scanner;

public class ArmStrongNumber {
public static void main(String[] args) {
	// 153=1*3+5*3+3*3
	/* logic
	 *  find length
	 *  find powers of the digits
	 *  check the sum of digits and original number*/
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	//here we are storing in the copy variable
	int copy=num;
	int length=0;
	while(num!=0) {
		num=num/10;
		length++;
	}
	//System.out.println(length);
	//here num=0 so we are storing the copy variable in number
	num=copy;
	int sum=0;
	while(copy!=0) {
		int rem=copy%10;
		sum=sum+power(length,rem);
		//System.out.println(sum);
		copy=copy/10;
	}
	System.out.println("sum: "+sum);
	
	if(sum==num) {
		System.out.println("armstrong number");
	}
	else {
		System.out.println("not an armstrong number");
	}
	sc.close();
}
public static int power(int length,int rem) {
	int pow=1;
	for(int i=1;i<=length;i++) {
		pow=pow*rem;
	}
	return pow;
}
}
