package Practice3_13;

public class LoopAndConditional {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int units = i % 10;
            int tens = i / 10;
            if (units % 3 == 0 && units != 0) {
                System.out.println(i + " 박수 짝");
            }
            else if (tens % 3 == 0 && tens != 0) {
                System.out.println(i + " 박수 짝");
            }
        }
    }
}
