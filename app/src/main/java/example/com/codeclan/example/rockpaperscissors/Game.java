package example.com.codeclan.example.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 18/01/2017.
 */

public class Game {

    public static String play(String choice) {
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
                return "Paper wraps Rock. You lose!";
            case "RockScissors":
                return "Rock blunts Scissors. You win!";
            case "ScissorsPaper":
                return "Scissors cut Paper. You win!";
            case "ScissorsRock":
                return "Rock blunts Scissors. You lose!";
            case "PaperScissors":
                return "Scissors cut Paper. You lose!";
            case "PaperRock":
                return "Paper wraps Rock. You win!";
        }
        return "input invalid";
    }
}
