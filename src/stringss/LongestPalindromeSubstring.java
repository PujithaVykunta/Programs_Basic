package stringss;

public class LongestPalindromeSubstring {
public static void main(String[] args) {
	
	String s="abcabcbca";
	
	String longeststring="";
	for(int i=0;i<=s.length()-1;i++) {
		
		for(int j=i;j<=s.length()-1;j++) {
			//main condition 
			String temp=s.substring(i,j+1);
			
			System.out.println(temp);
			if(temp.length()>longeststring.length()&&isPalindrome(temp)) {
				longeststring=temp;
			}
		}
	}
	System.out.println("longest palindromeSubstring: "+longeststring);
	
}

private static boolean isPalindrome(String temp) {
	int left=0;
	int right=temp.length()-1;
	while(left<right) {
		if(temp.charAt(left)!=temp.charAt(right)) {
			return false;
		}
		left++;
		right--;
	}
	return true;
}

}
