/*
 * 1. 10부터 20까지 출력해보세요.
 * 2. 10부터 0까지 역순으로 출력해보세요.
 * 3. 0부터 50까지 7의 배수만 출력해보세요.
 * 4. 0부터 50까지의 7의 배수의 개수를 세어 출력해보세요.
 * 5. 사용자에게 입력받은 수만큼만 Hello라고 출력해보세요.
 * 6. 0부터 50까지의 합을 구해보세요.
 * 7. 사용자에게 입력받은 단수의 구구단을 출력해보세요.
 * 8. 사용자에게 입력받은 수의 제곱수들을 5개 출력해보세요.
 *     입력 예 > 4 
 *     출력 예 >  3,9, 27, 81, 243
 */

import java.util.Scanner;
public class Loop2 {

	public static void main(String[] args) {
		for (int i = 10; i <=20 ; i++) {
			System.out.print(i);
		}
		System.out.println("------------");
		for (int i = 0; i <=10 ; i++) { // (i=10; i>=0; i--)
			System.out.print(10-i);
		}
//------------------------------------------------
		for (int i = 0; i <= 50; i++ ) { //int i =0; i<=50; i += 7
			if (i % 7 == 0) {
			System.out.println(i);
			}
		}
//---------------------------------------------------		
		int count = 0;
		for (int i = 0; i <=50; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("7배수 갯수 : "+ count);
		
//-----------------------------------------------------		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		 for (int i = 0; i < num; i++ ) {
			 System.out.println("Hello");
		 }
//----------------------------------------------------
		 int sum = 0 ;
		 for (int i = 0; i <=50; i++) {
             sum +=i;
		 } 
		 System.out.println("합 : " + sum);
//----------------------------------------------------		 
		 Scanner input = new Scanner(System.in);
		 int n = input.nextInt();
		 for (int i = 1; i < 10; i++) {
			 System.out.printf("%d * %d = %d\n", n, i, n * i );
		 }
//----------------------------------------------------		 
		 Scanner scan2 = new Scanner(System.in);
			int num2 = scan2.nextInt();
			int pow = num;
		 for (int i = 0; i < 5 ; i++, pow *= num2) {
				System.out.println(pow);
		}
	}
}

