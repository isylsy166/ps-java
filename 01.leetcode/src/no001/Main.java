package src.no001;

import java.util.Arrays;

public class Main {
      public static void main(String[] args) {
            int[] case1 = new int[] {2,7, 11, 15};
            int[] case2 = new int[] {3, 2, 4};
            int[] case3 = new int[] {3, 3};

            Solution solution = new Solution();
            System.out.println(Arrays.toString(solution.twoSum(case1, 9)));
//            solution.twoSum(case2, 6);
//            solution.twoSum(case3, 6);

      }
}
