package 반복문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//실습 : a와b의 숫자를 입력받아 a-b를 계산하는 프로그램 작성, 두 수가 모두 0이 입력되면 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		
		
		while(a != 0 || b != 0) {
			System.out.print("A 입력 : ");
			a = sc.nextInt();
			System.out.print("B 입력 : ");
			b = sc.nextInt();
			System.out.println("결과 : " + (a - b));
		}System.out.println("프로그램 종료");
		
		//항상 조건식은 boolean 타입만 와야한다.
//		while(true) {
//			System.out.print("A 입력 : ");
//			a = sc.nextInt();
//			System.out.print("B 입력 : ");
//			b = sc.nextInt();
//			
//			if(a == 0 && b == 0)
//			break;
//			System.out.println("결과 : " + (a - b));
//		}System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
