package example.com.codeclan.example.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 18/01/2017.
 */
public class GameTest {

    @Test
    public void wrongInput() {
        assertEquals("input invalid", Game.play("blabla"));
    }

//    @Test
//    public void draw() {
//        assertEquals("It's a draw. Play again.", Game.play("Rock"));
//    }

}