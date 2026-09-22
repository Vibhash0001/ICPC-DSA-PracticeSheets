package Second_Sheet;
import java.util.Scanner;

public class M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int rem, flag = 0;

        for(int i=A; i<=B; i++){
            int temp = i;
            while(temp != 0){
                rem = temp%10;
                temp = temp/10;
                if((rem == 4) || (rem == 7)){
                    if(temp == 0){
                        flag = 1;
                        System.out.print(i + " ");
                    }
                }else
                {
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("-1");
        }
    }
}