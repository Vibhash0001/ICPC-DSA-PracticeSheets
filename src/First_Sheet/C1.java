import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextInt();
        long Y = sc.nextInt();

        System.out.println(X + " + " + Y + " = " + (X+Y));
        System.out.println(X + " * " + Y + " = " + (long)(X*Y)); //5618905794
        System.out.println(X + " - " + Y + " = " + (X-Y));

    }
}