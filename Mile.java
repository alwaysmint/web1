// 73페이지 1번 문제

import java.util.Scanner;

public class Mile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("마일을 입력하시오  : ");
		double mile = scan.nextDouble();

		double kilo = mile * 1.609;

		
		System.out.println("10마일은 " + kilo + "킬로미터입니다.");


		
	}
}