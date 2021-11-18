import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		// 실습 : 수학, 영어, 과학점수를 입력받아 평균 90점 이상이면 a학점입니다 출력
		// 80~90 사이는 b, 70~80 사이는 c, 그 외에는 f학점입니다.
		// 80~90 사이는 82.xx b학점입니다 출력.

		Scanner sc = new Scanner(System.in);
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("과학 점수 입력 : ");
		int sci = sc.nextInt();

		double avr = (math + eng + sci) / 3.0;
		boolean over = math > 100 || eng > 100 || sci > 100;
		int change1 = (int)(avr * 100);
		double result = change1 * 0.01;
		
		System.out.print("평균 " + result + "점 ");
		
		if (over) {
			System.out.println("다시 입력하세요");
		}
		else if (result >= 90) {										
			System.out.println(" A 학점입니다.");
		} else if (result >= 80) {										//90점 이하라면 두번째로 바로 가기 때문에 avr 90이상을 조건문에 넣을필요 없다.
			System.out.println(" B 학점입니다.");
		} else if (result >= 70) {
			System.out.println(" C 학점입니다.");
		} else {
			System.out.println(" F 학점입니다.");
		}

	}

}
