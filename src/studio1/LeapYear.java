package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the current year?");
		int cYear = in.nextInt();
		boolean isLeap = (((cYear % 4.0) == 0) && ((cYear % 100.0) !=  0) || (cYear % 400.0) == 0);
		// == checking for equality
		System.out.println("Is " + cYear + "a leap year? " + isLeap);

	}

}
