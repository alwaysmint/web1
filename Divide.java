/*
 * 사용자에게 정수를 2개를 입력받아
 * 첫 번째 정수를 두 번째 정수로 나눈 몫과 나머지를 출력하시오
 */

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력하시오");
		int first = scan.nextInt();
		System.out.println("두 번째 수를 입력하시오");
		int second = scan.nextInt();
		
		
		System.out.println("첫 번째 수에서 두 번째 수를 나눈 몫 : " 
		                                 + first / second);
		System.out.println("첫 번째 수에서 두 번째 수를 나눈 나머지" 
				+ first % second);
	}

}
