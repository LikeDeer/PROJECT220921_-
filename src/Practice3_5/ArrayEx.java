package Practice3_5;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        int array[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정수 10개를 입력하시오>>");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("3의 배수는 ");
        for (int i : array) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
