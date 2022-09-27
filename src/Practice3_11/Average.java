package Practice3_11;

public class Average {
    public static void main(String[] args) {
        int sum = 0;
        for (String n : args) {
            sum += Integer.parseInt(n);
        }
        System.out.println(sum / args.length);
    }
}
