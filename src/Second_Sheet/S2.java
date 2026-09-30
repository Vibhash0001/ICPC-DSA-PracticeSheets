package Second_Sheet;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long sum = 0;
            long start = Math.min(A, B);
            long end = Math.max(A, B);

            for(long j = start+1; j < end; j++) {
                if(j % 2 != 0){
                    sum += j;
                }

            }

            System.out.println(sum);
        }
    }
}
