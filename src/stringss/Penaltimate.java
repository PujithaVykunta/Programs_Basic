package stringss;

public class Penaltimate {
public static void main(String[] args) {
	String s="hi hello how are you namaste";
	char c[]=s.toCharArray();
	int count=0;
	int i;
	for( i=s.length()-1;i>=0;i--) {
		if(c[i]==' ') {
			count++;
		}
		if(count==2) {
			break;
		}
	}
	i++;
	while(c[i]!=' ') {
		System.out.print(c[i]);
		i++;
	}
	/*
	String arr[]=s.split(" ");
	System.out.println(arr[arr.length-2]);
	*/
	
}
}
