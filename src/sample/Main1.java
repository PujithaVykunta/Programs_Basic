package sample;

public class Main1 {
public static void main(String[] args) {
	Table1 t=new Table1();
	User1 u1=new User1(t);
	User2 u2=new User2(t);
	u1.start();u2.start();
}
}
