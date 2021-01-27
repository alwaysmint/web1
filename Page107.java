/*
 * 조건 3개
 * 조건 여러개
 * else if
 * 
 * 사용자에게 점수를 입력받아서
 * 90 이상이면 A
 * 80 이상이면 B
 * 70 이상이면 C
 * 60 이상이면 D
 * 미만이면 F 
 */
import java.util.Scanner;
public class Page107 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = input.nextInt();
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else
			System.out.println("F");
	}
}

