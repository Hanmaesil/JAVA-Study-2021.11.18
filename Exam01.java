import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// ���ǹ��� ���𰡸� �Ǻ��� �� ����Ѵ�.
		// ���ǹ� �ǽ� : ������ �Է¹޾� Ȧ������ ¦������ �Ǻ��Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		int answer = num % 2;
		if (answer == 0) {
			System.out.println(num + "��(��) ¦���Դϴ�.");
		} else {
			System.out.println(num + "��(��) Ȧ���Դϴ�.");
		}
		
		sc.close(); //���ʿ��� �޸� ���� ���� ���� scanner����� �ݴ´�.
		
	}

}
