package 순차문;

import java.util.Scanner;

public class 여행정보 {

	public static void main(String[] args) {
		
		// 콘솔에서 입력받을 수 있는 부품(class)을 복사해 왔음.
		Scanner sc = new Scanner(System.in);
		
		// ------------ 여 행 정 보 ---------------
		System.out.println("------------여 행 정 보---------------");
		
		// 여행지 ?  제주도
		System.out.print("당신의 여행지는? ");
		String where = sc.next();
		
		// 경비는? 200000원
		System.out.print("당신의 경비는? ");
		int money = sc.nextInt();
	
		// 할인율? 0.3
		System.out.print("할인율은? ");
		double sale = sc.nextDouble();
	
		//-------------------------------------
		System.out.println("-------------------------------------");
		double result = money - money * sale;
		
		// 당신의 실제 여행 경비는?  140000원
		System.out.println("당신의 " + where +  " "
				+ "실제 여행 경비는 " + (int)result + "원입니다. ");
	
		
		
	}

}
