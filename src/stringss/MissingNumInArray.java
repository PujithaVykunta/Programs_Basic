package stringss;

public class MissingNumInArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4};
	int totalnum=5;
	int expectedsum=totalnum*(totalnum+1)/2;
	
	int actualsum=0;
	for(int i=0;i<a.length;i++) {
		actualsum+=a[i];
	}
	
	int missingnum=expectedsum-actualsum;
	System.out.println(missingnum);
}
}
