/*
 * ����ڿ��� ���� �� ���� �Է� �޽��ϴ�.
 * ù ��° ���� �� ���� ������ ũ�� "ù ��° ���� Ů�ϴ�."
 * �ƴϸ� "�� ���� ���� ũ�ų� �����ϴ�."
 */

import java.util.Scanner;
 
public class TestIfElse2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� �� ���� �Է��ϼ���");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("ù ��° ���� Ů�ϴ�");
		} else {
			System.out.println("�� ��° ���� ũ�ų� �����ϴ�.");
		}
	}
}
/*	if (num1 > num2) {
	    System.out.println("ù ���� ���� Ů�ϴ�");
	} else if(num1 == num2) {
		System.out.println("�� ���� �����ϴ�");
	} else {
		System.out.println("�� ��° ���� Ů�ϴ�");
	}
	}
	} 
*/