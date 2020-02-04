package 배열;

public class 배열연습5 {

	public static void main(String[] args) {

		String[] names = {"홍길동", "김길동", "박길동", "송길동", "이길동"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " ");
		}
		
		int[] ages = {10, 30, 40, 44, 60};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "의 나이는 " + ages[i] + "살 입니다.");
	
		}
		
		int[] sizes = {220, 230, 240, 245, 260};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "의 신발 사이즈는 " + sizes[i] + "mm 입니다.");
			
		}
		
		char[] gender = {'남', '여', '여', '남', '여'};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "는 " + gender[i] + "자 입니다.");
			
		}
	}

}
