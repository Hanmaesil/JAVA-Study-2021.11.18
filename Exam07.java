import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
		//실습 : 월을 입력받아 봄,여름,가을,겨울 중 맞는 계절 알려주는 프로그램
		//12,1,2 - 겨울 , 3,4,5 - 봄 6,7,8 - 여름 9,10,11 -가을
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		//삼항연산자
		
		int a = month >= 3 && month <=5 ? 0 : (month >= 6 && month <= 8? 1 : (month >=9 && month <=11 ?  2 : 3));
		
		switch(a) {
		case 0:
			System.out.println(month + "는 봄 입니다.");
			break;
		case 1:
			System.out.println(month + "는 여름 입니다.");
			break;
		case 2:
			System.out.println(month + "는 가을 입니다.");
		default:
			System.out.println(month + "는 겨울입니다.");
		
		
		
		
		//풀이
		/*switch(month/3) {
		case 4:
		case 0:
			System.out.println(month + "는 겨울 입니다.");
			break;
		case 1:
			System.out.println(month + "는 봄 입니다.");
			break;
		case 2:
			System.out.println(month + "는 여름 입니다.");
			break;
			default:
			System.out.println(month + "는 가을 입니다.");
		
		}
		 * 
		 */
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println(month + "는 겨울 입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "는 봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "는 여름 입니다.");
			break;
			default:
			System.out.println(month + "는 가을 입니다.");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}
}
