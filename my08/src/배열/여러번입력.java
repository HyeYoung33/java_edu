package 배열;

import java.util.Scanner;

public class 여러번입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int sum = 0;
		String[] names = {"홍길동", "김길동", "박길동", "송길동", "이길동"};
		
		for (int i = 0; i < 5; i++) {
			System.out.print(names[i] + "의 성적을 입력 =>> ");
			score[i] = sc.nextInt();
			sum	+=	score[i];
		}
		
		System.out.println();
		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i] + "의 성적은 " + score[i] + "점 입니다.");
			System.out.print(score[i] + " ");
		}
		System.out.println();
		System.out.println("총점은 " + sum + "점 입니다.");
		double ave = sum / (double)score.length;
		System.out.println("평균 점수는 " + ave + "점 입니다. ");
	}

}
