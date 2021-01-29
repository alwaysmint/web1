import java.util.Scanner;

public class Page1333 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tall = input.nextInt();
		double mas = (tall - 100) * 0.9;
		double weight = input.nextDouble();
		double test = weight - mas;
		if (test == 0 ) {
			System.out.println("표준체중입니다.");
		} else if (test < 0) {
			System.out.println("저체중입니다.");
		} else
			System.out.println("과체중입니다.");
	}
}
