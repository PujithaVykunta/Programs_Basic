package stringss;

import java.util.Arrays;

public class Anagramss {
public static void main(String[] args) {
	String s="cat";
	String p="tac";
	
	char s1[]=s.toCharArray();
	char p1[]=p.toCharArray();
	if(s.length()==p.length()) {
		
		for(int i=0;i<s1.length-1;i++) {
			for(int j=0;j<=s1.length-2;j++) {
				if(s1[j]>s1[j+1]) {
					char temp=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=temp;
				}
			}
		}
		for(int i=0;i<p1.length-1;i++) {
			for(int j=0;j<=p1.length-2;j++) {
				if(p1[j]>p1[j+1]) {
					char temp=p1[j];
					p1[j]=p1[j+1];
					p1[j+1]=temp;
				}
			}
		}
		if(Arrays.equals(p1,s1)) {
			System.out.println("anagrams");
		}
		else {
			System.out.println("not anagrams");
		}
	}
	else {
		System.out.println("not an anagrams");
	}
}
}
