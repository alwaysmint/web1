import java.util.Scanner;

/*
 * ����ڰ� n,m �� ���� ������ �Է��մϴ�.
 * n�� m�������� ���غ�����.
 * �Է� ) 2 7
 * ��� ) 128
 */
public class Whili9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int pow = 1 ; // 0�� �ָ� ��� 0�� ���´�
		int i = 0;
		while(i < m) {
			pow *= n;
			i++;
		}
		System.out.println(pow);
	}
}