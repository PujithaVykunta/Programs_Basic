package pattrens;

public class P5 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=5;j++) {
			if(i+j==5+1) {
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		for(int j=1;j<=5;j++) {
			if(i==j+1) {
			System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	int n=4;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i+1==j) {
				System.out.print("*");
			}
			else  System.out.print(" ");
		}
		for(int j=1;j<=n;j++) {
			if(i+j==n+1) {
				System.out.print("*");
			}
			else System.out.print(" ");
			
		}
		System.out.println();
	}
}
}
