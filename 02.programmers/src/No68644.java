package src;

import java.util.*;

public class No68644 {
      public int[] solution(int[] numbers) {
            HashSet<Integer> set = new HashSet<>();
            int last = numbers.length;

            for(int i = 0; i < last - 1; i++) {
                  for(int j = i + 1; j < last; j++) {
                        System.out.println(numbers[i] + ":" + numbers[j]);
                        set.add(numbers[i] + numbers[j]);
                  }
                  System.out.println("---");
            }

            System.out.println(set);
            System.out.println(" ");

            int[] answer = set.stream()
                              .mapToInt(Integer::intValue)
                              .sorted()
                              .toArray();

            return answer;
      }
}
