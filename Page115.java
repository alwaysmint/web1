import java.util.*;

public class Page115 {
	public static void main (String [] arg) {
		int n;
		int i = 1;
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		while(i <= 9) {
			System.out.println(n + "*" + i + "=" + n*i);
			i++;
		}
	}
}
