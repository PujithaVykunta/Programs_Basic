package stringss;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
public static void main(String[] args) {
	String s="abcdabcc";
	int asc[]=new int[256];
	for(char c:s.toCharArray()) {
		asc[c]++;
	}
	for(char c:s.toCharArray()) {
		if(asc[c]==1) {
			System.out.println(c);
			break;
		}
	}
	HashMap<Character, Integer>map=new HashMap<Character, Integer>();
	for(char ch:s.toCharArray()) {
		map.put(ch,map.getOrDefault(ch, 0)+1);
	}
	
	for(Map.Entry<Character, Integer>maps:map.entrySet()) {
		if(maps.getValue()==1) {
			System.out.println(maps.getKey());
			break;
		}
	}
	
}
}
