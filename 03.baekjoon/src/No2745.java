import java.util.Scanner;

public class No2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();

        int result = 0;
        int power = 1;

        for(int i = N.length() - 1; i >= 0; i--){
            char c = N.charAt(i);
            int n = 0;

            if('0' <= c && c <= '9'){
                n = c - '0';
            }
            else if('A' <= c && c <= 'Z'){
                n = c - 'A' + 10;
            }

            result += power * n;
            power *= B;
        }

        System.out.println(result);



    }
}
