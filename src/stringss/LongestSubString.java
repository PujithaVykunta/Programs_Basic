package stringss;

public class LongestSubString {
public static void main(String[] args) {
	String s="abcabcd";
	String substring=longestSubstring(s);
	
	System.out.println(substring+":"+substring.length());
}
//longest substring without repeating its characters
static String longestSubstring(String s) {
	int maxLen=0;
	String longest="";

	for(int i=0;i<=s.length();i++) {
		String temp="";
		for(int j=i;j<s.length();j++) {
			if(temp.contains(s.charAt(j)+"")) {
				break;
			}
			temp=temp+s.charAt(j);
			if(temp.length()>maxLen) {
				maxLen=temp.length();
				longest=temp;
			}
		}
	}
	return longest;
}
}
