import java.util.Scanner;

public class V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        char S = sc.next().charAt(0);
        double B = sc.nextDouble();

        if(S == '<'){
            if(A < B){
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if(S == '>'){
            if(A > B){
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if(S == '='){
            if(A == B){
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }
    }
}