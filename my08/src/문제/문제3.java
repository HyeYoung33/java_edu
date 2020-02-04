package 문제;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("입력["+ i + "] >> " );
			num[i] = sc.nextInt();
		}
		
		System.out.println();

		for (int i= 0;  i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
