import java.util.Scanner;

public class Page97 {

	public static void main(String[] args) {
		boolean isCapital;
		int citizens;
		int riches;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수도입니까? (수도: 1 수도아님: 0)");
		isCapital = (sc.nextInt() == 1) ? true : false; // ? 왼쪽이 참이면 true,거짓이면 false
		System.out.print("인구(단위 : 만)");
		citizens = sc.nextInt();
		System.out.print("부자의 수(단위: 만)");
		riches = sc.nextInt();
		
		boolean isMetro = (isCapital && citizens >= 100) || (riches >= 50) ;
		
		System.out.println("메트로폴리스 여부 : " + isMetro);
		

	}

}
