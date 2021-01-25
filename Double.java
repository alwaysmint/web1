
public class Double {

	public static void main(String[] args) {
//		float f = 333.555; 오류 (double로 인식)
//		float f = 333.555F; // f붙이면 float이라는 의미로 오류아님
		
		float f = 0.1F; //0.33333같은 숫자
		f = f + 0.1F;
		f = f + 0.1F;
		f = f + 0.1F;
		f = f + 0.1F;
		f = f + 0.1F;
		f = f + 0.1F;
		System.out.println(f==0.6F); //false (근사값이므로)
		
		
		double radius;
		double area;
		
		final double PI = 3.141592; // 상수는 전부 대문자, 밑줄로 단어구분
//		PI = 5;  오류)정해진 값이므로 변경할 수 없다
		radius = 5;
		area = PI * radius * radius;
		System.out.println("원의 면적 : " + area );

	}

}
