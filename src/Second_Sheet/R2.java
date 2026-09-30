package Second_Sheet;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        while((A>0) && (B>0)){

            long sum=0;
            long start = Math.min(A,B);
            long end = Math.max(A,B);

            for(long i=start; i<=end; i++){
                System.out.print(i + " ");
                sum += i;
            }

            System.out.println("sum =" + sum);

            A = sc.nextLong();
            B = sc.nextLong();
        }
    }
}