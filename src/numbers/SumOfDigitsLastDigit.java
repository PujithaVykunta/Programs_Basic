package numbers;

public class SumOfDigitsLastDigit {
public static void main(String[] args) {
	int num=9571;
	int sum=0;
	while(num!=0) {
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	System.out.println(sum);
	int n=sum;
	int sum1=0;
	while(n!=0) {
		int rem=n%10;
		sum1=sum1+rem;
		n=n/10;
	}
	System.out.println(sum1);
	
	if(sum1<=9&&sum1>=0) {
		System.out.println(sum1);
	}
	else {
		System.out.println("number is not there");
	}
}
}
