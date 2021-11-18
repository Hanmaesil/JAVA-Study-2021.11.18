package 반복문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//반복문 - while : 정확하게 몇번 반복해야 하는지 정해지지 않을 때 사용.
		
		//반복문으로 정답 맞추기.
		
		int answer = 30;
		int user = 0;
		int cnt = 0;
		
		//while
		
		while(user != answer) {
			System.out.print("정답을 입력해주세요 : ");
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
			cnt++;
			System.out.println("시도한 횟수 : " + cnt);
		}System.out.println("정답입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
