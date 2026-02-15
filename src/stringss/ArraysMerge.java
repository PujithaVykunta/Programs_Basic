package stringss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysMerge {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,5,6,5};
	int b[]= {6,7,8,9,10};
	
	List<Integer> l=new ArrayList<Integer>();
	//l.addAll(Arrays.asList(a,b));
	
	for(int i=0;i<=a.length-1;i++) {
		l.add(a[i]);
	}
	for(int i=0;i<=b.length-1;i++) {
		l.add(b[i]);
	}
	
	HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
	
	for(int i=0;i<=a.length-1;i++) {
		map.put(a[i], map.getOrDefault(a[i],0)+1);//1-1,2-1,3-1
	}
	for(int i=0;i<=b.length-1;i++) {
		map.put(b[i], map.getOrDefault(b[i],0)+1);//1-1,2-1,3-1
	}
//	for(Map.Entry<Integer,Integer>entries:map.entrySet()) {
//		if(entries.getValue()==1)
//		{
//			System.out.println(entries.getKey()+" :"+entries.getValue());
//		}
//		
//		//System.out.println(entries.getKey()+" :"+entries.getValue());
//		
//	}
	int i=1;
	
	for(Integer i1:l) {
		System.out.println(i1);
	}
	
	//System.out.println(l.get(i));
	
}
}
