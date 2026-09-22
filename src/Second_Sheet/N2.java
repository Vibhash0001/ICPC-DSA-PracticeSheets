package Second_Sheet;
import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char S = sc.next().charAt(0);

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int A = sc.nextInt();
            for(int j=0; j<A; j++){
                System.out.print(S);
            }
            System.out.println();
        }
    }
}