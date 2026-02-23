package sample;

public class FindMissingNum {
public static void main(String[] args) {
	int a[]= {1,2,3,4};
	int countofnum=5;
	int actualsum=0;
	int expectedsum=countofnum*(countofnum+1)/2;
	for(int i=0;i<a.length;i++) {
		actualsum=actualsum+a[i];
	}
	int missingnum=expectedsum-actualsum;
	System.out.println(missingnum);
}
}
