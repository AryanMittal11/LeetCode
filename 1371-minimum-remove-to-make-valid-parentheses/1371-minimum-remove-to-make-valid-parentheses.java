class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                stack.push(i);
            }
            if (ch == ')') {
                if (stack.isEmpty()) {
                    sb.setCharAt(i, '#');
                } else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), '#');
        }
        return sb.toString().replaceAll("#", "");
    }
}