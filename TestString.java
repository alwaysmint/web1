
public class TestString {

	public static void main(String[] args) {
		String str1 = "ABCDE"; //������ : �ٸ� ���� �ִ� �� ���� (��ġ�� ���)
		String str2 = "ABC"; // ��� ABC�� �����صΰ� �� ��ġ�� ����Ŵ
		String str3 = "ABC";
		String str4 = new String("ABC"); // ���Ӱ� ABC�� ����, str4�� �� ��ġ�� ����Ŵ
		
		System.out.println(str4); //ABC
		System.out.println(str1); //ABCED
		System.out.println(str2); //ABC
		System.out.println(str2 == str3); // true
		System.out.println(str2 == str4); // false ����Ű�� �ִ� ���(��ġ)�� �ٸ�

		System.out.println(str2.equals(str3));//true :  ���� ���ٴ� �ǹ�
		System.out.println(str2.equals(str4));//true : ���� ���ٴ� �ǹ� 
		
	}

}
