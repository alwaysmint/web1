public class PlusString {
    public static void main(String[] args) {
         System.out.println("ABC" + "DEF");
         System.out.println("1" + 1);
         System.out.println(1 + "1");
         System.out.println(1 + 1 + "1"); // 21 (순서대로 처리)
         System.out.println("1" + 1 + 1);  //111 (순서대로 처리)
         System.out.println("1" + (1 + 1)); //12 (괄호 먼저 처리)
         System.out.println("1" + 2 * 3); //16
    }
}