import java.util.Random;
import java.util.Scanner;

public class Page118 {
	public static void main(String[] args) {
		Random random = new Random();
		int answer = random.nextInt(101); //0부터 101개의 숫자를 만들어라
		
		int guess;
		int tries = 0; // 갯수 셀 떄는 0으로 설정
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("정답을 추측해 보시오 : ");
			guess = scan.nextInt();
			tries++;
			
			if(guess > answer) {
				System.out.println("제시한 정수가 높습니다.");
			}
		    if(guess < answer) {
				System.out.println("제시한 정수가 낮습니다.");
			 }
		} while (guess != answer);
		
		System.out.printf("축하합니다. 시도 횟수 =%d \n", tries );
	} 
}
