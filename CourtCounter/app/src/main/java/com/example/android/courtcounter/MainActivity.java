package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int scoreA = 0;
    public int scoreB = 0;
    public void incA3(View v) {
        scoreA += 3;
        displayA(scoreA);
    }
    public void incA2(View v) {
        scoreA += 2;
        displayA(scoreA);
    }
    public void incA1(View v) {
        displayA(++scoreA);
    }
    public void displayA(int n) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_viewA);
        scoreTextView.setText(String.valueOf(n));
    }
    public void incB3(View v) {
        scoreB += 3;
        displayB(scoreB);
    }
    public void incB2(View v) {
        scoreB += 2;
        displayB(scoreB);
    }
    public void incB1(View v) {
        displayB(++scoreB);
    }
    public void displayB(int n) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_viewB);
        scoreTextView.setText(String.valueOf(n));
    }
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }
}
