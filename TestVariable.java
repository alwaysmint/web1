public class TestVariable {
    public static void main(String[] arg){
         int x; // declare(선언 - datatype자료형과 x라는 이름)

         // initialize (초기화 - 최초의 대입연산. 꼭 필요!!!)
         x = 55; // = 대입연산자, 대입연산
         System.out.println(x);

         x = 77; //  새 x값 지정
         System.out.println(x);

         x = 77;
         x = 33; 
         System.out.println(x); // 33 출력

        x = 13 * 153;
         System.out.println(x);

         int y = 20; // x,y 중복되지 않게 선언 (선언과 초기화 동시에도 가능)
         System.out.println(y);
    }
}