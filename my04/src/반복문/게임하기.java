package 반복문;

import java.util.Scanner;

public class 게임하기 {

	public static void main(String[] args) {
		// 반복문(~동안)
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (true) {  //무한루프
			System.out.println("안녕하세요. ^^");
			System.out.print("계속(0), 종료(1) >> ");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("시스템을 종료 합니다.");
				break;
			}
			
		}
	}

}
