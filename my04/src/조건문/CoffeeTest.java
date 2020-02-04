package 조건문;

public class CoffeeTest {

	public static void main(String[] args) {
		int price = 5600;
		int count = 5;
		
		// 25,000원이 넘으면 할인 쿠폰 5000원
		// 아니면 그냥 다 냄.
		
		int sum = price * count;
		System.out.println("커피값으로 계산된"
				+ " 금액은 " + sum + "원입니다.");
		
		if (sum >= 25000)  {
			sum	-=	5000;
		}
		
		System.out.println("커피값으로 지불해야 할 금액은 " + sum + "원입니다.");
		
		int hour	=	21;
		
		if (hour < 22) {
			System.out.println("아직 집에 갈 시간이 남았어요");
		} else {
			System.out.println("집으로 갈 시간이 거의 다 되었어요");
		}
		
	}

	
}
