package example.com.codeclan.example.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 18/01/2017.
 */

public class Game {

    int playerScore;
    int computerScore;

    public Game(){
        this.playerScore = 0;
        this.computerScore = 0;
    }

    public String play(String choice) {
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Rock");
        choices.add("Paper");
        choices.add("Scissors");

        Random rand = new Random();
        int randomIndex = rand.nextInt(2);

        String resultAI = choices.get(randomIndex);

        if (choice == resultAI){
            return "It's a draw. Play again.";
        }

        switch(choice + resultAI) {
            case "RockPaper":
                computerScore += 1;
                return "Paper wraps Rock. You lose!";
            case "RockScissors":
                playerScore += 1;
                return "Rock blunts Scissors. You win!";
            case "ScissorsPaper":
                playerScore += 1;
                return "Scissors cut Paper. You win!";
            case "ScissorsRock":
                computerScore += 1;
                return "Rock blunts Scissors. You lose!";
            case "PaperScissors":
                computerScore += 1;
                return "Scissors cut Paper. You lose!";
            case "PaperRock":
                playerScore += 1;
                return "Paper wraps Rock. You win! You "+ playerScore +", Computer "+ computerScore;
        }
        return "input invalid";
    }
}
