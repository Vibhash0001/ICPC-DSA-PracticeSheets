import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double R = sc.nextDouble();

        System.out.printf("%.9f", (3.141592653 * R * R));
    }
}
