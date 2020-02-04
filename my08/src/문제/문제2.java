package 문제;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		String[] name = new String[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < name.length; i++) {
			System.out.print("입력["+ i + "] >> " );
			name[i] = sc.next();
		}
		
		System.out.println();
		System.out.println("**" + name[0] + "보다는 " + name[1] + "**");

	}

}
