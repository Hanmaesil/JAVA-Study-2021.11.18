package �ݺ���;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//�ݺ��� - while : ��Ȯ�ϰ� ��� �ݺ��ؾ� �ϴ��� �������� ���� �� ���.
		
		//�ݺ������� ���� ���߱�.
		
		int answer = 30;
		int user = 0;
		int cnt = 0;
		
		//while
		
		while(user != answer) {
			System.out.print("������ �Է����ּ��� : ");
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
			cnt++;
			System.out.println("�õ��� Ƚ�� : " + cnt);
		}System.out.println("�����Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
