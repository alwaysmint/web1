import java.util.Scanner;

/* 사용자가 무조건 5자리의 정수를 입력합니다.
 * 뒤집어서 출력해보세요.
 * ------------------
 * 입력예)12345
 * 출력예)54321
 * 
 * ---------------
 * 5 자리수의 1의 자리 수 구한다.다른 곳에 적어두기
 * 원본 수의 마지막 자리수를 지우개로 지우고, 4자리로 만든다
 * 4자리 수의 1의 자리 수 구한다. 아까 적은 수 옆에 적기
 */
public class ReverseNumver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 5자리를 입력하세요");		
		int number = scan.nextInt();
		System.out.print(number % 10);
		number = number / 10 ;
		System.out.print(number % 10);
		number = number / 10 ;
		System.out.print(number % 10);
		number = number / 10 ;
		System.out.print(number % 10);
		number = number / 10 ;
		System.out.println(number % 10);
		number = number / 10 ;


	}
}
