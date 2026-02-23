package sample;

import java.util.Scanner;

public class Voting {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter age");
	int age=sc.nextInt();
	
	if(age>18) {
		System.out.println("eligible to vote");
	}
	else {
		try {
		InvalidAgeException e=new InvalidAgeException();
		throw e;
		}
		catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	System.out.println("enter age of the kid");
	int kidage=sc.nextInt();
	if(kidage<8&&kidage>5) {
		System.out.println("eligibile to join primary school");
	}
	else {
		InvalidRuntimeException e=new InvalidRuntimeException();
		throw e;
	}
	sc.close();
	}
}
