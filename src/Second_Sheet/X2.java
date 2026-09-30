package Second_Sheet;

import java.util.Scanner;

public class X2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            int rem = 0, bin = 0, j = 0, k=0;
            long ans = 0;
            while(N != 0){
                rem = N%2;
                if(rem == 1){
                    ans = (long)Math.pow(2, k) + ans;
                    k++;
                }
                bin = bin * 10 + rem;
                j++;
                N /= 2;
            }
            System.out.println(ans);
        }
    }
}