import java.util.Scanner;

/*
 * ����ڿ��� ���� �ϳ��� �Է¹޾�
 * 1. �Է��� �������� 1�� ���� ���� 7�� ����̰�, 50���� ���� ���̸� true
 * 2. �Է��� �������� 1�� �� ���� 20~30 ������ ���̸� true
 */
public class PracticeT {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int number = input.nextInt();
		int plus = number + 1;
		int minus = number - 1;
		
		System.out.println((plus % 7 == 0) && (plus < 50));
		
		System.out.println((20 <= minus) && (minus <= 30));
		
	}
}
		