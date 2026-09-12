package src.no001;

import java.util.HashMap;
import java.util.Map;

public class Solution {
      public int[] twoSum(int[] nums, int target) {

            int n = nums.length;
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < n; i++) {
                  int t = target - nums[i];
                  if(map.containsKey(t)) {
                        return new int[] {map.get(t), i};
                  }
                  map.put(nums[i], i);
            }

            System.out.println(map);

            return new int[] {};
      }
}
