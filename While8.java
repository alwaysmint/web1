import java.util.Scanner;

/*
 * ����ڰ� ������ �ݺ��ؼ� �Է��մϴ�.
 * 0�� �Է��ϸ� �ݺ����� ����˴ϴ�.
 * �׵��� �Է¹��� ������ ������ ����غ�����.
 * 1
 * 2
 * 50
 * 0
 * ���� : �� 4�� ������ ���� 53�Դϴ�.
 * */
public class While8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		boolean loop = true;
		while (loop) {
			int input = scan.nextInt();
			sum += input;
			loop = input != 0;
			count++;
	}
		System.out.println("���� : " + count + "�� ������ ����"+ sum +"�Դϴ�.");
	}
}
