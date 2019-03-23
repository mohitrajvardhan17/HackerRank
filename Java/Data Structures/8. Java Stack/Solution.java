//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

    import java.util.Scanner;
    import java.util.Stack;

    class Solution {
        public static void main(String[] argh) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String input = sc.next();
                Stack stack = new Stack();
                Boolean flag = true;
                //Complete the code
                for (int i = 0; i < input.length(); i++) {
                    String ch = input.charAt(i) + "";
                    if (ch.matches("[\\{\\[\\(]")) {
                        stack.push(ch);
                    } else if (ch.matches("[\\}\\]\\)]")) {
                        if (!stack.isEmpty()) {
                            String peek = stack.peek().toString();
                            if (peek.equals("[") && ch.equals("]")) {
                                stack.pop();
                            } else if (peek.equals("{") && ch.equals("}")) {
                                stack.pop();
                            } else if (peek.equals("(") && ch.equals(")")) {
                                stack.pop();
                            } else {
                                flag = false;
                            }

                        } else {
                            flag = false;
                        }
                    }
                }
                if (stack.isEmpty() && flag) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }
    }