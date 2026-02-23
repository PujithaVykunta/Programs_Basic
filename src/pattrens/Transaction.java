package pattrens;

public class Transaction {
	double bal=2000;
	
 synchronized void payment(double amount) throws InterruptedException {
	if(bal>=amount) {
		bal=bal-amount;
		System.out.println("payment successsful");
	}
	else {
		System.out.println("insuffiecient balance");
		System.out.println("entering into the waiting state");
		
		wait(2000);
		System.out.println("received the amount");
		if(bal>amount) {
			bal=bal-amount;
			System.out.println("payment  successsful");
		}else {
			System.out.println("insufficient balance");
		}
	}
}
  synchronized void sendMoney(double amount) {
	 if(bal<=amount) {
		 bal=bal+amount;
		 System.out.println("sended money");
		 notify();
	 }
 }
}
