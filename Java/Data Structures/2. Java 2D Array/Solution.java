//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17


import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int sum = 0, max = Integer.MIN_VALUE;
        for (int row = 1; row < (6 - 1); row++) {
            for (int col = 1; col < (6 - 1); col++) {
                sum = arr[row - 1][col - 1] + arr[row - 1][col] + arr[row - 1][col + 1] + arr[row][col] + arr[row + 1][col + 1] + arr[row + 1][col] + arr[row + 1][col - 1];
                max = Math.max(sum, max);
                System.out.println(sum+"=="+max);
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
