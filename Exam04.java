//if�� switch�� ������ ���� switch�� �� �������� if�� �� ���� ����ϴ� �߼��̴�.
public class Exam04 {

	public static void main(String[] args) {

		// switch ���ǹ�(���ǽĿ� �񱳿����ڴ� ���Ұ�.)
		int num = 40;
		// num�� ���� 10�̸� �ȳ��ϼ��並 ���
		// 20�̸� �ȳ��������� ���, 30�̸� ������� ���.
		// �̿��� ���ڸ� �Է��ϸ� ��Ȯ�� ���ڰ� �ƴմϴ� ���.

		switch (num) {
		case 10:
			System.out.println("�ȳ��ϼ���.");
			break;                           //break�� �Ⱦ��� ������� ���� ����ȴ�.
		case 20:
			System.out.println("�ȳ���������.");
			break;
		case 30:
			System.out.println("�������.");
			break;
		default :							//case�� �´� ���� ���ٸ� �⺻���� ��µǴ� ��ɾ�.
			System.out.println("��Ȯ�� ���ڰ� �ƴմϴ�.");
		}

	}

}
