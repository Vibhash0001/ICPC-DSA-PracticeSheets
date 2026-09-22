import java.util.Scanner;

public class I1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();

        if(A >= B){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}