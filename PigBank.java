import java.util.Scanner;

/*
 * 102p 6번 저금통
 */
public class PigBank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("100원 개수를 입력하세요 : ");
		int num100 = input.nextInt();
		System.out.println("500원 개수를 입력하세요 : ");
		int num500 = input.nextInt();
		System.out.println("100원 개수를 입력하세요 : ");
		int num10 = input.nextInt();
		System.out.println("50원 개수를 입력하세요 : ");
		int num50 = input.nextInt();
		
		int sum = (num100 * 100) + (num500 * 500 ) + (num10 * 10) + (num50 * 50);
		
		System.out.println(sum);
	}

}
