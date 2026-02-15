package stringss;

public class FrequencyOfEach {
public static void main(String[] args) {
	String s="heloo pujitha hi";
	int asc[]=new int[256];
	char c[]=s.toCharArray();
	//System.out.println(c);
	for(char ch:c) {
		asc[ch]++;
	}
	for(char ch:c) {
		if(asc[ch]>0) {
			System.out.println(ch +":"+asc[ch]);
			asc[ch]=0;
		}
	}
}
}
