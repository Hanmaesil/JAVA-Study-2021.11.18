import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		//���ǹ� �ǽ� : �� ������ ���䰳���� ������ Ÿ���� ���� 5���� �����ϰ� �Է¹����ÿ�
		//�Ѱ����̶� 8�� �̸��ΰ�� ���հ� ���, �Ѱ����� 60�� �̻��̸� �հ� ���
		//�Ѱ���� �ִ� 20��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int sco1 = sc.nextInt();
		System.out.print("���ڰ��� ���� : ");
		int sco2 = sc.nextInt();
		System.out.print("OS : ");
		int sco3 = sc.nextInt();
		System.out.print("��������� : ");
		int sco4 = sc.nextInt();
		System.out.print("����Ʈ���� ���� : ");
		int sco5 = sc.nextInt();
		
		int result = sco1 + sco2 + sco3+ sco4 + sco5;
		
		
		//Ǯ��
		/*boolean isCheck1 = sco1 >= 8 && sco2 >= 8 && sco3 >= 8 && sco4 >= 8 && sco5 >= 8;
		boolean isCheck2 = result >= 60;
		boolean fin = isCheck1 && isCheck2;
		
		if(fin) {
			System.out.println("�հ��Դϴ�");
		}else {
			System.out.println("���հ��Դϴ�.");
		}*/
		
		if(sco1 < 8 || sco2 < 8 || sco3 < 8 || sco4 < 8 || sco5 < 8) {
			System.out.println("���հ��Դϴ�.");
		}else if(sco1 >= 21 || sco2 >= 21 || sco3 >= 21 || sco4 >= 21 || sco5 >= 21) {
			System.out.println("�ٽ� �Է��ϼ���.");
		}else if(result >= 60 && result <= 100) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		sc.close();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


