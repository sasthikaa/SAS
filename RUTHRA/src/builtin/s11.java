package builtin;

import java.util.Scanner;

public class s11 {
	
	public static void main(String[] args) {
		
		//Scanner: get input from the user at run time
		// nonstatic in nature
		
		// int-> nextInt()
		// double=> nextDouble()
		//String => nextLine()
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name :");
		String n = s.nextLine();
		
		System.out.println("Enter your age : ");
		int age=s.nextInt();
		
		System.out.println("Enter your salary :");
		double sal = s.nextDouble();
		
		System.out.println("Name is "+ n);
		System.out.println("Age is "+ age);
		System.out.println("Salary is "+ sal);
	}

}
