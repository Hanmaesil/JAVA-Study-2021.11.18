import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		// 실습 : 자판기 프로그램을 만들어 보시오

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();

		System.out.println("메뉴를 고르세요");

		System.out.print("1. 콜라(800원) 2. 생수(500원)  3. 비타민워터(1500원) : ");
		int menu = sc.nextInt();
		int one = 800;
		int two = 500;
		int three = 1500;
		int pOne = money - one;
		int pTwo = money - two;
		int pThree = money - three;

		int result = 0;
		
		switch (menu) {
		case 1:
			result = money - 800;
			// money = money - 800; (1)
			break;
		case 2:
			result = money - 500;
			break;
		case 3:
			result = money -1500;
			break;
		}
		if(result <0) {
			System.out.println("돈이 부족합니다.");
		}else {
			System.out.println("맛있게 드세요.");
			System.out.println("잔돈은 : " + result);
		}
		
			
		
//		System.out.print("잔돈 : ");
//		switch (menu) {
//		case 1:
//			if (pOne >= 0) {
//				System.out.println(pOne);
//			} else {
//				System.out.println("금액 부족");
//			}
//			// money = money - 800; (1)
//			break;
//		case 2:
//			if (pTwo >= 0) {
//				System.out.println(pTwo);
//			} else{
//				System.out.println("금액 부족");
//			}
//			break;
//		case 3:
//			if (pThree >= 0) {
//				System.out.println(pThree);
//			} else{
//				System.out.println("금액 부족");
//			}
//			

		}

	}
	// System.out.print(money); (1)
	/*
	 * switch(menu) { case 1: System.out.println(money - 800); break; case 2:
	 * System.out.println(money - 500); break; case 3: System.out.println(money -
	 * 1500); }
	 */

	/*
	 * if else System.out.print("잔돈 : "); if(menu == 1) { System.out.println(money -
	 * one); }else if(menu == 2) { System.out.println(money - two); }else{
	 * System.out.println(money - three); }
	 */


