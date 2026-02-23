package stringss;

import java.util.HashMap;

public class FrequencyOfEach {
public static void main(String[] args) {
	String s="heloo pujitha hi";
	int asc[]=new int[256];
	char c[]=s.toCharArray();
	//System.out.println(c);
	for(char ch:c) {
		asc[ch]++;
	}
	for(char ch:c) {
		if(asc[ch]>0) {
			System.out.print(ch +" : "+asc[ch]);
			asc[ch]=0;
		}
	}
	System.out.println();
	HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	for(int i=0;i<=s.length()-1;i++) {
		map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
	}

	System.out.println(map);
}
}

