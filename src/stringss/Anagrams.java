package stringss;

import java.util.Arrays;

public class Anagrams {
public static void main(String[] args) {
	String a="cat";
	char a1[]=a.toCharArray();
	String b="tac";
	char b1[]=b.toCharArray();
	
	if(a.length()==b.length()){
		
		for(int i=0;i<=a1.length-1;i++) {
			for(int j=0;j<=a1.length-2;j++) {
				if(a1[j]>a1[j+1]) {
				char c=a1[j];
				a1[j]=a1[j+1];
				a1[j+1]=c;
				}
				
			}
		}
		for(int i=0;i<=b1.length-1;i++) {
			for(int j=0;j<=b1.length-2;j++) {
				if(b1[j]>b1[j+1]) {
				char c=b1[j];
				b1[j]=b1[j+1];
				b1[j+1]=c;
				}
				
			}
		}
		if(Arrays.equals(a1, b1)) {
			System.out.println("anagrams");
		}
		else {
			System.out.println("not anagrams");
		}
		
	}
	else {
		System.out.println("not anagrams");
	}
	
}
}
