package Second_Sheet;
import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = 1;

        for(int i=1; i<=A && i<=B; i++){
            if(A%i == 0 && B%i == 0){
                if(i > ans){
                    ans = i;
                }
            }
        }

        System.out.println(ans);
    }
}
