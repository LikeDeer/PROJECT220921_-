package Practice3_3;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.print("정수를 입력하시오>>");
        input = scanner.nextInt();

        for (; input > 0; input--) {
            for (int i = 0; i < input; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
