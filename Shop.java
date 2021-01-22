/*
 * 콘솔창에서 사용자에게 전달받은 금액을 입력받는다.
 * 콘솔창에서 사용자에게 상품의 가격을 입력받는다.
 * -----------------------
 * 거스름돈을 계산해서 콘솔창에 출력해보세요
 */

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		int total;
		System.out.print("전달받은 금액 : ");
		x = scan.nextInt();
		
		System.out.print("상품의 가격 : ");
		y = scan.nextInt();
		
		total = x - y;
		System.out.println("거스름돈 : " + total);
		

	}

}
