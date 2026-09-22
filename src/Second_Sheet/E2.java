package Second_Sheet;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i = 0;
        int max = sc.nextInt();

        while(i<N-1){
            int B = sc.nextInt();
            if(B>max){
                max = B;
            }
            i++;
        }
        System.out.println(max);
    }
}