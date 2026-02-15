package stringss;

import java.util.ArrayList;
import java.util.List;

public class AllSubSetsOfSetRecursive {
public static void main(String[] args) {
	int a[]= {1,2,3};
	List<Integer>current=new ArrayList<Integer>();
	int index=0;
	generateSubsets(a,index,current);
}

 static void generateSubsets(int[] a, int index, List<Integer> current) {
	if(index==a.length) {
		System.out.println(current);
		return;
	}
	//excluding current element
	generateSubsets(a, index+1, current);
//	//including current element
	current.add(a[index]);
	generateSubsets(a, index+1, current);
//	
//	//removing last added element
current.remove(current.size()-1);
	
	
}

}
