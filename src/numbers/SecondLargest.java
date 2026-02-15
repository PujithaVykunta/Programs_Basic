package numbers;

public class SecondLargest {
public static void main(String[] args) {
	int a[]= {15,1,2,3,4,9,10,11};
	int max=Integer.MIN_VALUE;
	int secondMax=Integer.MIN_VALUE;
	
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]>max) {
			secondMax=max;
			max=a[i];
		}
		else if(secondMax<max&&a[i]!=secondMax) {
				secondMax=a[i];
			}
		
	}
	System.out.println("secondmax: "+secondMax);
	int min=Integer.MAX_VALUE;
	int secondMin=Integer.MAX_VALUE;
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]<min) {
			secondMin=min;
			min=a[i];
		}
		else if(a[i]!=min&& a[i]<secondMin) {
			secondMin=a[i];
		}
	}
	System.out.println("secondmin: "+secondMin);
}
}
