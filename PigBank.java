import java.util.Scanner;

/*
 * 102p 6�� ������
 */
public class PigBank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("100�� ������ �Է��ϼ��� : ");
		int num100 = input.nextInt();
		System.out.println("500�� ������ �Է��ϼ��� : ");
		int num500 = input.nextInt();
		System.out.println("100�� ������ �Է��ϼ��� : ");
		int num10 = input.nextInt();
		System.out.println("50�� ������ �Է��ϼ��� : ");
		int num50 = input.nextInt();
		
		int sum = (num100 * 100) + (num500 * 500 ) + (num10 * 10) + (num50 * 50);
		
		System.out.println(sum);
	}

}
