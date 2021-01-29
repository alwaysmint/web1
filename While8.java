import java.util.Scanner;

/*
 * 사용자가 정수를 반복해서 입력합니다.
 * 0을 입력하면 반복문이 종료됩니다.
 * 그동안 입력받은 정수의 개수를 출력해보세요.
 * 1
 * 2
 * 50
 * 0
 * 종료 : 총 4개 정수의 합은 53입니다.
 * */
public class While8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		boolean loop = true;
		while (loop) {
			int input = scan.nextInt();
			sum += input;
			loop = input != 0;
			count++;
	}
		System.out.println("종료 : " + count + "개 정수의 합은"+ sum +"입니다.");
	}
}
