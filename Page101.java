import java.util.Scanner;

/* 101쪽 3번
 * 1피트 = 12인치
 * 1인치 = 2.54cm
 */
public class Page101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("키를 입력하시오 : ");
		double tall = input.nextDouble();
		
		double inch = tall / 2.54;
		int pt = (int) (inch / 12); // 괄호연산부터 하고 int 적용
		double pt2 = inch % 12 ;
		System.out.println(tall + "cm는 " + pt + "피트 " + pt2 + "인치입니다");
//		System.out.printf("%dcm는 %d피트 %d인치입니다. "
//                             ,tall, pt, inch % 12);
	}

}
