package sample;

public class Table1 {
	
	synchronized void PrintTable(int a) {
	for(int i=0;i<=10;i++) {
		System.out.println(a+"*"+i+"="+a*i);
	}
	}
}
