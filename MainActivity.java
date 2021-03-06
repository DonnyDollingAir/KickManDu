package com.example.kom.kickermanager3000;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.TableRow;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private Button btnLogin;
    private Integer counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Mockdata length", Integer.toString(123));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        name = (EditText) findViewById(R.id.editText2);
        password = (EditText) findViewById(R.id.editText3);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateCredentials(name.getText().toString(), password.getText().toString());

            }
        });
    }

    private void validateCredentials (String userName, String userPassword){

        //Log.d(myObject.getClass().getName(userName));
        //Log.i("String", (userPassword));
        //Log.i("String", userName);

        TextView infoText;


        if (userName.equalsIgnoreCase("swen")){
            //Log.d("String", userName);
            Intent intent = new Intent(MainActivity.this, com.example.kom.kickermanager3000.Menu.class);
            startActivity(intent);
        }
        else{
            counter --;
            infoText = (TextView)findViewById(R.id.tvInfo);
            infoText.setText(getString(R.string.attemptstogo) + String.valueOf(counter));
            if (counter == 0){
                btnLogin.setEnabled(false);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
