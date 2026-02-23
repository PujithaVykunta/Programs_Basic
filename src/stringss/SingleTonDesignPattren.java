package stringss;

public class SingleTonDesignPattren {
public static void main(String[] args) {
	Demo1 d1=Demo1.m();
	System.out.println(d1);
	Demo1 d2=Demo1.m();
	System.out.println(d2);
}
}
