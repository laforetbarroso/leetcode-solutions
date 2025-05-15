/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> tokens = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(') {
                tokens.push(')');
                continue;
            }

            if(x == '{') {
                tokens.push('}');
                continue;
            }

            if(x == '[') {
                tokens.push(']');
                continue;
            }

            if(tokens.empty()) return false;

            char tokenToFind = tokens.peek();

            if (x != tokenToFind) {
                return false;
            }

            tokens.pop();

        }

        return tokens.empty();
    }
}
// @lc code=end

