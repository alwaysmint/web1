import java.util.Random;
import java.util.Scanner;

public class Page118 {
	public static void main(String[] args) {
		Random random = new Random();
		int answer = random.nextInt(101); //0���� 101���� ���ڸ� ������
		
		int guess;
		int tries = 0; // ���� �� ���� 0���� ����
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("������ ������ ���ÿ� : ");
			guess = scan.nextInt();
			tries++;
			
			if(guess > answer) {
				System.out.println("������ ������ �����ϴ�.");
			}
		    if(guess < answer) {
				System.out.println("������ ������ �����ϴ�.");
			 }
		} while (guess != answer);
		
		System.out.printf("�����մϴ�. �õ� Ƚ�� =%d \n", tries );
	} 
}
