package �ݺ���;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//�ǽ� : ���ڸ� �Է¹޾� Ȧ���� ¦���� ���� � �ԷµǾ����� ����ϴ� ���α׷�, -1�� �Է��� ��� ���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int num1 = num%2;
		int c = 0;
		int d = 0;
		
		
		while(num != -1) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			if(num1 == 0) {
				c++;
			}else{
				d++;
			}
			System.out.println("¦�� ���� : " + c);
			System.out.println("Ȧ�� ���� : " + d);
			}System.out.println("���α׷� ����");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
