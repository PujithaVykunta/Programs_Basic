package numbers;

public class CountNumOfDigits {
public static void main(String[] args) {
	int num=123456;
	int count=0;
//	for(int i=0;i<=num;i++) {
//		num=num/10;
//		count++;
//	}
	//v
	while(num>0) {
		num=num/10;
		count++;
	}
	
	System.out.println(count);
}
}
