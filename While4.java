/*
 * 1~100 정수 중
 * 1의 자리가 3,6,9인 정수만 출력하세요
 * 3,6,9,13, 16 ...
 */
public class While4 {

	public static void main(String[] args) {

/*	3,6,9를 특정못함
 * 		int i = 3;
		while (i < 100 ) {
			System.out.println(i);
			i = i +3;
		} */
	
		int i = 1;
		while (i <= 100 ) {
			int m = i % 10;
			if (m != 0 && m % 3 == 0) { // (m == 3 || m == 6 || m ==9)
			System.out.println(i);
			}
			i++;
		}
	}
}
