package sample;

public class User1 extends Thread {
   Table1 t;
	User1(Table1 ref){
		t=ref;
	}
	@Override
	public void run() {
		t.PrintTable(5);
		System.out.println(t);
	}
}
