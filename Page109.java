import java.util.Scanner;
public class Page109 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� ������ ? ");
		int cup = input.nextInt();
		
		if(cup < 100) {
			System.out.println("small");
//		} else if (cup < 200 && cup >=100 ){ �� �������� 100�̸��� �ɷ���
		} else if (cup <200) {	
			System.out.println("medium");
		} else {
			System.out.println("large");
		}

	}

}
