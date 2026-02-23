package sample;

public class Duplicates {
public static void main(String[] args) {
	int a[]= {1,2,3,3,2,4,5,6};
	
	for(int i=0;i<=a.length-1;i++) {
		boolean isduplicate=false;
		for(int j=i+1;j<=a.length-1;j++) {
			if(a[i]==a[j]) {
				isduplicate=true;
			}
			
		}
		if(isduplicate) {
			System.out.print(a[i]+" ");
		}
	}
}
}
