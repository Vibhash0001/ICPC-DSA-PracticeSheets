import java.util.Scanner;

public class X1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long l1 = sc.nextLong();
        long r1 = sc.nextLong();
        long l2 = sc.nextLong();
        long r2 = sc.nextLong();

//        if(r2<=l1 || r1 <= l2){
//            System.out.println("-1");
//        }else if(l2 >= l1){
//            System.out.print(l2 + " ");
//            if(r1<=r2){
//                System.out.println(r1);
//            }else {
//                System.out.println(r2);
//            }
//        }else if(l2 <= l1){
//            System.out.print(l2 + " ");
//            if(r1<=r2){
//                System.out.println(r1);
//            }else {
//                System.out.println(r2);
//            }
//        }
        long left = Math.max(l1, l2);
        long right = Math.min(r1, r2);

        if(left <= right){
            System.out.println(left + " " + right);
        } else {
            System.out.println("-1");
        }
    }
}
