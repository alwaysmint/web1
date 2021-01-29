
public class Testbreak {

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			System.out.println("Hello");
			i++;
			if(i == 5) {
			break;
			}
		}
		for  (;;) {
			System.out.println("go");
			break;
		}
	}

}
