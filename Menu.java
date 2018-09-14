package com.example.kom.kickermanager3000;

import android.os.Bundle;
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

    TableLayout tabLayChallenges = (TableLayout)findViewById(R.id.tableLayoutChalle);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Log.i("String", MockData.getChallenges()[2].state);
        this.setChallengesOverView();
    }

    private void setChallengesOverView (){

        Log.i("piephahn", "roy");
        Log.i("getChallenges.length", this.tabLayChallenges.toString());
        Log.i("tableLayout", Integer.toString(MockData.getChallenges().length));

        for(int i=0; i<MockData.getChallenges().length; i++){
            Log.i("Mockdata state", MockData.getChallenges()[i].state);

            TextView challengeText = new TextView(this);
            challengeText.setText(MockData.getChallenges()[i].mode);
            TableRow challengeRow = new TableRow(this);
            challengeRow.addView(challengeText);
            this.tabLayChallenges.setColumnStretchable(0,true);
            this.tabLayChallenges.addView(challengeRow);

        }
    }



}
