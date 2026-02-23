package numbers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[] = {1,1,2,2,2,3,4,3,5,6,7,8};

//        for(int i=0;i<=a.length-1;i++) {
//        	for(int j=i+1;j<=a.length-2;j++) {
//        		if(a[i]>a[j]) {
//        			int temp=a[i];
//        			a[i]=a[j];
//        			a[j]=temp;
//        		}
//        	}
//        	System.out.print(a[i]+" ");
//        	
//        }
        
        Arrays.sort(a);
        
        for(int i=0;i<a.length;i++) {
        	for(int j=i+1;j<=a.length-1;j++) {
        		if(a[i]==a[j]) {
        			a[j]=-1;
        			System.out.println(a[i]);
        			break;
        		}
        		
        		
        	}
        }
    }
}
