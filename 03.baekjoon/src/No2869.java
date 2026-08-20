import java.util.Scanner;

public class No2869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 낮에 A미터 올라간다
        int B = sc.nextInt(); // 밤에 B미터 미끄러짐
        int V = sc.nextInt(); // 나무의 높이

        int curr = 0; // 현재 높이
        int day = 0;

        while(curr <= V){
            day++; // 하루 시작
            curr += A; // 올라감
            if(curr == V) break; //올라가서 도달하면 바로 종료
            curr -= B; // 내려감
        }
        System.out.println(day);

    }
}
