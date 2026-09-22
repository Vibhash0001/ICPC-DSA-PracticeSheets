import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(C<=A && C<=B){
            System.out.println(C);

            if(A<=B){
                System.out.println(A);
                System.out.println(B);
            }else if(B<=A){
                System.out.println(B);
                System.out.println(A);
            }
        } else if(B<=A && B<=C){
            System.out.println(B);
            if(A<=C){
                System.out.println(A);
                System.out.println(C);
            } else if(C<=A){
                System.out.println(C);
                System.out.println(A);
            }
        } else if(A<=B && A<=C){
            System.out.println(A);
            if(B<=C){
                System.out.println(B);
                System.out.println(C);
            } else if(C<=B){
                System.out.println(C);
                System.out.println(B);
            }
        }

        System.out.println("");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

    }
}