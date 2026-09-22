package Second_Sheet;
import java.util.Scanner;

public class F2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=1; i<=12; i++){
            System.out.printf("%d * %d = %d\n", N, i, N*i);
        }
    }
}