package �ݺ���;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//�ǽ� : a��b�� ���ڸ� �Է¹޾� a-b�� ����ϴ� ���α׷� �ۼ�, �� ���� ��� 0�� �ԷµǸ� ���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		
		
		while(a != 0 || b != 0) {
			System.out.print("A �Է� : ");
			a = sc.nextInt();
			System.out.print("B �Է� : ");
			b = sc.nextInt();
			System.out.println("��� : " + (a - b));
		}System.out.println("���α׷� ����");
		
		//�׻� ���ǽ��� boolean Ÿ�Ը� �;��Ѵ�.
//		while(true) {
//			System.out.print("A �Է� : ");
//			a = sc.nextInt();
//			System.out.print("B �Է� : ");
//			b = sc.nextInt();
//			
//			if(a == 0 && b == 0)
//			break;
//			System.out.println("��� : " + (a - b));
//		}System.out.println("���α׷� ����");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
