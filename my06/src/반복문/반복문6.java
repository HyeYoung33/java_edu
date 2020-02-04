package 반복문;

import java.util.Scanner;

public class 반복문6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1)아이유  2)유재석  3)공유");
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int choice;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("당신의 선택은? >> ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				sum1++;
				System.out.println("당신은 아이유를 선택 하셨습니다! ");
				break;

			case 2:
				sum2++;
				System.out.println("당신은 유재석을 선택 하셨습니다! ");
				break;

			case 3:
				sum2++;
				System.out.println("당신은 공유를 선택 하셨습니다! ");
				break;

			default:
				i--;
				System.out.println("1, 2, 3 만 선택 가능합니다. !");
				break;
			}  // switch

		}  // for
		
		System.out.println();
		System.out.println("투표 결과를 발표하겠습니다. ");
		System.out.println("===================");
		System.out.println("아이유는 "+ sum1 + " 표를 득표했습니다!!");
		System.out.println("유재석은 "+ sum2 + " 표를 득표했습니다!!");
		System.out.println("공유는 "+ sum3 + " 표를 득표했습니다!!");
	}

}
