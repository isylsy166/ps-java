import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No42839 {

      static Set<Integer> numSet = new HashSet<>();

      public static void main(String[] args) {

            String numbers = "011";

            No42839 no = new No42839();
            int answer = no.solution(numbers);
            System.out.println(answer);
      }
      private int solution(String numbers) {

            int[] num = new int[numbers.length()];
            for(int i = 0; i < numbers.length(); i++) num[i] = numbers.charAt(i) - '0';

            int count = 0;

            boolean[] visited = new boolean[num.length];
            backtrack(num, visited, "");

            for(int i : numSet) if( isPrime(i)) count++;
            System.out.println(numSet);
            return count;
      }

      public void backtrack(int[] nums, boolean[] visited, String current) {

            if(!current.isEmpty()) numSet.add(Integer.parseInt(current));

            for (int i = 0; i < nums.length; i++) {
                  if (visited[i]) continue;
                  if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;

                  visited[i] = true;
                  String next;

                  if (current.isEmpty() && nums[i] == 0) {
                        next = "";
                  }
                  else {
                        next = current + nums[i];
                  }

                  backtrack(nums, visited, next);

                  visited[i] = false;
            }
      }

      private boolean isPrime(int n) {
            if (n <= 1) return false;      // 1 이하는 소수 아님
            if (n == 2) return true;       // 2는 소수
            if (n % 2 == 0) return false;  // 2 제외 짝수는 소수 아님

            for (int i = 3; i * i <= n; i += 2) { // 홀수만 검사, i*i <= n으로 상한 설정
                  if (n % i == 0) {
                        return false;
                  }
            }
            return true;
      }

}
