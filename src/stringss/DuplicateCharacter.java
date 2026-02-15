package stringss;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
public static void main(String[] args) {
	String s="heloohowareyou";
	char c[]=s.toCharArray();
	HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	for(char ch:c) {
		map.put(ch,map.getOrDefault(ch, 0)+1);
	}
	int maxvalue=0;
	for(Map.Entry<Character, Integer>entries:map.entrySet()) {
		if(entries.getValue()>1) {
			System.out.println(entries.getKey()+" :"+entries.getValue());
		}
		if(entries.getValue()>maxvalue) {
			maxvalue=entries.getValue();
		}
			
	}
	System.out.println(maxvalue);
}
}
