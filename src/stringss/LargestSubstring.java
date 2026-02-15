package stringss;

public class LargestSubstring {
	
public static void main(String[] args) {
	String s="abcabcdabcde";
	String max=maxsubstring(s);
	System.out.println(max+":"+max.length());
}
public static String maxsubstring(String s) {
	
	int maxlen=0;
		String largest="";
	for(int i=0;i<=s.length()-1;i++) {
		String temp="";
		for(int j=i;j<=s.length()-1;j++) {
			if(temp.contains(s.charAt(j)+"")) {
				break;
			}
			temp=temp+s.charAt(j);
			if(temp.length()>maxlen) {
				maxlen=temp.length();
				largest=temp;
			}
		}
	}
       return largest;	
}
}
