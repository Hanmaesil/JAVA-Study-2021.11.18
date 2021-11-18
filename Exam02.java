import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		//조건문 실습 : 각 과목의 정답개수를 정수형 타입의 변수 5개를 선언하고 입력받으시오
		//한과목이라도 8개 미만인경우 불합격 출력, 총개수가 60개 이상이면 합격 출력
		//한과목당 최대 20점
		
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int sco1 = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int sco2 = sc.nextInt();
		System.out.print("OS : ");
		int sco3 = sc.nextInt();
		System.out.print("데이터통신 : ");
		int sco4 = sc.nextInt();
		System.out.print("소프트웨어 공학 : ");
		int sco5 = sc.nextInt();
		
		int result = sco1 + sco2 + sco3+ sco4 + sco5;
		
		
		//풀이
		/*boolean isCheck1 = sco1 >= 8 && sco2 >= 8 && sco3 >= 8 && sco4 >= 8 && sco5 >= 8;
		boolean isCheck2 = result >= 60;
		boolean fin = isCheck1 && isCheck2;
		
		if(fin) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다.");
		}*/
		
		if(sco1 < 8 || sco2 < 8 || sco3 < 8 || sco4 < 8 || sco5 < 8) {
			System.out.println("불합격입니다.");
		}else if(sco1 >= 21 || sco2 >= 21 || sco3 >= 21 || sco4 >= 21 || sco5 >= 21) {
			System.out.println("다시 입력하세요.");
		}else if(result >= 60 && result <= 100) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		sc.close();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


