package sample;

public class PalindromeString {
public static void main(String[] args) {
	String s="mom";
	String rev="";
	for(int i=0;i<s.length();i++) {
		rev=rev+s.charAt(i);
	}

	if(rev.equals(rev)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}
