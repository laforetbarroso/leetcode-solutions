/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start

import java.util.Set;

class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;

        Set<Integer> numsSet = new HashSet();

        for(int n : nums) {
            numsSet.add(n);
        }

        for(int n : numsSet) {
            if(n != 0 && !numsSet.contains(n - 1)) return n - 1;
            if (!numsSet.contains(n + 1)) return n + 1;
        }

        return range;
    }
}
// @lc code=end

