import java.util.Scanner;

/*
 * �ݺ��ؼ� ������� ���� �Է��� �޴µ�,
 * �Է��� ������ 100���� ũ�ٸ� �ݺ����� ����Ǵ� ���α׷�.
 */
public class While7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean go  = true;
		while (go) {
			go = !(scan.nextInt() >= 100); // scan.nextInt() < 100
		}
		System.out.println("end");
	}

}
