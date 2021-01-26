//증감연산자
public class Page89 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int nextx = ++x;
		int nexty = y++;
//	    ++x;
//		int nextx = x;
//		int nexty = y;
//		y++;
		
		System.out.println("x값 : " + x); //2
		System.out.println("y값 : " + y); //2
		System.out.println("nextx값 : " + nextx); //2
		System.out.println("nexty값 : " + nexty); //1
		
	}

}
