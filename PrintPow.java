/*
 * 사용자에게 정수 하나를 입력받아.
 * 제곱 수를 출력하세요.
 * ----------------------
 * 입력예1) 2 출력>4
 * 입력예2) 3 출력>9
 * 입력예3) 4 출력>16 
 */
import java.util.Scanner;

	public class PrintPow {

		public static void main(String[] args) {
			
			@SuppressWarnings("resource")
			Scanner scan2 = new Scanner(System.in);
			int x = scan2.nextInt();
			int total = x * x;
			System.out.println("정수를 입력하세요 :  ");		
		
			System.out.println("결과 : " + total);
			

		}

	}

