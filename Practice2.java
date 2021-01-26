import java.util.Scanner;

/*
 * 사용자가 정수 3개를 입력합니다.
 * 3개의 정수가 순서대로 입력되었다면 true
 * 2번쨰의 수가 1번쨰 수보다 1크고, 3번째 수가 2번째 수보다 1클 때
 * (1,2,3) true
 * (7,5,3) false
 */
public class Practice2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		System.out.println((y - x == 1) && (z - y == 1));

		boolean order = ((y - x == 1) && (z - y == 1));
		boolean reverse = ((x - 1)
		
	}

}
