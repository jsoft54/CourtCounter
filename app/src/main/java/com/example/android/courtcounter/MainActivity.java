package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int totalScoreTeamA =0;
    int totalScoreTeamB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
public void add3PointsTeamA(View v)
{
    totalScoreTeamA=totalScoreTeamA+3;
    displayForTeamA(totalScoreTeamA);
}
    public void add2PointsTeamA(View v)
    {
        totalScoreTeamA=totalScoreTeamA+2;
        displayForTeamA(totalScoreTeamA);
    }
    public void addFreeTeamA(View v)
    {
        totalScoreTeamA=totalScoreTeamA+1;
        displayForTeamA(totalScoreTeamA);
    }
    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void add3PointsTeamB(View v)
    {
        totalScoreTeamB=totalScoreTeamB+3;
        displayForTeamB(totalScoreTeamB);
    }
    public void add2PointsTeamB(View v)
    {
        totalScoreTeamB=totalScoreTeamB+2;
        displayForTeamB(totalScoreTeamB);
    }
    public void addFreeTeamB(View v)
    {
        totalScoreTeamB=totalScoreTeamB+1;
        displayForTeamB(totalScoreTeamB);
    }
    public void resetScore(View v)
    {
        totalScoreTeamA=0;
        totalScoreTeamB=0;
        displayForTeamA(totalScoreTeamA);
        displayForTeamB(totalScoreTeamB);
    }
    }

