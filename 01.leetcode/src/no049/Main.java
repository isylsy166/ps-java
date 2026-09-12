package src.no049;

import java.util.List;

public class Main {
      public static void main(String[] args) {
            String[] case1 = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
            String[] case2 = new String[]{""};
            String[] case3 = new String[]{"a"};

            Solution solution = new Solution();
            List<List<String>> s = solution.groupAnagrams(case1);
            System.out.println(s);
      }
}
