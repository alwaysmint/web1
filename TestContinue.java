
public class TestContinue {

	public static void main(String[] args) {
/*		int i = 0;
		while (true) {
			i++;
			if ( i % 2 == 0 ) {
				continue; // 다음 단계로 간다.
			}
			System.out.println(i);	
		} */
	for (int j = 0; true ; j++) {
		if (j % 2 == 0) {
			continue;
		}
		System.out.println(j);
	}
	
	}
}
