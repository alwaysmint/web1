/*
 * ���� 3��
 * ���� ������
 * else if
 * 
 * ����ڿ��� ������ �Է¹޾Ƽ�
 * 90 �̻��̸� A
 * 80 �̻��̸� B
 * 70 �̻��̸� C
 * 60 �̻��̸� D
 * �̸��̸� F 
 */
import java.util.Scanner;
public class Page107 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score = input.nextInt();
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else
			System.out.println("F");
	}
}

