package stringss;

import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	int a[]= {1,29,4,0,2,5,8,3,6};
	
	int search=5;
	Arrays.sort(a);
	int right=a.length-1;
	int left=0;
	boolean found=false;
	while(left<=right) {
		
		int mid=(right+left)/2;
		
		if(a[mid]==search) {
			System.out.println("element found at indexx:"+mid);
			found=true;
			break;
		}
		else if(a[mid]>search) {
			right=mid-1;
		}
		else {
		left=mid+1;
		}
	}
	if(!found) {
		System.out.println("element not found");
	}
}
}
