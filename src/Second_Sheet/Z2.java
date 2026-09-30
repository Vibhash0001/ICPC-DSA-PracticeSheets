package Second_Sheet;

import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int S = sc.nextInt();
        int count = 0;

        if(S>K){
            return;
        }

        for(int i=S; i>=0; i--){
            for(int j = S-i; j >=0; j--){
                for(int k = S-i-j; k >=0; k--){
                    if(i+j+k == S) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}