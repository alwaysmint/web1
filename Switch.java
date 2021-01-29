
public class Switch {

	public static void main(String[] args) {
		switch(2) {
		case 1:
			System.out.println("1입니다.");
		case 2:
			System.out.println("2입니다.");
			
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		default:
			System.out.println("1 ~ 4가 아닙니다.");
		}

		switch("a") {
		case "a":
			System.out.println("a입니다.");
		case "b":
			System.out.println("b입니다.");
		default:
			System.out.println("a ~ b가 아닙니다.");
		}
		
	}

}
