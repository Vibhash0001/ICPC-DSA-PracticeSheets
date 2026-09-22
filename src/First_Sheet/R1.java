import java.util.Scanner;

public class R1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int years = N/365;
        int temp = N%365;
        int months = temp/30;
        int days = temp%30;

        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");

    }
}