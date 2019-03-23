//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {//ToDo: Took 3+ Hour REDO
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<Integer>();
        TreeSet<Integer> unique = new TreeSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0, size = 0, first = 0;
        for (int i = 1; i <= n; i++) {
            int num = in.nextInt();
            deque.add(num);
            unique.add(num);
            if (deque.size() == m) {
                size = unique.size();
                if (max < size) {
                    max = size;
                }
                first = (Integer) deque.removeFirst();
                if (!deque.contains(first)) {
                    unique.remove(first);
                }
            }
        }
        System.out.println(max);
        in.close();
    }
}