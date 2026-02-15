package numbers;

public class SwappingNum {
public static void main(String[] args) {
	int a=10,b=20;
	System.out.println("before swapping: "+a+" "+b);
	//logic 1
//	int c=a;
//	a=b;b=c;
	
	//logic 2 without using temp variable
//	
//	a=a+b;
//	b=a-b;
//	a=a-b;
	
	//logic 3 using multi and division
//	a=a*b; //10*20=20 a=200
//	b=a/b; //200/20=10 b=10
//	a=a/b;  //200/10 a=20
	
	//logic 4
	b=a+b-(a=b);
	//(a=b a=20),10+20=30,30-20=10=b,a=20
	
	System.out.println("after sswaping: "+a+" "+b);
}
}
