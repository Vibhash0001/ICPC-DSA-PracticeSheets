package Second_Sheet;
import java.util.Scanner;

public class H2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        for(int i=2; i<(X/2); i++){
            if(X%i == 0){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
