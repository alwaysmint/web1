// 73페이지

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("구의 반지름을 입력하세요  : ");
		double radius = scan.nextDouble();

		double volume = 4.0 / 3.0 * radius * radius * radius; 
		double volume1 =  4 / 3 * radius * radius * radius; 
				// 순서대로 계산하면 정수로 인식
		// 선언 실수값이므로 실수로 입력해야한다.
		
		System.out.println("구의 부피  : " + volume);
		System.out.println("구의 부피  : " + volume1);
		
		Scanner scann = new Scanner(System.in);
		System.out.print("화씨 온도 : ");
		double dhseh = scann.nextDouble();
		
		double tjt = 5.0 / 9.0 * (dhseh-32);
		System.out.println("섭씨 온도 : " + tjt);
		
	}
}