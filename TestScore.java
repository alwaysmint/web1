import java.util.Scanner;

/*
 * 사용자에게 점수(정수)를 입력받습니다.
 * 60점 이상이면 합격
 * 60점 미만이면 불합격과 부족한 점수를 출력
 */
public class TestScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int number = input.nextInt();
		if (number >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격 " + (60 - number) +"점 부족합니다");
		}
		
	}

}
