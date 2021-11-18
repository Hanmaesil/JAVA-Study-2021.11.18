//if랑 switch를 비교했을 때는 switch가 더 빠르지만 if를 더 많이 사용하는 추세이다.
public class Exam04 {

	public static void main(String[] args) {

		// switch 조건문(조건식에 비교연산자는 사용불가.)
		int num = 40;
		// num의 값이 10이면 안녕하세요를 출력
		// 20이면 안녕히가세요 출력, 30이면 어서오세요 출력.
		// 이외의 숫자를 입력하면 정확한 숫자가 아닙니다 출력.

		switch (num) {
		case 10:
			System.out.println("안녕하세요.");
			break;                           //break를 안쓰면 순서대로 전부 실행된다.
		case 20:
			System.out.println("안녕히가세요.");
			break;
		case 30:
			System.out.println("어서오세요.");
			break;
		default :							//case에 맞는 답이 없다면 기본으로 출력되는 명령어.
			System.out.println("정확한 숫자가 아닙니다.");
		}

	}

}
