import java.util.Scanner;
import java.util.Stack;

public class No11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        Stack<Character> stack = new Stack<>();

        if (N == 0) {
            System.out.println(0);
            return;
        }

        while(N != 0){
            int remain = N % B;
            char c;

            if(remain < 10){
                c = (char)(remain + '0'); // 나머지, 정수를 문자형으로
            }
            else{
                c = (char)(remain - 10 + 'A');
            }

            stack.push(c);
            N = N / B;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());

    }
}
