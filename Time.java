import java.util.Scanner;

/*
 * 사용자가 정수로 초단위의 시간을 입력합니다.
 * 입력된 시간을 시 : 분: 초 형태로 출력해보세요
 * 입력예) 3666
 * 출력예) 1시간 1분 6초
 * -------------------
 * 한글로 적어보고 자바로 만들기
 */


public class Time {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("초단위(정수)의 시간을 입력하세요 ");
	int number = scan.nextInt();
	
	int hour = number / 3600;
	int min = number % 3600 / 60;
	int sec = number % 60;
	
	System.out.println(hour +"시간" + min + "분" +  sec  + "초");
	System.out.printf("%d시간 %d분 %d초\n", hour, min, sec);

	}

}
