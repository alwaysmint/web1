import java.util.Scanner;

public class Page71new {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double width;
		double height;
		double area;
		double perimeter;
		
		width = scan.nextDouble();
		height = scan.nextDouble();
		area = width * height;
		perimeter = 2 * ( width + height );
		
		System.out.println("�簢���� ���� : " + area);
		System.out.println("�簢���� �ѷ� : " + perimeter);
	}

}
