import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		
		//실습 : 점수가 90이상이면 A, 80~90이면 B, 70~80이면 C, 나머지는 D 출력.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int result = num/10;
		
		switch(result) {
		case 10:
		case 9:
		System.out.println("A학점입니다.");
		break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		default:
			System.out.println("D학점입니다.");
		}
		
		//int ts = totalScore >= 90 ? 0 : (totalScore >= 80 ? 1 : (totalScore >= 70 ? 2 : 3)); 삼항연산자 활용
		
		/*
		 * switch(ts) {
		case 0:
		System.out.println("A학점입니다.");
		break;
		case 1:
			System.out.println("B학점입니다.");
			break;
		case 2:
			System.out.println("C학점입니다.");
			break;
		default:
			System.out.println("D학점입니다.");
		}
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
