import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
		//�ǽ� : ���� �Է¹޾� ��,����,����,�ܿ� �� �´� ���� �˷��ִ� ���α׷�
		//12,1,2 - �ܿ� , 3,4,5 - �� 6,7,8 - ���� 9,10,11 -����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		
		//���׿�����
		
		int a = month >= 3 && month <=5 ? 0 : (month >= 6 && month <= 8? 1 : (month >=9 && month <=11 ?  2 : 3));
		
		switch(a) {
		case 0:
			System.out.println(month + "�� �� �Դϴ�.");
			break;
		case 1:
			System.out.println(month + "�� ���� �Դϴ�.");
			break;
		case 2:
			System.out.println(month + "�� ���� �Դϴ�.");
		default:
			System.out.println(month + "�� �ܿ��Դϴ�.");
		
		
		
		
		//Ǯ��
		/*switch(month/3) {
		case 4:
		case 0:
			System.out.println(month + "�� �ܿ� �Դϴ�.");
			break;
		case 1:
			System.out.println(month + "�� �� �Դϴ�.");
			break;
		case 2:
			System.out.println(month + "�� ���� �Դϴ�.");
			break;
			default:
			System.out.println(month + "�� ���� �Դϴ�.");
		
		}
		 * 
		 */
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println(month + "�� �ܿ� �Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "�� �� �Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "�� ���� �Դϴ�.");
			break;
			default:
			System.out.println(month + "�� ���� �Դϴ�.");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}
}
