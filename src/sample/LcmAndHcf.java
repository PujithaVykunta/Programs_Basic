package sample;

public class LcmAndHcf {
public static void main(String[] args) {
	int a=15,b=20;
	int hcf=0;
	for(int i=1;i<=a;i++) {
		if(a%i==0&b%i==0) {
			hcf=i;
		}
	}
	int lcm=(a*b)/hcf;
	System.out.println("lcm:"+lcm+" "+"hcf:"+hcf);
}
}
