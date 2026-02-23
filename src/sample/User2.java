package sample;

public class User2  extends Thread{
   Table1 t;
	User2(Table1 t){
		this.t=t;
	}
	@Override
	public void run() {
		t.PrintTable(4);
		System.out.println(t);
	}
}
