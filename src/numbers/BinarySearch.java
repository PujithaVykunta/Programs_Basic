package numbers;

import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	int a[]= {1,2,4,6,9,3,8,4};
	
	Arrays.sort(a);
	int search=10;
	int right=a.length-1;
	int left=0;
	boolean found=false;
	while(left<=right) {
		int mid=(left+right)/2;
		if(a[mid]==search) {
			System.out.println("element found at index"+mid);
			found=true;
			break;
		}
		else if(a[mid]>search) {
			right=mid-1;
		}
		else
			left=mid+1;
	}
	if(!found) {
		System.out.println("element not found ");
	}
}
}
