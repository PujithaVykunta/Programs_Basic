package numbers;

public class BubbleSort {
public static void main(String[] args) {
	int a[]= {1,4,7,9,10,11,17};
	
	for(int i=0;i<=a.length-1;i++) {
		for(int j=0;j<=a.length-2;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
}
}
