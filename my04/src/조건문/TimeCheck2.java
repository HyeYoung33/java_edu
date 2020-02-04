
package 조건문;

import java.util.Date;

public class TimeCheck2 {
	
	public static void main(String[] args) {
		Date date = new Date();
		
		int hour =	date.getHours();
		System.out.println("현재 시각은 " + hour + "시 ");
		
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(min + "분 " + sec + "초 입니다.");
		
		int year = date.getYear() + 1900;
		System.out.println("올해는 " + year + "년 ");
		
		int month = date.getMonth() + 1;
		System.out.println("이번달은  " + month + "월 ");		

		int 일 = date.getDate();
		System.out.println("이번달은  " + 일 + "일 ");
		
		int day = date.getDay();
		
		switch (day) {
		case 0:
			System.out.println("오늘은  일요일");
			break;
		case 1:
			System.out.println("오늘은  월요일");
			break;
		case 2:
			System.out.println("오늘은  화요일");
			break;
		case 3:
			System.out.println("오늘은  수요일");
			break;
		case 4:
			System.out.println("오늘은  목요일");
			break;
		case 5:
			System.out.println("오늘은  금요일");
			break;
		case 6:
			System.out.println("오늘은  토요일");
			break;
		default:
			break;
		}
			
	}
}
