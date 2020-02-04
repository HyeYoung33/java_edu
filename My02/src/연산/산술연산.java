package 연산;

public class 산술연산 {

	public static void main(String[] args) {
		int n1 = 200;
		int n2 = 100;
		int n3;
		
		n3 = n1 + n2;
		
		System.out.println("두 수의 합은  " + n3 + "입니다.");
		
		n3 = n3 + 1;

		int n4 = n1 - n2;
		
		System.out.println("n1:" + n1 + "에서 " + "n2:" + n2 + "를 빼면 " + n4 + "입니다. ");
		System.out.println("n1:" + n1 + "에서 " + "n2:" + n2 + "를 곱하면 " + n1 * n2 + "입니다. ");
		System.out.println("n1:" + n1 + "에서 " + "n2:" + n2 + "를 나누면 몫은 " + n1 / n2 + "입니다. ");
		System.out.println("n1:" + n1 + "에서 " + "n2:" + n2 + "를 나누면 나머지는 " + n1 % n2 + "입니다. ");
		
	}

}
