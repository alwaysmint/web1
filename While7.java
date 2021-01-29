import java.util.Scanner;

/*
 * 반복해서 사용자의 정수 입력을 받는데,
 * 입력한 정수가 100보다 크다면 반복문이 종료되는 프로그램.
 */
public class While7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean go  = true;
		while (go) {
			go = !(scan.nextInt() >= 100); // scan.nextInt() < 100
		}
		System.out.println("end");
	}

}
