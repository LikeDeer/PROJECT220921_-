package Practice3_7;

public class ArrayAndLoop {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < 10; i++) {
            // 1 ~ 10까지 난수
            array[i] = (int) (Math.random()*10 + 1);
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println("\n평균은 " + (double) sum / array.length);
    }
}
