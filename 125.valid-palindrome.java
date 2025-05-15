/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while(start <= end) {
            if(!Character.isAlphabetic(s.charAt(start)) && !Character.isDigit(s.charAt(start))) {
                start++;
                continue;
            }

            if(!Character.isAlphabetic(s.charAt(end)) && !Character.isDigit(s.charAt(end))) {
                end--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))) {
                start++;
                end--;
                continue;
            }
            
            return false;
        }

        return true;
        
    }
}
// @lc code=end

