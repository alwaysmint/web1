import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요");
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		
		if (first > second) {
			if (first > third) {
				System.out.println(first);
			} else {
				System.out.println(third);
			} 
		} else {
			if(second > third) {
			System.out.println(second);
			} else {
			System.out.println(third);
			}
		}

//		if (a >= b && a >= c) {
//			System.out.println(a);
//		} else if (b >= a && b >= c)
//			System.out.prinln(b);
//	    } else {
//		    System.out.println(c);		
	}
}
