import java.util.Scanner;

public class Y {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        long temp = (A % 100) * (B % 100);
        temp = temp % 100;
        temp = temp * (C % 100);
        temp = temp % 100;
        temp = temp * (D  % 100);
        temp = temp % 100;
        //int ans = (int)temp;


        System.out.printf("%02d%n", temp);
    }
}
