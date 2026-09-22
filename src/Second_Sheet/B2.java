package Second_Sheet;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int flag =0 ;

        for(int i=1; i<=N; i++){
            if(i%2==0){
                System.out.println(i);
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("-1");
        }
    }
}
