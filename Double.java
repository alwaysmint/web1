
public class Double {

	public static void main(String[] args) {
//		float f = 333.555; ���� (double�� �ν�)
//		float f = 333.555F; // f���̸� float�̶�� �ǹ̷� �����ƴ�
		
		float f = 0.1F; //0.33333���� ����
		f = f + 0.1F;
		f = f + 0.1F;
		f = f + 0.1F;
		f = f + 0.1F;
		f = f + 0.1F;
		f = f + 0.1F;
		System.out.println(f==0.6F); //false (�ٻ簪�̹Ƿ�)
		
		
		double radius;
		double area;
		
		final double PI = 3.141592; // ����� ���� �빮��, ���ٷ� �ܾ��
//		PI = 5;  ����)������ ���̹Ƿ� ������ �� ����
		radius = 5;
		area = PI * radius * radius;
		System.out.println("���� ���� : " + area );

	}

}
