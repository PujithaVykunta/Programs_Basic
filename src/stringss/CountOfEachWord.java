package stringss;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachWord {
public static void main(String[] args) {
	String s="I am learning java java";
	String str[]=s.split(" ");

	HashMap<String,Integer>map=new HashMap<String,Integer>();
	
	for (String s1 : str) {
		map.put(s1, map.getOrDefault(s1, 0)+1);
	}
	for(Map.Entry<String,Integer>entries:map.entrySet()) {
		
			System.out.println(entries.getKey()+" :"+entries.getValue());
		
	}
	char a[]=s.toCharArray();
   HashMap<Character,Integer>map1=new HashMap<Character,Integer>();
	
	for (char s1 : a) {
		map1.put(s1, map1.getOrDefault(s1, 0)+1);
	}
	for(Map.Entry<Character,Integer>entries:map1.entrySet()) {
		
			System.out.println(entries.getKey()+" :"+entries.getValue());
		
		
	}
}
}
