import java.util.Scanner;
public class Page106 {

	public static void main(String[] args) {
		final int RATE = 5000;
		int pay;
		int hours;
		Scanner input = new Scanner(System.in);
		
		System.out.print("시간을 입력하시오 : ");
		hours = input.nextInt();
		
		if(hours > 8) // 괄호 생략 : 조건식이 1문장이면 가능
			          // 무조건 괄호하는 것이 좋다
			pay = RATE * 8 + (int) (1.5 * RATE * (hours - 8));
		 else
			pay = RATE * 8;
			System.out.printf("임금은 %d입니다.\n", pay);
				
	}

}
