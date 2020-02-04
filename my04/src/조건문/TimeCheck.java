package 조건문;

import java.util.Date;

public class TimeCheck {

	public static void main(String[] args) {
		// 실행할 때 현재 시각을 구해서 
		// 얼마나 집에 갈 시간이 남았는지 체크
		Date date	=	new Date();
		int hour	=	date.getHours();
		if (hour < 22) {
			System.out.println("집에 갈 시간이 많이 남았어요.");
		} else {
			System.out.println("집에 갈 시간이 다가 옵니다.");
		}
	}

}
