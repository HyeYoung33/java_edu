package 순차문;

import java.util.Scanner;

public class N빵 {

	public static void main(String[] args) {
		
		// 콘솔에서 입력받을 수 있는 부품(class)을 복사해 왔음.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------N 빵---------------");
		
		System.out.print("음식점 계산 총 금액? ");
		int amount = sc.nextInt();
		
		System.out.print("함께 먹은 사람 인원수? ");
		int people = sc.nextInt();
	
		System.out.println("-------------------------------------");
		double result = amount / (double)people;
		
		System.out.println("각자 내야 할 돈은 " + (int)result + "원입니다. ");
		
		int result2 = amount - (int)result * (people - 1);
		System.out.println("마지막 한 사람은 " + result2 + "원을 내야 합니다. ");
		
	
		
		
	}

}
