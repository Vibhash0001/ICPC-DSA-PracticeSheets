import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int index = -1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                index = i;
                break;
            }
        }
        long A = Long.parseLong(s.substring(0, index));
        long B = Long.parseLong(s.substring(index+1, s.length()));

        if(s.charAt(index) == '+'){
            System.out.println(A+B);
        } else if(s.charAt(index) == '-'){
            System.out.println(A-B);
        } else if(s.charAt(index) == '*'){
            System.out.println(A*B);
        } else if(s.charAt(index) == '/'){
            System.out.println(A/B);
        }


    }
}
