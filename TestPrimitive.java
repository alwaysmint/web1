
public class TestPrimitive {

	public static void main(String[] args) {
		
	// byte n;
	// n = 100;

		int k = 100_000_000; // _���� ū �� ǥ��(�������ϰ�)
				
		int i = 10;
		double d = 5.75;
		char c = 'A'; //������
		boolean b = true; // ��
		boolean b2 = false; // ����
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(b2);
		System.out.println(k);
		
		// 81������ ����
		
		long lightSpeed;
		long distance;
		
		//lightSpeed = 300000L // ������ �ڿ� L�Է��ϸ� ��Ÿ������ �˷��ִ� �� 
		lightSpeed = 300000; // ���������� ���������� long type���� �ν�
		distance = lightSpeed * 365 * 24 * 60 * 60;
		System.out.println("1����: " + distance + "km");

	}

}
