import java.util.Scanner;

class TestScanner {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int i = scanner.nextInt();
        System.out.println("입력하신 정수 : " + i);
    }
}