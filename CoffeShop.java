/*
 * 커피 가격 안내 프로그램
 * 아이스(+500 추가요금), 따뜻한
 * 1.아메리카노 2000원 / 라떼 2500 / 모카 3000
 * ------------------------
 * 주문하신 아이스 아메리카노는 2500원입니다.
 */
import java.util.Scanner;
public class CoffeShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ICE = 500;
		final int AMERICANO = 2000;
		final int LATTE = 2500;
		final int MOCHA = 3000;
		
		
		System.out.println("아이스(+500 추가요금), 따뜻한");
		boolean isIce = (input.nextInt() == 1);
		System.out.println("1.아메리카노 2000 / 2.카페라떼 2500 / 3.카페모카 3000");
		int choice = input.nextInt();
		
		String coffee;
		int money = 0;
		
		if(choice == 1) {
			coffee = "아메리카노";
			money += AMERICANO;
		} else if(choice ==2) {
			coffee = "카페라떼";
			money += LATTE;
		} else {
			coffee = "카페모카";
			money += MOCHA;
		}
			System.out.println("주문하신"
					+ (isIce ? "아이스" : "따뜻한")
					+ coffee +  "는"
					+ (isIce ? money + ICE : money)
					+ "입니다.");
			
		
		

	}

}
