package Second_Sheet;
import java.util.Scanner;

public class I2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int N = num;
        int rev = 0, rem = 0;

        for(int i=0; N!=0; i++){
            rem = N%10;
            N = N/10;
            rev = rev * 10 + rem;
        }

        if(num == rev){
            System.out.println(rev);
            System.out.println("YES");
        }else{
            System.out.println(rev);
            System.out.println("NO");
        }



//        for(int i=0, j=len-1; i<(len/2); i++, j--){
//            if(N.charAt(i) != N.charAt(j)){
//                for(int k=0; k<len; k++){
//                    int rev
//                }
//                System.out.println("NO");
//            }
//        }
    }
}
