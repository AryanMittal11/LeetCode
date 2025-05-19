class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();
                int ans = 0;
                switch (token) {
                    case "+": ans = first + second; break;
                    case "-": ans = first - second; break;
                    case "*": ans = first * second; break;
                    case "/": ans = first / second; break;
                }
                stack.push(ans);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}