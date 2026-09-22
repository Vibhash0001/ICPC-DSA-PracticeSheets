import java.util.Scanner;

public class J1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();

        if(A%B == 0 || B%A == 0){
            System.out.println("Multiples");
        } else {
            System.out.println("No Multiples");
        }
    }
}