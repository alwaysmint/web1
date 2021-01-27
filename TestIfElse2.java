/*
 * 사용자에게 정수 두 개를 입력 받습니다.
 * 첫 번째 수가 두 번쨰 수보다 크면 "첫 번째 수가 큽니다."
 * 아니면 "두 번쨰 수가 크거나 같습니다."
 */

import java.util.Scanner;
 
public class TestIfElse2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("첫 번째 수가 큽니다");
		} else {
			System.out.println("두 번째 수가 크거나 같습니다.");
		}
	}
}
/*	if (num1 > num2) {
	    System.out.println("첫 번쨰 수가 큽니다");
	} else if(num1 == num2) {
		System.out.println("두 수가 같습니다");
	} else {
		System.out.println("두 번째 수가 큽니다");
	}
	}
	} 
*/