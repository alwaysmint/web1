
public class Page96 {

	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4; // 둘 다 정수값이므로 1
		System.out.println(f);
		f = (double)5 / 4; // 5.0 / 4
		System.out.println(f);
		f = 5 / (double)4; // 5 / 4.0
		System.out.println(f);
		f = (double)5 / (double)4; // 5.0 / 4.0
		System.out.println(f);
		i = (int)1.3 + (int)1.8; // 1 + 1
		System.out.println(i);
		

	}

}
