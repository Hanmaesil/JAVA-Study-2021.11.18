import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 실습 : 정수를 입력 받아 홀수인지 짝수인지 판별하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int result = num % 2;

		switch (result) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		default:
			System.out.println("홀수입니다.");
		}

		
//		if(result == 0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
//		
		
		
		
		
		
	}

}
