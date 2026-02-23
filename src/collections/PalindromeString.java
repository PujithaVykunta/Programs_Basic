package collections;

public class PalindromeString {
public static void main(String[] args) {
	
	String s="mom";
	if(ispalindrome(s)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a plaindrome");
	}
	
}
public static boolean ispalindrome(String s) {
	int left=0;
	int right=s.length()-1;
	while(left<right) {
		if(s.charAt(right)!=s.charAt(left)) {
			return false;
		}
		left++;
		right--;
	}
	return true;
	
}

}
