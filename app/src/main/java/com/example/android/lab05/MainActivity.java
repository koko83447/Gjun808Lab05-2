package com.example.android.lab05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private CourtCounterFragment m_fragment_team_a;
    private CourtCounterFragment m_fragment_team_b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onStart(){
        super.onStart();
        m_fragment_team_a =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
        m_fragment_team_b =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);
        setFragmentTeamName();
    }

    private void setFragmentTeamName() {
        String team_a_name = getString(R.string.team_a_name);
        String team_b_name = getString(R.string.team_b_name);
        m_fragment_team_a.setTeamName(team_a_name);
        m_fragment_team_b.setTeamName(team_b_name);
        m_fragment_team_a.setTeamLogo(R.drawable.team_a_logo);
        m_fragment_team_b.setTeamLogo(R.drawable.team_b_logo);
    }

    public void resetScoreView(View view){
        m_fragment_team_a.resetScore();
        m_fragment_team_b.resetScore();
    }

}
