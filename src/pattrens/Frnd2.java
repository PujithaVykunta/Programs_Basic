package pattrens;

public class Frnd2 extends Thread{
	Transaction t;
	Frnd2(Transaction t){
		this.t=t;
	}
	
	@Override
	public void run() {
		t.sendMoney(100);
	}
}
