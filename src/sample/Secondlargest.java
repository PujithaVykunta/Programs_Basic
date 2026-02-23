package sample;

public class Secondlargest {
public static void main(String[] args) {
	int a[]= {1,29,10,8,39,78,99};
	int max=Integer.MIN_VALUE;
	int secondmax=Integer.MIN_VALUE;
	
	for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secondmax=max;
				max=a[i];
			}
			else  if(secondmax<max&&a[i]!=secondmax) {
				secondmax=a[i];
			}
		
	}
	System.out.println(secondmax+":"+max);
}
}
