/*
 * ����ڿ��� ������ 2���� �Է¹޾�
 * ù ��° ������ �� ��° ������ ���� ��� �������� ����Ͻÿ�
 */

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է��Ͻÿ�");
		int first = scan.nextInt();
		System.out.println("�� ��° ���� �Է��Ͻÿ�");
		int second = scan.nextInt();
		
		
		System.out.println("ù ��° ������ �� ��° ���� ���� �� : " 
		                                 + first / second);
		System.out.println("ù ��° ������ �� ��° ���� ���� ������" 
				+ first % second);
	}

}
