import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		// �ǽ� : ����, ����, ���������� �Է¹޾� ��� 90�� �̻��̸� a�����Դϴ� ���
		// 80~90 ���̴� b, 70~80 ���̴� c, �� �ܿ��� f�����Դϴ�.
		// 80~90 ���̴� 82.xx b�����Դϴ� ���.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int math = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int sci = sc.nextInt();

		double avr = (math + eng + sci) / 3.0;
		boolean over = math > 100 || eng > 100 || sci > 100;
		int change1 = (int)(avr * 100);
		double result = change1 * 0.01;
		
		System.out.print("��� " + result + "�� ");
		
		if (over) {
			System.out.println("�ٽ� �Է��ϼ���");
		}
		else if (result >= 90) {										
			System.out.println(" A �����Դϴ�.");
		} else if (result >= 80) {										//90�� ���϶�� �ι�°�� �ٷ� ���� ������ avr 90�̻��� ���ǹ��� �����ʿ� ����.
			System.out.println(" B �����Դϴ�.");
		} else if (result >= 70) {
			System.out.println(" C �����Դϴ�.");
		} else {
			System.out.println(" F �����Դϴ�.");
		}

	}

}
