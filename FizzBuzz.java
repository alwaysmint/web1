/*
 * 1~100���� ���� ���
 * 3�� ����� Fizz
 * 5�� ����� Buzz
 * 3�� ����̸鼭 5�� ����� ���� Fizz Buzz
 * 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11
 */
public class FizzBuzz {

	public static void main(String[] args) {
		
		int num = 1;
		while (num <=100) {
			
		 if(num % 15 == 0) {
			 System.out.println("Fizz Buzz");
		 } else if (num % 3 == 0) {
			 System.out.println("Fizz");
		 } else if  ( num % 5 == 0 ) 
			 System.out.println("Buzz");
		 else
			System.out.println(num);
			num++;  
		}
	
		 }
	}
