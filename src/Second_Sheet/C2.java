package Second_Sheet;
import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int even =0, odd=0, pos=0, neg=-0;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            if(arr[i] % 2 != 0){
                odd++;
            }
            if(arr[i] < 0){
                neg++;
            }
            if(arr[i] > 0){
                pos++;
            }
        }

        System.out.printf("Even: %d\n", even);
        System.out.printf("Odd: %d\n", odd);
        System.out.printf("Positive: %d\n", pos);
        System.out.printf("Negative: %d\n", neg);

    }
}