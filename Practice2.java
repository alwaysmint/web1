import java.util.Scanner;

/*
 * ����ڰ� ���� 3���� �Է��մϴ�.
 * 3���� ������ ������� �ԷµǾ��ٸ� true
 * 2������ ���� 1���� ������ 1ũ��, 3��° ���� 2��° ������ 1Ŭ ��
 * (1,2,3) true
 * (7,5,3) false
 */
public class Practice2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		System.out.println((y - x == 1) && (z - y == 1));

		boolean order = ((y - x == 1) && (z - y == 1));
		boolean reverse = ((x - 1)
		
	}

}
