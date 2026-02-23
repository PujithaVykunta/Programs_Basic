package sample;

public class ArmStrong {
public static void main(String[] args) {
	int num=153;
	int copy=num;
	int length=0;
	while(num!=0) {
		length++;
		num=num/10;
	}
	//System.out.println(length);
	int sum=0;
	num=copy;
	while(copy!=0) {
		int rem=copy%10;
		sum=sum+power(length,rem);
		copy=copy/10;
	}
	System.out.println(num+" "+sum);
	if(sum==num) {
		System.out.println("armstrong number");
	}
	else {
		System.out.println("not an armstrong number");
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
