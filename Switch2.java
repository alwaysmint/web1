

public class Switch2 {

	public static void main(String[] args) {
		String month = "february";
		int monthNumber;
		switch(month) {
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		default:
			monthNumber = 0;
		}
		System.out.println(monthNumber);
	}

}
