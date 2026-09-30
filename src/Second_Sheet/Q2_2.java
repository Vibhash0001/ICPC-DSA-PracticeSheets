package Second_Sheet;

import java.util.Scanner;

public class Q2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int A = sc.nextInt();

//            if(A == 0){
//                System.out.println(0);
//                continue;
//            }


            do{
                int rem = A % 10;
                System.out.print(rem + " ");
                A /= 10;
            }while(A != 0);

//             {
//                int rem = A % 10;
//                System.out.print(rem + " ");
//                A /= 10;
//            }
            System.out.println();
        }

    }
}