import java.util.Scanner;

/*
 * ����ڰ� ������ �ʴ����� �ð��� �Է��մϴ�.
 * �Էµ� �ð��� �� : ��: �� ���·� ����غ�����
 * �Է¿�) 3666
 * ��¿�) 1�ð� 1�� 6��
 * -------------------
 * �ѱ۷� ����� �ڹٷ� �����
 */


public class Time {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("�ʴ���(����)�� �ð��� �Է��ϼ��� ");
	int number = scan.nextInt();
	
	int hour = number / 3600;
	int min = number % 3600 / 60;
	int sec = number % 60;
	
	System.out.println(hour +"�ð�" + min + "��" +  sec  + "��");
	System.out.printf("%d�ð� %d�� %d��\n", hour, min, sec);

	}

}
