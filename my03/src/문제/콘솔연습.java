package 문제;

import java.util.Scanner;

public class 콘솔연습 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력>> ");
		String name = sc.next(); //  단어 입력 받는 기능
		
		System.out.print("나이 입력>> ");
		String age = sc.next(); //  단어 입력 받는 기능
		
		System.out.print("나이 취미>> ");
		String chi = sc.next(); //  단어 입력 받는 기능
		
		
		//2.처리
		//3.콘솔(모니터)에 출력
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는" + age + "세");
		System.out.println("나의 취미는 " + chi + "입니다.!");
	}
}
