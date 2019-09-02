package com.rbworks.dev.cquiz.com.rbwdcq;

/**
 * Created by Admin on 21/12/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.TextView;

//import com.delaroystudios.quiz.R;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //get rating bar object
        RatingBar bar = (RatingBar) findViewById(R.id.ratingBar1);
        bar.setNumStars(5);
        bar.setStepSize(0.5f);
        //get text view
        TextView t = (TextView) findViewById(R.id.textResult);
        //get score
        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        //display score

        bar.setRating(score);
        switch (score) {
            case 0:
                t.setText("You scored 0 %, keep learning");
                break;
            case 1:
                t.setText("You have 20 %, study better");
                break;
            case 2:
                t.setText("You have 40 %, keep learning");
                break;
            case 3:
                t.setText("You have 60 %,  good  attempt");
                break;
            case 4:
                t.setText("Congratulations You Have 80 % ");
                break;
            case 5:
                t.setText("Congratulations You Have 100 % ");
                break;

        }
    }
}

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.activity_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_about) {
            Intent settingsIntent = new Intent(this, QuizActivity.class);
            startActivity(settingsIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
*/