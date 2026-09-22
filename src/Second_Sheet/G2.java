package Second_Sheet;
import java.util.Scanner;

public class G2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            long fact = 1;
            for(int j=1; j<=N; j++){
                fact = fact*j;
            }
            System.out.println(fact);
        }
    }
}
