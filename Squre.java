/*
	사격형의 둘레와 넓이를 구하는 프로그램.
	int형 2개 각각 변수 가로, 세로 값을 가짐.
	--------------------------------------------
	사각형의 가로는 ??
	사각형의 세로는 ??
	사각형의 둘레는 ??
	사각형의 넓이는 ??
*/

public class Squre {
    public static void main(String[] args) {
        int width = 100;
        int height = 300;
        int sum = 2 * (width + height);
        int sum2 = width * height;

         System.out.println("사각형의 가로는? " + width);
         System.out.println("사각형의 세로는? " + height);
         System.out.println("사각형의 둘레는? " + sum);
         System.out.println("사각형의 둘레는? " + 2 * (width+height));
         System.out.println("사각형의 넓이는? " + sum2);
         System.out.println("사각형의 넓이는? " + width * height);

    }
}
