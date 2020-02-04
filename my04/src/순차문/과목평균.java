package 순차문;

import java.util.Scanner;

public class 과목평균 {

	public static void main(String[] args) {
		
		int 수학 = 88;
		int 영어 = 99;
		int 국어  = 55;
		
		int total = 수학 + 영어 + 국어;
		
		System.out.println("전체 과목의 합계는 " + total + "점");
		
		int 과목수 = 3;
		double ave  = total / (double)과목수;
		
		System.out.println("전체 과목의 평균은 " + ave + "점");
		
		
		
	}

}
