/*
 * 학생의 국어,수학,영어 점수를 입력하고 합계,평균점수를 구하시오.
 */

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요  : ");
		int korean = scan.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = scan.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		int english = scan.nextInt();
		
		int sum = (korean + math + english);
		double average = sum / 3; // sum, 3이 모두 정수이므로 정수로 출력
		double average2 = sum / 3.0; // 실수값으로 출력
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average2);

	}

}
