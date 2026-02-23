package sample;

public class BubbleSort {
public static void main(String[] args) {
	int a[]= {84,33,56,67,3,4,3};
	
	for(int i=0;i<=a.length-1;i++) {
		for(int j=0;j<=a.length-2;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		
	}
}
}
