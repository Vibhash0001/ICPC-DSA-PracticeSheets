package Second_Sheet;

import java.util.Scanner;

public class U2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = 0;

        for(int i=1; i<=N; i++){
            int temp = i, sum = 0, rem = 0;
            while(temp != 0){
                rem = temp % 10;
                sum = sum + rem;
                temp = temp/10;


            }

            if((sum >= A) && (sum <= B)){
                //System.out.println(sum); // check poinnts
                ans = ans + i;
            }
            //System.out.println(ans); // check points
        }

        System.out.println(ans);
    }
}