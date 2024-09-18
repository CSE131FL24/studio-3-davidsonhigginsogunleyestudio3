package studio3;

import java.util.Scanner;

public class Studio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program finds all prime numbers in the interval from 1 to n. What would you like to set n as?");
		int n = in.nextInt();
		int interval[] = new int[n];
		for (int i=0; i<interval.length - 1; i++) {
			interval[i]= i+2;
			
			}

		

		boolean primeStatus[] = new boolean[n];
		for (int i = 2; i < primeStatus.length; i=i + 2) {
			compStatus[i]=true;
			System.out.println(primeStatus[i]);
		}



	}

}
