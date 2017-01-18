package example.com.codeclan.example.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 18/01/2017.
 */

public class GameActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(getClass().toString(), "onCreate method was called");
        rockButton = (Button)findViewById(R.id.rock_button_id);
        paperButton = (Button)findViewById(R.id.paper_button_id);
        scissorsButton = (Button)findViewById(R.id.scissors_button_id);

    }

    public void rockButtonPressed(View button) {
        result = (TextView)findViewById(R.id.result_id);
        String returnedString = Game.play("Rock");
        result.setText(returnedString);
    }

    public void paperButtonPressed(View button) {
        result = (TextView)findViewById(R.id.result_id);
        String returnedString = Game.play("Paper");
        result.setText(returnedString);
    }

    public void scissorsButtonPressed(View button) {
        result = (TextView)findViewById(R.id.result_id);
        String returnedString = Game.play("Scissors");
        result.setText(returnedString);
    }
}
