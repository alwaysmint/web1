import java.util.Scanner;

public class Page97 {

	public static void main(String[] args) {
		boolean isCapital;
		int citizens;
		int riches;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Դϱ�? (����: 1 �����ƴ�: 0)");
		isCapital = (sc.nextInt() == 1) ? true : false; // ? ������ ���̸� true,�����̸� false
		System.out.print("�α�(���� : ��)");
		citizens = sc.nextInt();
		System.out.print("������ ��(����: ��)");
		riches = sc.nextInt();
		
		boolean isMetro = (isCapital && citizens >= 100) || (riches >= 50) ;
		
		System.out.println("��Ʈ�������� ���� : " + isMetro);
		

	}

}