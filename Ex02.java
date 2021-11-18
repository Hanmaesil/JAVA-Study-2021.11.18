package 반복문;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		//while 문을 사용하여 키보드로부터 입력 받은 수가 10보다 작을때만 계속 정수 입력, 10보다 큰수 입력시 종료 출력
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cont = 0;
				
		while(num < 10) {
			System.out.print("정수 입력 : " );
			num = sc.nextInt();
			++cont;
			}System.out.println("종료되었습니다.");
			System.out.println("반복된 횟수 : " + cont);
			
			
			/*분기문 사용.
			while(true) {
				System.out.print("정수 입력 : " );
				num = sc.nextInt();
				if(num > 10) {
					break; // 반복문을 종료하는 명령어.
				}
				}System.out.println("종료되었습니다.");
		*/
			
		
		
		
		
		
		
		
	}
}
