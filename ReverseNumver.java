import java.util.Scanner;

/* ����ڰ� ������ 5�ڸ��� ������ �Է��մϴ�.
 * ����� ����غ�����.
 * ------------------
 * �Է¿�)12345
 * ��¿�)54321
 * 
 * ---------------
 * 5 �ڸ����� 1�� �ڸ� �� ���Ѵ�.�ٸ� ���� ����α�
 * ���� ���� ������ �ڸ����� ���찳�� �����, 4�ڸ��� �����
 * 4�ڸ� ���� 1�� �ڸ� �� ���Ѵ�. �Ʊ� ���� �� ���� ����
 */
public class ReverseNumver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 5�ڸ��� �Է��ϼ���");		
		int number = scan.nextInt();
		System.out.print(number % 10);
		number = number / 10 ;
		System.out.print(number % 10);
		number = number / 10 ;
		System.out.print(number % 10);
		number = number / 10 ;
		System.out.print(number % 10);
		number = number / 10 ;
		System.out.println(number % 10);
		number = number / 10 ;


	}
}
