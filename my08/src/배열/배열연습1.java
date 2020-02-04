package 배열;

public class 배열연습1 {

	public static void main(String[] args) {

		int[] num = new int[10];  // 10개의 int 변수 만듦
		System.out.println(num);  // num 배열의 주소가 인쇄됨
		System.out.println(num[0]);  // 첫 번째 방의 값을 인쇄함.
		System.out.println(num[9]);  // 마지막 방의 값을 인쇄함.
		
		num[0] = 5;
		System.out.println(num[0]);

		num[4] = 10;
		System.out.println(num[4]);
		
		num[9] = 20;
		System.out.println(num[9]);
		
		String[] str = new String[10];
		System.out.println(str[0]);
	}

}
