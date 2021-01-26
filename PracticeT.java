import java.util.Scanner;

/*
 * 사용자에게 정수 하나를 입력받아
 * 1. 입력한 정수에서 1을 더한 값이 7의 배수이고, 50보다 작은 수이면 true
 * 2. 입력한 정수에서 1을 뺀 값이 20~30 사이의 수이면 true
 */
public class PracticeT {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력하세요 : ");
		int number = input.nextInt();
		int plus = number + 1;
		int minus = number - 1;
		
		System.out.println((plus % 7 == 0) && (plus < 50));
		
		System.out.println((20 <= minus) && (minus <= 30));
		
	}
}
		