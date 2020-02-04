package 반복문;

import java.util.Scanner;

public class 은행결제시스템 {

	public static void main(String[] args) {
		//은행 결제 시스템
		//----------
		// 1)잔고확인,  2)입금,  3)출금,  4)종료
		//선택 1)  당신의 잔고는 10000원
		
		//선택 2)  당신의 입금액은 1000원
		
		//선택 3)  당신의 출금액은 1000원
		
		//선택 4)  시스템을 종료합니다.
		
		int bal = 10000;
		int amt;
		int choice;
		boolean loop = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("은행 결제 시스템");
		System.out.println("===========");
		
		while (loop) {  // while (true)  무한루프로 변경 가능
			System.out.println("1)잔고확인, 2)입금, 3)출금, 4)종료");
			choice	= sc.nextInt();
			if (choice == 1) {
				System.out.println("당신의 잔고는 " + bal + "원입니다.");
			} else if (choice == 2){
				System.out.print("입금할 금액은? ");
				amt	=	sc.nextInt();
				bal	+=	amt;
				System.out.println("입금후 당신의 잔고는 " + bal + "원입니다. ");
			} else if (choice == 3){
				System.out.print("출금할 금액은? ");
				amt	=	sc.nextInt();
				bal	-=	amt;
				System.out.println("출금후 당신의 잔고는 " + bal + "원입니다. ");
			} else if (choice == 4){
				System.out.print("시스템을 종료 합니다.");
				loop = false;  // break 로 사용 가능

			}
		} //while end
	}

}
