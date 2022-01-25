import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class rockPaperScissors {
    public static void main(String [] args){
        List<String> acceptedInputs = Arrays.asList("r", "p", "s", "R", "P", "S");
        boolean replay = true;
        while(replay){
        int turnNumber = 5;
        int score = 0;
        String [] rps = {"r", "p", "s"};
        while(turnNumber > 0){
        String computerTurn = rps[new Random().nextInt(rps.length)];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in r for rock, p for paper, or s for scissors");
        String playerTurn = scanner.nextLine();
        while(!acceptedInputs.contains(playerTurn)){
            System.out.println("Please type in a valid answer!");
            playerTurn = scanner.nextLine();
        }
        String playerTurnlc = playerTurn.toLowerCase();
        if(playerTurnlc.equals(computerTurn)){
            if(computerTurn.equals("r")){
                System.out.println("Computer played rock.");
            }else if (computerTurn.equals("p")){
                System.out.println("Computer played paper.");
            }else{
                System.out.println("Computer played scissors.");
            }
            System.out.println("It was a tie.");
        }else if(playerTurnlc.equals("p") && computerTurn.equals("s")){
            System.out.println("Computer played scissors.");
            System.out.println("Computer wins the turn!");
        }else if(playerTurnlc.equals("p") && computerTurn.equals("r")){
            System.out.println("Computer played rock.");
            System.out.println("You win this turn!");
            score ++;
        }else if(playerTurnlc.equals("r") && computerTurn.equals("p")){
            System.out.println("Computer played paper.");
            System.out.println("Computer wins the turn!");
        }else if (playerTurnlc.equals("r") && computerTurn.equals("s")){
            System.out.println("Computer played scissors.");
            System.out.println("You win this turn!");
            score ++;
        }else if (playerTurnlc.equals("s") && computerTurn.equals("p")){
            System.out.println("Computer played paper.");
            System.out.println("You win this turn!");
            score ++;
        }else{
            System.out.println("Computer played rock.");
            System.out.println("Computer wins the turn!");
        }
    
        turnNumber --;
        }
        
        System.out.println("Your score: " + score);
        System.out.println("Do you want to play again? If yes, type in y, else type in anything else to exit.");
        Scanner scanner2 = new Scanner(System.in);
        String replayChoice = scanner2.nextLine();
        if(replayChoice.equals("y") || replayChoice.equals("Y")){
            replay = true;
        }else{
            replay = false;
            scanner2.close();
        }
    }

    }
}
