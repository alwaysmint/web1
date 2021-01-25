
public class TestPrimitive {

	public static void main(String[] args) {
		
	// byte n;
	// n = 100;

		int k = 100_000_000; // _으로 큰 수 표현(보기편하게)
				
		int i = 10;
		double d = 5.75;
		char c = 'A'; //문자형
		boolean b = true; // 참
		boolean b2 = false; // 거짓
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(b2);
		System.out.println(k);
		
		// 81페이지 문제
		
		long lightSpeed;
		long distance;
		
		//lightSpeed = 300000L // 정수형 뒤에 L입력하면 롱타입으로 알려주는 것 
		lightSpeed = 300000; // 정수형으로 기입했지만 long type으로 인식
		distance = lightSpeed * 365 * 24 * 60 * 60;
		System.out.println("1광년: " + distance + "km");

	}

}
