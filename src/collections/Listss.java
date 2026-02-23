package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Listss {
public static void main(String[] args) {

	ArrayList<Integer> l=new ArrayList<Integer>();
	int a[]= {1,2,3,4,5,5,5};
	int b[]= {6,7,8,9,10};
	
	for(int i=0;i<=a.length-1;i++) {
		l.add(a[i]);
	}
	
	for(int i=0;i<=b.length-1;i++) {
		l.add(b[i]);
		
	}
	System.out.println(l);
	Iterator<Integer> iterator=l.iterator();
	while(iterator.hasNext()) {
		System.out.print(iterator.next()+" ");
	}
	 System.out.println();
	ListIterator<Integer> itr=l.listIterator();
	
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
	System.out.println();
	String arr[]= {"apple","banana","mango","grapes"};
	ArrayList<String>str=new ArrayList<String>();
	for(int i=0;i<=arr.length-1;i++) {
		str.add(arr[i]);
	}
	ListIterator<String>stritr=str.listIterator();
	while(stritr.hasNext()) {
		System.out.print(stritr.next()+" ");
	}
	System.out.println();
	while(stritr.hasPrevious()) {
		System.out.print(stritr.previous()+" ");
	}
	System.out.println();
	while(itr.hasPrevious()) {
		System.out.print(itr.previous()+" ");
	}
	
	System.out.println(Double.MIN_VALUE>0.0d);
	Set<Integer>set=new HashSet<Integer>();
	set.add(null);
	System.out.println(set.size());
	
	
	
}
}
