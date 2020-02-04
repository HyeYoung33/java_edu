package 변수;

public class 데이터2 {

	public static void main(String[] args) {
		// 컴퓨터가 인식하는 데이터는 무었인가?
		// 기본 데이터
		// 숫자(정수, 실수),  1글자(문자),  맞는지 여부 (논리)
		
		int year;
		year = 2020;
		
		int age = 100;
		double eye = 0.7;
		char sn = '1';
		boolean coffee = true;   //false 
		
		System.out.println("내 나이는 " + age + "살 입니다. ");
		System.out.println("내 시력은 " + eye + "입니다. ");
		System.out.println("나의 시그널은 " + sn + "입니다. ");
		System.out.println("나는 커피를 마셨습니다 : " + coffee);
		
		//모든 연산은 cpu가 한다.
		System.out.println(age + 1);
		int nextAge = age + 1;
		System.out.println("내년에 내 나이는 " + nextAge + "살 입니다. ");
		
		

	}

}
