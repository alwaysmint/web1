/*
 * 사용자에게 정수 5개를 입력받는다.
 * 입력한 정수가 양수이고, 3의 배수이거나 5의 배수인 수들의
 * 합을 구해서 출력해보세요.
 */
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요 : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		
		int sum = 0;
		
		if (a > 0 && a % 3 == 0 || a % 5 == 0);
		sum = sum + a;
		if(b > 0 && b % 3 == 0 || b % 5 == 0);
		sum = sum + b;
		if(c > 0 && c % 3 == 0 || c % 5 == 0);
		sum = sum + c;
		if(d > 0 && d % 3 == 0 || d % 5 == 0);
		sum = sum + d;
		if(e > 0 && e % 3 == 0 || e % 5 == 0);
		sum = sum + e;
			System.out.println(sum);

	}

}
