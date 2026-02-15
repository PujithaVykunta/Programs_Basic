package numbers;

import java.util.Scanner;

public class ArmStrong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter starting num");
	int start=sc.nextInt();
	System.out.println("enter ending num");
	int end=sc.nextInt();
	for(int i=start;i<=end;i++) {
		if(isArmStrong(i)) {
			System.out.println(i+" armstrong number");
		}
	}
	sc.close();
}
public static boolean isArmStrong(int num) {
	int copy=num;
	//finding length
	int length=0;
	while(copy!=0) {
		copy=copy/10;
		length++;
	}
	//finding sum and power of the numbers
	copy=num;
	int sum=0;
	while(copy!=0) {
		int rem=copy%10;
		sum=sum+power(length,rem);
		copy=copy/10;
	}
	if(sum==num) {
		return true;
	}
	else {
		return false;
	}
}
public static int power(int length,int rem) {
	int pow=1;
	for(int i=1;i<=length;i++) {
		pow=pow*rem;
	}
	return pow;
	
}
}
