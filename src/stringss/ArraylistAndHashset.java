package stringss;

import java.util.ArrayList;
import java.util.HashSet;

public class ArraylistAndHashset {
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("banana");
	list.add("apple");
	list.add("orange");
	list.add("lemon");
	System.out.println(list);
	
	HashSet<String>set=new HashSet<String>();
	set.add("banana");
    set.add("apple");
	set.add("orange");
	set.add("banana");
	System.out.println(set);
}
}
