import java.util.Scanner;
public class Page109 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("컵의 사이즈 ? ");
		int cup = input.nextInt();
		
		if(cup < 100) {
			System.out.println("small");
//		} else if (cup < 200 && cup >=100 ){ 위 조건으로 100미만은 걸러짐
		} else if (cup <200) {	
			System.out.println("medium");
		} else {
			System.out.println("large");
		}

	}

}
