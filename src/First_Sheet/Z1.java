import java.util.Scanner;

public class Z1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double left = b*Math.log(a);
        double right = d*Math.log(c);

        if(left>right){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
