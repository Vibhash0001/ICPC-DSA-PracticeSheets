import java.util.Scanner;

public class F1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();

        long sum = (N%10) + (M%10);

        System.out.println(sum);
    }
}
