import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextInt();
        double B = sc.nextInt();

        double ans = A/B;

        System.out.println( "floor " + (int)A + " / " + (int)B + " = " + ((int)Math.floor(ans)));
        System.out.println( "ceil " + (int)A + " / " + (int)B + " = " + ((int)Math.ceil(ans)));
        System.out.println( "round " + (int)A + " / " + (int)B + " = " + (Math.round(ans)));
    }
}