public class DoWhileSample {
    public static void main (String[] args) {
        char c = 'a';

        do {        // 우선 'a'는 출력
            System.out.print(c);
            c = (char) (c + 1);
        } while (c <= 'z');
    }
}
