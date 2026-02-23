package numbers;

public class PrimeFatcors {
public static void main(String[] args) {
	int num=84;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			if(primeCheck(i)) {
				System.out.println(i);
			}
		}
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
