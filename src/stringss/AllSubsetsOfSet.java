package stringss;

public class AllSubsetsOfSet {
public static void main(String[] args) {
	//if set has n elements then number of subsets is 2power n
	int a[]= {1,2,3};
	/*length of array is n
	 * no of subsets is 4 that is {},{1},{2},{1,2}*/
	int n=a.length;
	int total=(int)Math.pow(2, n);
	for(int i=0;i<total;i++) {
		System.out.print("{");
		for(int j=0;j<=a.length-1;j++) {
			
			if(i/(int)Math.pow(2, j)%2==1) {
				System.out.print(a[j]+" ");
			}
		}
		System.out.println("}");
	}
}
}
