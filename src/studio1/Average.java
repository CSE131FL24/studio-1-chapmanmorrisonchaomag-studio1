package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("The first of two integers to be averaged?");
		double n1 = in.nextDouble();
		System.out.print("The second of two integers to be averaged?");
		double n2 = in.nextDouble();
		double average = ((n1+n2)/2);
		System.out.print("Average of " + n1 + " and " + n2 + " is " + average +".");
		// TODO Auto-generated method stub

	}

}
