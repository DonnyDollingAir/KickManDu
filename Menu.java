package com.example.kom.kickermanager3000;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TableLayout;
import android.support.design.widget.TabLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.kom.kickermanager3000.MockData;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setChallengesOverView ();
        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        //Log.i("String", MockData.getChallenges()[2].state);
        //this.setChallengesOverView();
    }

    private void setChallengesOverView (){

        ConstraintLayout challengesArea = (ConstraintLayout)findViewById(R.id.layoutChallenges);
        TableLayout table = new TableLayout(this);
        challengesArea.addView(table);
        MockData.Challenge[] testData = MockData.getChallenges();

        for (MockData.Challenge challenge : testData) {
            if (challenge.state != null) {

                TextView challengeText = new TextView(this);
                challengeText.setText(challenge.state);
                challengeText.setTextColor(Color.WHITE);
                TableRow challengeRow = new TableRow(this);
                challengeRow.addView(challengeText);
                table.setColumnStretchable(0, true);
                table.addView(challengeRow);
            }
        }
    }



}
