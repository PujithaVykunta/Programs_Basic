package stringss;

public class SelectionSort {
public static void main(String[] args) {
	int a[]= {5,8,3,7,2,7,21,9,2};
	
	//finding the smallest number 
	for(int i=0;i<=a.length-1;i++) {
		int minindex=i;
		for(int j=i+1;j<=a.length-1;j++) {
			if(a[j]<a[minindex]) {
				minindex=j;
			}
		}
		//swapping the smallest number that should comes first
		int temp=a[minindex];
		a[minindex]=a[i];
		a[i]=temp;
	}
	
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
}
}
