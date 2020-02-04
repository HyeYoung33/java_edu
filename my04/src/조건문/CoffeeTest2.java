package 조건문;

import java.util.Date;

public class CoffeeTest2 {

	public static void main(String[] args) {
		int price = 5600;
		int count = 3;
		
		Date date = new Date();
		
		int hour = date.getHours();
		
		int sum = price * count;
		System.out.println("커피값으로 계산된"
				+ " 금액은 " + sum + "원입니다.");
		System.out.println("현재 시간은" + hour + "시 입니다.");
		
		if (hour < 22)  {
			sum	-=	5000;
		}
		
		System.out.println("커피값으로 지불해야 할 금액은 " + sum + "원입니다.");

				
	}

	
}
