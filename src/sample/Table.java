package sample;

import java.util.Scanner;

public class Table extends Thread{

	@Override
	public void run() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		for(int i=0;i<=10;i++) {
			try {
				currentThread();
				Thread.sleep(100);
//				currentThread().join(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			currentThread().setName("table");
			System.out.println(num+"*"+i+"="+num*i +" "+currentThread().getName());
		}
		sc.close();
	}
	public static void main(String[] args) {
		currentThread().setName("main method");
//		try {
//			System.out.println("main thread is going to sleep");
//			currentThread().sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(currentThread().getPriority()+":"+currentThread().getName());
		Table t=new Table();
		t.setPriority(MAX_PRIORITY);
		System.out.println(t.getPriority());
		
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<=5;i++) {
			System.out.println(i+"main thread running");
		}
//		Table t1=new Table();
//		System.out.println(t1.getPriority());
//		t1.start();
		
	}
	
}
