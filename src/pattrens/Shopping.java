package pattrens;

public class Shopping {
public static void main(String[] args) {
	Transaction t=new Transaction();
	Frnd1 f1=new Frnd1(t);
	Frnd2 f2=new Frnd2(t);
	f1.start();f2.start();
}
}
