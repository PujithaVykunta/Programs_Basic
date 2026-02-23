package sample;

public class Prime {
public static void main(String[] args) {
	int n=11;
	for(int i=0;i<=n;i++) {
		if(primeCheck(i)) {
			System.out.println("prime number: "+i);
		}
//		else {
//			System.out.println("not a  prime: "+i);
//		}
	}
	
}
public static boolean primeCheck(int a) {
	if(a<=1) {
		return false;
	}
	if(a==2) {
		return true;
	}
	for(int i=2;i*i<=a;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
}
}
