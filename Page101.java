import java.util.Scanner;

/* 101�� 3��
 * 1��Ʈ = 12��ġ
 * 1��ġ = 2.54cm
 */
public class Page101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		double tall = input.nextDouble();
		
		double inch = tall / 2.54;
		int pt = (int) (inch / 12); // ��ȣ������� �ϰ� int ����
		double pt2 = inch % 12 ;
		System.out.println(tall + "cm�� " + pt + "��Ʈ " + pt2 + "��ġ�Դϴ�");
//		System.out.printf("%dcm�� %d��Ʈ %d��ġ�Դϴ�. "
//                             ,tall, pt, inch % 12);
	}

}
