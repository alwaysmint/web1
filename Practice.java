import java.util.Scanner;

/*
 * 사용자에게 정수 하나를 입력받아
 * 1. 입력한 정수에서 1을 더한 값이 7의 배수이고, 50보다 작은 수이면 true
 * 2. 입력한 정수에서 1을 뺀 값이 20~30 사이의 수이면 true
 */
public class Practice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력하세요 : ");
		int x = input.nextInt();	
		
		x++;
		System.out.println((x % 7 == 0) && (x < 50));
		
		x = x - 2;
		
		System.out.println((20 < x) && (x < 30));
		
		
		
		

	}

}
