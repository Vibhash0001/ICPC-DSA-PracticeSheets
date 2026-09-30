package Second_Sheet;

import java.util.Scanner;

public class Y2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 0, b = 1;

        if(N == 1){
            System.out.println(a);
            return;
        }

        System.out.print(a + " " + b + " ");
        for(int i=0; i<N-2; i++){
            System.out.print(a+b + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}