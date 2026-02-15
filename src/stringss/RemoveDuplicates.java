package stringss;

public class RemoveDuplicates {
public static void main(String[] args) {
	int a[]= {1,2,2,1,4,3,5,6,7};
	
	for(int i=0;i<=a.length-1;i++) {
		boolean isduplicate=false;
		
		for(int j=i+1;j<=a.length-1;j++) {
			if(a[j]==a[i]) {
				isduplicate=true;
				break;
			}
			
			if(!isduplicate) {
				System.out.println(a[i]);
				break;
			}
		}
	}
}
}
