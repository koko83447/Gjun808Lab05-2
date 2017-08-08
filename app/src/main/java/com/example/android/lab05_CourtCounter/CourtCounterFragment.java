package com.example.android.lab05_CourtCounter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourtCounterFragment extends Fragment implements View.OnClickListener{
    private TextView m_tv_team_name;
    private TextView m_tv_team_score;
    private Button m_btn_three_points;
    private Button m_btn_two_points;
    private Button m_btn_free_points;


    public CourtCounterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_court_counter, container, false);
    }
    @Override
    public void onStart(){
        super.onStart();

        m_tv_team_name = (TextView)getView().findViewById(R.id.tv_tema_name);
        m_tv_team_score = (TextView)getView().findViewById(R.id.tv_tema_score);
        m_btn_three_points = (Button)getView().findViewById(R.id.btn_three_points);
        m_btn_three_points.setOnClickListener(this);
        m_btn_two_points = (Button)getView().findViewById(R.id.btn_two_points);
        m_btn_two_points.setOnClickListener(this);
        m_btn_free_points = (Button)getView().findViewById(R.id.btn_free_points);
        m_btn_free_points.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int points = 0;
        switch (view.getId()){
            case R.id.btn_three_points:
                points = 3;
                break;
            case R.id.btn_two_points:
                points = 2;
                break;
            case R.id.btn_free_points:
                points = 1;
                break;
        }

        int score = Integer.parseInt(m_tv_team_score.getText().toString());
        m_tv_team_score.setText(String.valueOf(score + points));

    }
    public void resetScore(){
        m_tv_team_score.setText("0");
    }
    public void setTeamName(CharSequence teamName){
        m_tv_team_name.setText(teamName);
    }
}
