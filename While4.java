/*
 * 1~100 ���� ��
 * 1�� �ڸ��� 3,6,9�� ������ ����ϼ���
 * 3,6,9,13, 16 ...
 */
public class While4 {

	public static void main(String[] args) {

/*	3,6,9�� Ư������
 * 		int i = 3;
		while (i < 100 ) {
			System.out.println(i);
			i = i +3;
		} */
	
		int i = 1;
		while (i <= 100 ) {
			int m = i % 10;
			if (m != 0 && m % 3 == 0) { // (m == 3 || m == 6 || m ==9)
			System.out.println(i);
			}
			i++;
		}
	}
}
