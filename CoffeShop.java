/*
 * Ŀ�� ���� �ȳ� ���α׷�
 * ���̽�(+500 �߰����), ������
 * 1.�Ƹ޸�ī�� 2000�� / �� 2500 / ��ī 3000
 * ------------------------
 * �ֹ��Ͻ� ���̽� �Ƹ޸�ī��� 2500���Դϴ�.
 */
import java.util.Scanner;
public class CoffeShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ICE = 500;
		final int AMERICANO = 2000;
		final int LATTE = 2500;
		final int MOCHA = 3000;
		
		
		System.out.println("���̽�(+500 �߰����), ������");
		boolean isIce = (input.nextInt() == 1);
		System.out.println("1.�Ƹ޸�ī�� 2000 / 2.ī��� 2500 / 3.ī���ī 3000");
		int choice = input.nextInt();
		
		String coffee;
		int money = 0;
		
		if(choice == 1) {
			coffee = "�Ƹ޸�ī��";
			money += AMERICANO;
		} else if(choice ==2) {
			coffee = "ī���";
			money += LATTE;
		} else {
			coffee = "ī���ī";
			money += MOCHA;
		}
			System.out.println("�ֹ��Ͻ�"
					+ (isIce ? "���̽�" : "������")
					+ coffee +  "��"
					+ (isIce ? money + ICE : money)
					+ "�Դϴ�.");
			
		
		

	}

}
