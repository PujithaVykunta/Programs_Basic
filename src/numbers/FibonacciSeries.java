package numbers;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num2");
	int b=sc.nextInt();
	int p1=0,p2=1;
	//up to which numbers count u can print
   for(int i=0;i<=b;i++) {
	   System.out.println("fibonnaci series :"+p1);
	 int temp=p1+p2;
	      p1=p2;
	      p2=temp;
     } 
    //u will give the max value and it will print 
   //how many fibonaci are present in there
   System.out.println("enter the max value");
   int max=sc.nextInt();
   int first=0,second=1;
   System.out.println("fibonacci series up to max value"+max+" ");
   while(first<=max) {
	   System.out.println(first+" ");
	   int temp=first+second;
	   first=second;
	   second=temp;
   }
   
}
}
