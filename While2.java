/*
 * 20부터 0까지 출력해보세요
 * 20 19 18 ... 0
 * ---------------------
 * P115 표를 직접 그려보는 것이 좋다
 * 등호, 숫자 계속 바꿔가면서 만들어보기
 */
public class While2 {

	public static void main(String[] args) {
		int i = 20;
		while (i >= 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("end");
	}

}
