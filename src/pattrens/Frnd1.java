package pattrens;

public class Frnd1  extends Thread{
	Transaction t;
	Frnd1(Transaction t){
		this.t=t;
	}
@Override
public void run() {
	try {
		t.payment(12000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
