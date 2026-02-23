package stringss;

public class LastWord {
public static void main(String[] args) {
	String s="hello hi pujitha";
	String arr[]=s.split(" ");//{"hello","hi","pujitha"}
	for(int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]);
	}

	System.out.println(arr[0]);
	System.out.println(arr[arr.length-1]);
	
	
}
}
