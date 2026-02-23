package stringss;

public class ReverseEachWord {
public static void main(String[] args) {
	String s="welcome to java";
	
	String[] words=s.split(" ");//splitted string array
	
	String reversedString="";
	for(String w:words) {
		String reverseWord="";//reversing each word
		for(int i=w.length()-1;i>=0;i--) {
			reverseWord=reverseWord+w.charAt(i);
		}
		//adding reversed words 
		reversedString=reversedString+reverseWord+" ";
	}
	System.out.println(reversedString);
	
//	for (int j = 0; j < words.length; j++) {
//	    String w = words[j];
//	    System.out.println(w);
//	    String reverseWord = "";  // reversing each word
//	    
//	    for (int i = w.length() - 1; i >= 0; i--) {
//	        reverseWord = reverseWord + w.charAt(i);
//	    }
//	    
//	}
	
}
}
