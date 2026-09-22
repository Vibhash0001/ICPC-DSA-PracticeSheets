import java.util.Scanner;

public class Class_1_Code {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world");

        String s1 = "Vibhash";
        String s2 = "Hardaha";
        String s3 = "VIBHASH";

        System.out.println(s1);
        System.out.println(s2);

        String fullName = s1 + " " + s2;

        System.out.println(fullName);
        System.out.println(fullName.length());

        System.out.println(fullName.charAt(5));
        System.out.println(fullName.charAt(fullName.length()-1));

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase("VIBHAsh"));

        System.out.println("NEW");
        System.out.println(fullName.startsWith("Vibh"));
        System.out.println(fullName.endsWith("ha"));

        System.out.println(fullName.substring(3));
        System.out.println(fullName.substring(3, 7));

        System.out.println("New 2");
        s1 = s1.replace("Vibhash", "Vijay");
        System.out.println(s1);
        System.out.println(fullName);


        char upper = 'D';
        char lower = 'd';

        System.out.println((int) upper);
        System.out.println((int) lower);

        System.out.println(Character.isUpperCase(upper));
        System.out.println(Character.isUpperCase(lower));

        System.out.println(Character.toUpperCase(lower));
        System.out.println(Character.toLowerCase(upper));
    }
}
