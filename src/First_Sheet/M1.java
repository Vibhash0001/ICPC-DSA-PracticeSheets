import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char X = sc.next().charAt(0);

        if(Character.isDigit(X)){
            System.out.println("IS DIGIT");
        } else if(Character.isUpperCase(X)){
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        } else if(Character.isLowerCase(X)){
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }

    }
}