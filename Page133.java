import java.util.Scanner; // 나 스스로 잘함

public class Page133 { // 2번 문제

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		switch (str.toLowerCase()) {
			case "a":	case "e":	case "i":	
			case "o":	case "u":			
			System.out.println("모음입니다");
			 break;
		    default:
		    System.out.println("자음입니다.");
		    break;
		}
	}
}