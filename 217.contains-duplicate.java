/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> visited = new HashSet();

        for(int n : nums) {
            if(visited.contains(n)) return true;
            visited.add(n);
        }

        return false;
    }
}
// @lc code=end

