
public class TestString {

	public static void main(String[] args) {
		String str1 = "ABCDE"; //참조형 : 다른 곳에 있는 걸 참조 (위치를 기억)
		String str2 = "ABC"; // 어딘가 ABC를 저장해두고 그 위치를 가리킴
		String str3 = "ABC";
		String str4 = new String("ABC"); // 새롭게 ABC를 저장, str4가 그 위치를 가리킴
		
		System.out.println(str4); //ABC
		System.out.println(str1); //ABCED
		System.out.println(str2); //ABC
		System.out.println(str2 == str3); // true
		System.out.println(str2 == str4); // false 가리키고 있는 대상(위치)가 다름

		System.out.println(str2.equals(str3));//true :  값이 갇다는 의미
		System.out.println(str2.equals(str4));//true : 값이 같다는 의미 
		
	}

}
