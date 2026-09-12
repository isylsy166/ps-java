package src.no560;

import java.util.Arrays;

public class Solution {
      public int subarraySum(int[] nums, int k) {
            System.out.println(Arrays.toString(nums));

            int n = nums.length;
            int count = 0;

            for(int p2 = 0; p2 < n; p2++) {
                  int sum = nums[p2];
                  if(sum == k) count++;
                  int p1 = p2 + 1;
                  System.out.printf("[%d, %d] sum:%d \n", p2, p1, sum);
                  while(p1 < n) {
                        sum += nums[p1];
                        if(sum == k) count++;
                        System.out.printf("[%d, %d] sum:%d \n", p2, p1, sum);
                        p1++;
                  }
                  System.out.println(count);
            }

            return count;
      }
}
