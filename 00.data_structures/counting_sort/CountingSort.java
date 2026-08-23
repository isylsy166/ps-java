package counting_sort;

/**
* 정렬 알고리즘
* - 자료구조 알고리즘을 왜 배워야하는지 가장 잘 나타내는 알고리즘
* - `한정된 범위`를 갖는 값을 갖는 요소들을 정렬하고 싶을 때
* - O(n + k), k가 작다면 가장 빠른 알고리즘 O(n)
* - Quick Sort보다 빠름 -> 보편적인 경우 O(nlogn)
* */
public class CountingSort {

      public int[] sorted(int[] count, int length) {
            int[] result = new int[length];
            int idx = 0;

            for (int i = 0; i < count.length; i++) {   // i = 값 자체
                  for (int j = 0; j < count[i]; j++) {   // 그 값이 나온 횟수만큼
                        result[idx++] = i;
                  }
            }
            return result;
      }

}
