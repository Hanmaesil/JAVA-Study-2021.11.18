import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		// �ǽ� : ���Ǳ� ���α׷��� ����� ���ÿ�

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();

		System.out.println("�޴��� ������");

		System.out.print("1. �ݶ�(800��) 2. ����(500��)  3. ��Ÿ�ο���(1500��) : ");
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
			System.out.println("���� �����մϴ�.");
		}else {
			System.out.println("���ְ� �弼��.");
			System.out.println("�ܵ��� : " + result);
		}
		
			
		
//		System.out.print("�ܵ� : ");
//		switch (menu) {
//		case 1:
//			if (pOne >= 0) {
//				System.out.println(pOne);
//			} else {
//				System.out.println("�ݾ� ����");
//			}
//			// money = money - 800; (1)
//			break;
//		case 2:
//			if (pTwo >= 0) {
//				System.out.println(pTwo);
//			} else{
//				System.out.println("�ݾ� ����");
//			}
//			break;
//		case 3:
//			if (pThree >= 0) {
//				System.out.println(pThree);
//			} else{
//				System.out.println("�ݾ� ����");
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
	 * if else System.out.print("�ܵ� : "); if(menu == 1) { System.out.println(money -
	 * one); }else if(menu == 2) { System.out.println(money - two); }else{
	 * System.out.println(money - three); }
	 */


