package 순차문;

import java.util.Scanner;

public class 콘솔연습2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 입력>> ");
//		int age = sc.nextInt(); // 단어 입력 받는 기능
//		int nextAge = age + 1;
//
//		// 2.처리
//		// 3.콘솔(모니터)에 출력
//		System.out.println("내년 나이는 " + nextAge + "살 입니다.");
//
//		System.out.println("키를 입력>> ");
//		double height = sc.nextDouble();
//		System.out.println("당신의 키는 " + height);
//
		System.out.println("저녁을 먹었는지 입력(true/false)>> ");
		boolean food = sc.nextBoolean();
		System.out.println("당신의 저녁 여부는  " + food);

		System.out.println("올해의 목표는>> ");
		sc.nextLine();
		String life = sc.nextLine();
		System.out.println("올해의 목표는  " + life);
	}
}
