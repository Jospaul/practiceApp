package com.example.android.cricketcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamARuns = 0;
    int teamAWicket = 0;
    int teamBRuns = 0;
    int teamBWicket = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scoreOneRunTeamA(View v) {
        teamARuns = teamARuns + 1;
        displayScoreTeamA(teamARuns);
    }

    public void scoreFourRunsTeamA(View v){
        teamARuns = teamARuns + 4;
        displayScoreTeamA(teamARuns);
    }

    public void scoreSixRunsTeamA(View v){
        teamARuns = teamARuns + 6;
        displayScoreTeamA(teamARuns);
    }

    public void wicketGoneTeamA(View v) {
        teamAWicket = teamAWicket + 1;
        displayWicketTeamA(teamAWicket);
        if(teamAWicket > 10){
            gameLostTeamA();
        }
    }
    public void displayWicketTeamA (int wicket){
        TextView wicketTextView = (TextView) findViewById(R.id.teamA_wicket);
        wicketTextView.setText(String.valueOf(wicket));
    }

    public void displayScoreTeamA (int score){
        TextView scoreTextView = (TextView) findViewById(R.id.teamA_score);
        scoreTextView.setText(String.valueOf(score));
    }

    public void gameLostTeamA () {
        Button runOneButton = (Button) findViewById(R.id.teamA_runOne);
        Button runFourButton = (Button) findViewById(R.id.teamA_runFour);
        Button runSixButton = (Button) findViewById(R.id.teamA_runSix);
        Button wicketButton = (Button) findViewById(R.id.teamA_wicketLost);
        TextView winBoardTextView = (TextView) findViewById(R.id.team_winBoard);
        runOneButton.setEnabled(false);
        runFourButton.setEnabled(false);
        runSixButton.setEnabled(false);
        wicketButton.setEnabled(false);
        runOneButton = (Button) findViewById(R.id.teamB_runOne);
        runFourButton = (Button) findViewById(R.id.teamB_runFour);
        runSixButton = (Button) findViewById(R.id.teamB_runSix);
        wicketButton = (Button) findViewById(R.id.teamB_wicketLost);
        runOneButton.setEnabled(false);
        runFourButton.setEnabled(false);
        runSixButton.setEnabled(false);
        wicketButton.setEnabled(false);
        winBoardTextView.setText("Team B Won!!!");
    }

    public void scoreOneRunTeamB(View v) {
        teamBRuns = teamBRuns + 1;
        displayScoreTeamB(teamBRuns);
    }

    public void scoreFourRunsTeamB(View v){
        teamBRuns = teamBRuns + 4;
        displayScoreTeamB(teamBRuns);
    }

    public void scoreSixRunsTeamB(View v){
        teamBRuns = teamBRuns + 6;
        displayScoreTeamB(teamBRuns);
    }

    public void wicketGoneTeamB(View v) {
        teamBWicket = teamBWicket + 1;
        displayWicketTeamB(teamBWicket);
        if(teamBWicket > 10){
            gameLostTeamB();
        }
    }
    public void displayWicketTeamB (int wicket){
        TextView wicketTextView = (TextView) findViewById(R.id.teamB_wicket);
        wicketTextView.setText(String.valueOf(wicket));
    }

    public void displayScoreTeamB (int score){
        TextView scoreTextView = (TextView) findViewById(R.id.teamB_score);
        scoreTextView.setText(String.valueOf(score));
    }

    public void gameLostTeamB () {
        Button runOneButton = (Button) findViewById(R.id.teamB_runOne);
        Button runFourButton = (Button) findViewById(R.id.teamB_runFour);
        Button runSixButton = (Button) findViewById(R.id.teamB_runSix);
        Button wicketButton = (Button) findViewById(R.id.teamB_wicketLost);
        TextView winBoardTextView = (TextView) findViewById(R.id.team_winBoard);
        runOneButton.setEnabled(false);
        runFourButton.setEnabled(false);
        runSixButton.setEnabled(false);
        wicketButton.setEnabled(false);
        runOneButton = (Button) findViewById(R.id.teamA_runOne);
        runFourButton = (Button) findViewById(R.id.teamA_runFour);
        runSixButton = (Button) findViewById(R.id.teamA_runSix);
        wicketButton = (Button) findViewById(R.id.teamA_wicketLost);
        runOneButton.setEnabled(false);
        runFourButton.setEnabled(false);
        runSixButton.setEnabled(false);
        wicketButton.setEnabled(false);
        winBoardTextView.setText("Team A Won!!!");
    }

    public void resetGame (View v) {
        Button runOneButton = (Button) findViewById(R.id.teamB_runOne);
        Button runFourButton = (Button) findViewById(R.id.teamB_runFour);
        Button runSixButton = (Button) findViewById(R.id.teamB_runSix);
        Button wicketButton = (Button) findViewById(R.id.teamB_wicketLost);
        TextView winBoardTextView = (TextView) findViewById(R.id.team_winBoard);
        teamARuns = 0;
        teamAWicket = 0;
        teamBRuns = 0;
        teamBWicket = 0;
        displayScoreTeamA(teamARuns);
        displayWicketTeamA(teamAWicket);
        displayScoreTeamB(teamBRuns);
        displayWicketTeamB(teamBWicket);
        runOneButton.setEnabled(true);
        runFourButton.setEnabled(true);
        runSixButton.setEnabled(true);
        wicketButton.setEnabled(true);
        runOneButton = (Button) findViewById(R.id.teamA_runOne);
        runFourButton = (Button) findViewById(R.id.teamA_runFour);
        runSixButton = (Button) findViewById(R.id.teamA_runSix);
        wicketButton = (Button) findViewById(R.id.teamA_wicketLost);
        runOneButton.setEnabled(true);
        runFourButton.setEnabled(true);
        runSixButton.setEnabled(true);
        wicketButton.setEnabled(true);
        winBoardTextView.setText("");

    }
}
