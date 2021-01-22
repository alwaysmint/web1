import java.util.Scanner;

public class Shop2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 넣어주세요 : ");
		int money = scan.nextInt();
		System.out.print("가격을 입력해주세요 : ");
		int price = scan.nextInt();
		
		int vat = price / 10;
		System.out.println("부가세 : " + vat);
		
		double change = money - price;
		System.out.print("거스름돈 : " + change);
		

	}

}


