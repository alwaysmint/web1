import java.util.Scanner;

/*
 * ����ڿ��� ����(����)�� �Է¹޽��ϴ�.
 * 60�� �̻��̸� �հ�
 * 60�� �̸��̸� ���հݰ� ������ ������ ���
 */
public class TestScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int number = input.nextInt();
		if (number >= 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ� " + (60 - number) +"�� �����մϴ�");
		}
		
	}

}
