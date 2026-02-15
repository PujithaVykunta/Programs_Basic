package numbers;

import java.util.HashSet;

public class DuplicateNumber {
public static void main(String[] args) {
	int a[]= {1,1,2,2,2,3,4,3,5,6,7,8};
	
	for(int i=0;i<a.length;i++) {
		if(a[i]==-1) {
			continue;
		}
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				a[j]=-1;
			}
			
		}
		
    }
	for(int i:a) {
		if(i!=-1) {
			System.out.println(i+" ");
		}
	}
	
//	HashSet<Integer>set=new HashSet<Integer>();
//	for(int i=0;i<=a.length-1;i++) {
//		set.add(a[i]);
//	}
//	System.out.println(set);
	
}
}
