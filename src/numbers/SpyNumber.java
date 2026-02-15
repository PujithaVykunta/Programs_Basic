package numbers;

public class SpyNumber {
public static void main(String[] args) {
	
	int n=1124;
	int sum=0,product=1;
	while(n!=0) {
		int rem=n%10;
		sum=sum+rem;
		product=product*rem;
		n=n/10;
	}
	if(sum==product) {
		System.out.println("SpyNumber");
	}else {
		System.out.println("not a spy number");
	}
}
}
