package counting_sort;

import java.util.Arrays;

public class Main {
      public static void main(String[] args) {
            int[] arr = new int[] {5, 1, 3, 2, 5, 2, 6, 8, 2, 0, 4, 5, 1, 6, 8, 2, 7, 9, 2, 1, 5, 6, 10};

            int[] count = new int[11];
            for (int i : arr) {
                  count[i]++; // 이 숫자가 몇 번 나오는지 카운팅 됨
            }

            CountingSort countingSort = new CountingSort();
            int[] sort = countingSort.sorted(count, arr.length);

            System.out.println("등장횟수: " + Arrays.toString(count));
            System.out.println("정렬된 배열: " + Arrays.toString(sort));

            for (int i = 1; i < 11; i++) {
                  count[i] += count[i-1];
            }

            String s1 = "adslkfjkdjoendsadfescfaefsdfzzwfdgqasgrtgss";
            System.out.println("알파벳 소문자로 이루어진 문자열 중 가장 많이 나오는 알파벳을 출력");
            System.out.println("문자열: " + s1);

            int[] count2 = new int[26];
            for(int i = 0; i < s1.length(); i++) {
                  count2[s1.charAt(i) - 'a']++;
            }

            int maxCount = 0;
            char maxChar = ' ';

            for(int i = 0; i < 26; i++) {
                  if(count2[i] > maxCount) {
                        maxCount = count2[i];
                        maxChar = (char) ('a' + i);
                        System.out.println(maxCount + ":" + maxChar);
                  }
            }
            System.out.println("가장 많이 나오는 알파벳: " + maxChar + " (" + maxCount + "번)");
            System.out.println((int) 'a');
      }
}
