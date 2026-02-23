package sample;

public class RemoveDuplicates {
public static void main(String[] args) {
	int a[]= {1,1,2,8,3,5,4,2,2};
	
//	a[0]=0;
//	System.out.print(a[0]);
//	for(int i=1;i<a.length;i++) {
//		if(a[i]!=a[i-1]) {
//			System.out.print(a[i]+" ");
//			
//		}
//	}
//	
	for(int i=0;i<a.length;i++) {
		boolean isduplicate=false;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				isduplicate=true;
				break;
			}
		}
		if(!isduplicate) {
			System.out.print(a[i]+" ");
		}
	}
}
}
