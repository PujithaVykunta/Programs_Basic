package numbers;

public class HarshadNumber {
public static void main(String[] args) {
	int n=18;
	int sum=0;
	int copy=n;
	while(n!=0) {
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	if(copy%sum==0) {
		System.out.println("Harshad Number");
	}
	else {
		System.out.println("not a harshad number");
	}
}
}
