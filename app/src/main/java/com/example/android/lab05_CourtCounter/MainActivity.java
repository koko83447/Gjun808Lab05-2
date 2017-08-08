package com.example.android.lab05_CourtCounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CourtCounterFragment m_fragment_team_a;
    private CourtCounterFragment m_fragment_team_b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onSrart(){
        super.onStart();
        setFragmentTeamName();
    }

    private void setFragmentTeamName() {
        m_fragment_team_a =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
        m_fragment_team_b =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);
        m_fragment_team_a.setTeamName("黃蜂");
        m_fragment_team_b.setTeamName("火箭");
    }

//    public void displayForTeamA(int score){
//
//    }
//    public void displayForTeamB(int score){
//
//    }
//    public void add3ForTeamA(View view) {
//        scoreTeamA += 3;
//        displayForTeamA(scoreTeamA);
//    }
//    public void add2ForTeamA(View view) {
//        scoreTeamA += 2;
//        displayForTeamA(scoreTeamA);
//    }
//    public void add1ForTeamA(View view) {
//        scoreTeamA += 1;
//        displayForTeamA(scoreTeamA);
//    }
//    public void add3ForTeamB(View view) {
//        scoreTeamB += 3;
//        displayForTeamB(scoreTeamB);
//    }
//    public void add2ForTeamB(View view) {
//        scoreTeamB += 2;
//        displayForTeamB(scoreTeamB);
//    }
//    public void add1ForTeamB(View view) {
//        scoreTeamB += 1;
//        displayForTeamB(scoreTeamB);
//    }

//    public void addThreePoints(View view) {
//        LinearLayout linearLayout = (LinearLayout)view.getParent();
//        TextView tv_team_score = (TextView)linearLayout.findViewById(R.id.tv_tema_score);
//        int score = Integer.parseInt(tv_team_score.getText().toString());//取得TextView文字轉整數
//        tv_team_score.setText(String.valueOf(score + 3));//分數加3再轉文字
//    }
//
//    public void addTwoPoints(View view) {
//        LinearLayout linearLayout = (LinearLayout)view.getParent();
//        TextView tv_team_score = (TextView)linearLayout.findViewById(R.id.tv_tema_score);
//        int score = Integer.parseInt(tv_team_score.getText().toString());
//        tv_team_score.setText(String.valueOf(score + 2));
//    }
//
//    public void freeThrow(View view) {
//        LinearLayout linearLayout = (LinearLayout)view.getParent();
//        TextView tv_team_score = (TextView)linearLayout.findViewById(R.id.tv_tema_score);
//        int score = Integer.parseInt(tv_team_score.getText().toString());
//        tv_team_score.setText(String.valueOf(score + 1));
//    }

//    public void resetScoreView(View view) {
//        CourtCounterFragment fragment_team_a = (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
//        TextView tema_a_score = (TextView)fragment_team_a.getView().findViewById(R.id.tv_tema_score);
//        tema_a_score.setText("0");
//        CourtCounterFragment fragment_team_b = (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);
//        TextView tema_b_score = (TextView)fragment_team_b.getView().findViewById(R.id.tv_tema_score);
//        tema_b_score.setText("0");
//    }
    public void resetScoreView(View view){
        m_fragment_team_a =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
        m_fragment_team_b =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);
        m_fragment_team_a.resetScore();
        m_fragment_team_b.resetScore();
    }

}
