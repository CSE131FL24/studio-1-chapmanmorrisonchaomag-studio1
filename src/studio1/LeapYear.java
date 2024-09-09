package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a year to determine if its a leap year:");
		int year = in.nextInt();
		
		boolean check1 = (year % 4 == 0);
		boolean check2 = (year % 100 != 0);
		boolean check3 = (year % 400 == 0);
        
		boolean isLeapYear = (check1 && (check2 || check3));

		System.out.print(isLeapYear);
	}

}
