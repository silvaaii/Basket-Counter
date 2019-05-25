package com.example.samsung.basketcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0, scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreTeamA(10);
    }
    public void displayScoreTeamA (int Score){
        TextView scoreA = (TextView)findViewById(R.id.score_teamA);
        scoreA.setText(String.valueOf(Score));
    }

    public void threePointsA (View view){
        scoreA = scoreA+3;
        displayScoreTeamA(scoreA);
    }
    public void twoPointsA (View view){
        scoreA = scoreA+2;
        displayScoreTeamA(scoreA);
    }
    public void freeThrowA (View view){
        scoreA = scoreA+1;
        displayScoreTeamA(scoreA);
    }

    public void displayScoreTeamB (int Score){
        TextView scoreB = (TextView)findViewById(R.id.score_teamB);
        scoreB.setText(String.valueOf(Score));
    }

    public void threePointsB (View view){
        scoreB = scoreB+3;
        displayScoreTeamB(scoreB);
    }
    public void twoPointsB (View view){
        scoreB = scoreB+2;
        displayScoreTeamB(scoreB);
    }
    public void freeThrowB (View view){
        scoreB = scoreB+1;
        displayScoreTeamB(scoreB);
    }
    public void reset (View view){
        scoreB = scoreA = 0;
        displayScoreTeamB(scoreB);
        displayScoreTeamA(scoreA);
    }

}
