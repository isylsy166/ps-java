import java.util.Scanner;

public class No2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int move = 1; // 시작은 1번 (1층)
        int lastNum = 1; // curr층의 마지막 번호

        while(lastNum < N){
            lastNum += move * 6;
            move++;
        }

        System.out.println(move);
    }
}
