package stringss;

public class PalindromeString {
public static void main(String[] args) {
	String s="wow";
	char a[]=s.toCharArray();
	String rev="";
	for(int j=a.length-1;j>=0;j--) {
		rev=rev+a[j];
	}
	System.out.println(rev);
	if(s.equals(rev)) {
		System.out.println("palindrome string");
	}
	else {
		System.out.println("not a palindrome");
	}
	
	System.out.println(isPalindrome(s));
}
public static boolean isPalindrome(String s) {
	
	int left=0;
	int right=s.length()-1;
	while(s.charAt(right)!=s.charAt(left)) {
		return false;
	}
	right--;
	left++;
	return true;
}
}
