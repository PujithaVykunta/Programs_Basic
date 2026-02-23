package sample;

public class Employee {
	public static double bonus(double salary) {
		
		double sal=salary+salary*0.01;
		return sal;
	}
	public static void display(int empid,String name,double salary) {
	
		System.out.println("user id"+empid);
		System.out.println("user name"+name);
		System.out.println("user salary"+salary);
		System.out.println("user bonus"+bonus(salary));
		
	}
public static void main(String[] args) {
	display(1,"puji",2000);
	
}
}
