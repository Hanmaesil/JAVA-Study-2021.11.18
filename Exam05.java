import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// �ǽ� : ������ �Է� �޾� Ȧ������ ¦������ �Ǻ��ϼ���.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int result = num % 2;

		switch (result) {
		case 0:
			System.out.println("¦���Դϴ�.");
			break;
		default:
			System.out.println("Ȧ���Դϴ�.");
		}

		
//		if(result == 0) {
//			System.out.println("¦���Դϴ�.");
//		}else {
//			System.out.println("Ȧ���Դϴ�.");
//		}
//		
		
		
		
		
		
	}

}
