import java.util.Scanner;

/*
 * 사용자가 정수 하나를 입력합니다.
 * 입력한 정수 만큼 java를 출력해보세요
 * 입력 예 ) 5
 * 출력 예 ) JAVA JAVA JAVA JAVA JAVA
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
