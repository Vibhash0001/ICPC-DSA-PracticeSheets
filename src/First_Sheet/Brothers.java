import java.util.Scanner;

public class Brothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1first, p1last, p2first, p2last;

        System.out.println("Enter first and last name of first person: ");
        String f1 = sc.next();
        String s1 = sc.next();

        System.out.println("Enter first and last name of second person: ");
        String f2 = sc.next();
        String s2 = sc.next();

        if(s2.equalsIgnoreCase(s1)){
            System.out.println("ARE Brothers");
        }else {
            System.out.println("NOT");
        }
    }
}