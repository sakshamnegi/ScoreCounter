package com.example.android.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForBothTeams();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(getString(R.string.score_of_A_saved_instance),scoreA);
        outState.putInt(getString(R.string.score_of_B_saved_instance),scoreB);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreA=savedInstanceState.getInt(getString(R.string.score_of_A_saved_instance));
        scoreB=savedInstanceState.getInt(getString(R.string.score_of_B_saved_instance));
        displayForBothTeams();

    }


    /**
     * Display scores for both teams
     */
    public void displayForBothTeams(){
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *
     * Add three points for team A
     */
    public void addThreeForA(View view)
    {
        scoreA+=3;
        displayForTeamA(scoreA);

    }
    /**
     *
     * Add two points for team A
     */
    public void addTwoForA(View view)
    {
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    /**
     *
     * Free throw for team A
     */
    public void freeThrowForA(View view)
    {
        scoreA++;
        displayForTeamA(scoreA);
    }

    /**
     *
     * Add three points for team B
     */
    public void addThreeForB(View view)
    {
        scoreB+=3;
        displayForTeamB(scoreB);

    }
    /**
     *
     * Add two points for team B
     */
    public void addTwoForB(View view)
    {
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    /**
     *
     * Free throw for team A
     */
    public void freeThrowForB(View view)
    {
        scoreB++;
        displayForTeamB(scoreB);
    }

    /**
     *
     * Resets both team scores to 0
     */
    public void resetScores(View view)
    {
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
