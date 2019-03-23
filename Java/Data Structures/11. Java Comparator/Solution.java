//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer firstScore = ((Player) o1).score;
        Integer secondScore = ((Player) o2).score;
        if (firstScore == secondScore) {
            String firstPlayer = ((Player) o1).name;
            String secondPlayer = ((Player) o2).name;
            return firstPlayer.compareTo(secondPlayer);
        }
        return secondScore.compareTo(firstScore);
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}