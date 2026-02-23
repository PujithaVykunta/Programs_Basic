package pattrens;

import java.util.Scanner;

public class SecondWayOFThread implements Runnable {

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("eligible to vote");
		}
		else {
			System.out.println("not eligible to vote");
		}
		sc.close();
	}
	public static void main(String[] args) {
		SecondWayOFThread st=new SecondWayOFThread();
		Thread t1=new Thread(st);
		Thread t2=new Thread(st);
		t1.start();t2.start();
		String s=new String("Dinga");
		String s1=new String("Dinga");
		//s1="Dingi";
		System.out.println(s+" "+s1);
		if(s.equals(s1)) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
	}

}
