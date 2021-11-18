package 반복문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//실습 : 숫자를 입력받아 홀수와 짝수가 각각 몇개 입력되었는지 출력하는 프로그램, -1을 입력한 경우 프로그램 종류
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int num1 = num%2;
		int c = 0;
		int d = 0;
		
		
		while(num != -1) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			if(num1 == 0) {
				c++;
			}else{
				d++;
			}
			System.out.println("짝수 개수 : " + c);
			System.out.println("홀수 개수 : " + d);
			}System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
