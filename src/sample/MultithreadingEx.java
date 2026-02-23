package sample;

public class MultithreadingEx extends Thread{
	@Override
	public void run() {
		
		int a=3;
			for(int i=0;i<=10;i++) {
				System.out.println(a+"*"+i+"="+a*i);
			}
			System.out.println(method());
			
	}
	
	public static boolean method() {
		return true;
	}
	
}
