
import java.util.*;

public class game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rock = 1, paper = 2, scissor = 3;
        System.out.println("Player 1: Choose rock, paper, or scissor");
        String player1 = sc.next().toLowerCase();
        System.out.println("Player 2: Choose rock, paper, or scissor");
        String player2 = sc.next().toLowerCase();

        if (player1.equals(player2)) {
            System.out.println("It's a tie!");
        } else {
            switch (player1) {
                case "rock":
                    if (player2.equals("scissor"))
                        System.out.println("Player 1 wins!");
                    else
                        System.out.println("Player 2 wins!");
                    break;
                case "paper":
                    if (player2.equals("rock"))
                        System.out.println("Player 1 wins!");
                    else
                        System.out.println("Player 2 wins!");
                    break;
                case "scissor":
                    if (player2.equals("paper"))
                        System.out.println("Player 1 wins!");
                    else
                        System.out.println("Player 2 wins!");
                    break;
                default:
                    System.out.println("Invalid input from one or both players. Please choose rock, paper, or scissor.");
            }
        }
    }
}

