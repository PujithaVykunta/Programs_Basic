package numbers;

public class AutomorphicNumber {
public static void main(String[] args) {
	int n=25;
	int square=n*n;
	while(n!=0) {
		if(n%10==square%10) {
			System.out.println("Automorphic number");
		}
		n=n/10;
	}
	System.out.println(square);
}
}
