/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numsSet = new HashSet();

        for(int n : nums) {
            numsSet.add(n);
        }

        int longestStreak = 0;

        for(int y : numsSet) {
            if(numsSet.contains(y - 1)) continue;

            int x = y + 1;

            while(numsSet.contains(x)) {
                x++;
            }

            longestStreak = Math.max(longestStreak, x - y);
        }
        
        return longestStreak;
    }
}
// @lc code=end

