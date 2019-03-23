//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        String regex = "\\w+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);//ToDo: Check working of Matcher
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll("\\b(?i)" + m.group() + "\\b(\\s+(\\b(?i)" + m.group() + "\\b))+", m.group());
            }
            // Prints the modified sentence.
                System.out.println(input);
        }
        in.close();
    }
}

