import java.util.*;

public class Page115 {
	public static void main (String [] arg) {
		int n;
		int i = 1;
		System.out.println("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		while(i <= 9) {
			System.out.println(n + "*" + i + "=" + n*i);
			i++;
		}
	}
}
