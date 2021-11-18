import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 조건문은 무언가를 판별할 때 사용한다.
		// 조건문 실습 : 정수를 입력받아 홀수인지 짝수인지 판별하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int answer = num % 2;
		if (answer == 0) {
			System.out.println(num + "는(은) 짝수입니다.");
		} else {
			System.out.println(num + "는(은) 홀수입니다.");
		}
		
		sc.close(); //불필요한 메모리 낭비를 막기 위해 scanner기능을 닫는다.
		
	}

}
