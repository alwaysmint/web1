import java.util.Scanner;

/*
 * ����ڰ� ���� �ϳ��� �Է��մϴ�.
 * �Է��� ���� ��ŭ java�� ����غ�����
 * �Է� �� ) 5
 * ��� �� ) JAVA JAVA JAVA JAVA JAVA
 */
public class While5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int i = 1;
		while (i <= number) {
			System.out.println("JAVA");
			i++;
		}

	}

}
