package numbers;

import java.util.Scanner;

public class DuckNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	String numstr=sc.nextLine();
	
	if(numstr.charAt(0)=='0') {
		System.out.println("not a duck number");
	}
	else {
		if(numstr.contains("0")) {
			System.out.println("duck number");
		}else {
			System.out.println("not a duck number");
		}
	}
	sc.close();
}
}
