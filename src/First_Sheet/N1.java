import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char X = sc.next().charAt(0);

        if(Character.isLowerCase(X)){
            System.out.println(Character.toUpperCase(X));
        } else{
            System.out.println(Character.toLowerCase(X));
        }
    }
}
