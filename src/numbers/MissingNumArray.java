package numbers;

public class MissingNumArray {
public static void main(String[] args) {
	int a[]= {1,2,3,5};
	int num=5;//total count of numbers in an array
	int expectedsum=num*(num+1)/2; //formula for 1st sum of n digits
	int actualsum=0;
	for(int i=0;i<a.length;i++) {
		actualsum=actualsum+a[i];
	}
	int missingnumber=expectedsum-actualsum;
	System.out.println(missingnumber);
}
}
