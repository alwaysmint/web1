import java.util.Scanner;

/*
 * 사용자가 n,m 두 개의 정수를 입력합니다.
 * n의 m제곱수를 구해보세요.
 * 입력 ) 2 7
 * 출력 ) 128
 */
public class Whili9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int pow = 1 ; // 0을 주면 계속 0만 나온다
		int i = 0;
		while(i < m) {
			pow *= n;
			i++;
		}
		System.out.println(pow);
	}
}