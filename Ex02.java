package �ݺ���;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		//while ���� ����Ͽ� Ű����κ��� �Է� ���� ���� 10���� �������� ��� ���� �Է�, 10���� ū�� �Է½� ���� ���
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cont = 0;
				
		while(num < 10) {
			System.out.print("���� �Է� : " );
			num = sc.nextInt();
			++cont;
			}System.out.println("����Ǿ����ϴ�.");
			System.out.println("�ݺ��� Ƚ�� : " + cont);
			
			
			/*�б⹮ ���.
			while(true) {
				System.out.print("���� �Է� : " );
				num = sc.nextInt();
				if(num > 10) {
					break; // �ݺ����� �����ϴ� ��ɾ�.
				}
				}System.out.println("����Ǿ����ϴ�.");
		*/
			
		
		
		
		
		
		
		
	}
}
