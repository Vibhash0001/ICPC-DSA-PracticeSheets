import java.util.Scanner;

public class U1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        if (N.contains(".")) {
            String[] parts = N.split("\\.");


        int zero = Integer.parseInt(parts[1]);
        if(zero == 0){
            System.out.println("int " + parts[0]);
        }else {
            System.out.println("float " + parts[0] + " 0." + parts[1]);
        }
        } else {
            System.out.println("int " + N);
        }
    }
}