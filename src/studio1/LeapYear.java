package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextint();
		boolean check1 = (year % 4 == 0);
		boolean check2 = (year % 100 != 0);
		boolean check3 = (year % 400 == 0);
		
		string cal = ((check1 = "true") && (check2 = "true") || (check3 = "true"));
		boolean yesNo = (cal = "true");
		System.out.print(yesNo);
		// TODO Auto-generated method stub

	}

}
