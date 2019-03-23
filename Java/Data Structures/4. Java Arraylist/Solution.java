//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17


import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        ArrayList<Integer> arr[] = new ArrayList[x];
        for (int i = 0; i < x; i++) {
            int y = scan.nextInt();
            arr[i] = new ArrayList();
            for (int j = 0; j < y; j++) {
                arr[i].add(scan.nextInt());
            }
        }

        int output = scan.nextInt();
        int row = 0, col = 0;
        for (int i = 0; i < output; i++) {
            row = scan.nextInt() - 1;
            col = scan.nextInt() - 1;
            try {
                System.out.println(arr[row].get(col));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

    }
}
