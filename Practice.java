import java.util.Scanner;

/*
 * ����ڿ��� ���� �ϳ��� �Է¹޾�
 * 1. �Է��� �������� 1�� ���� ���� 7�� ����̰�, 50���� ���� ���̸� true
 * 2. �Է��� �������� 1�� �� ���� 20~30 ������ ���̸� true
 */
public class Practice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int x = input.nextInt();	
		
		x++;
		System.out.println((x % 7 == 0) && (x < 50));
		
		x = x - 2;
		
		System.out.println((20 < x) && (x < 30));
		
		
		
		

	}

}
