package stringss;

import java.util.HashMap;
import java.util.Map;

public class CountWord {
public static void main(String[] args) {
	String s="hello hi hello bye bye";
	 String word[]=s.split(" ");
	 
	 HashMap<String,Integer>map=new HashMap<String, Integer>();
	 
	 for(String str:word) {
		 map.put(str,map.getOrDefault(str, 0)+1);
	 }
	 
	 for(Map.Entry<String,Integer>entries:map.entrySet()) {
		 
			 System.out.println(entries.getKey()+":"+entries.getValue());
			 
		 
	 }
}
}
