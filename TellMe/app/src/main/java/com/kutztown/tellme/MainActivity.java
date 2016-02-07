package com.kutztown.tellme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    /**
     * This will be called when the Login Guest button is clicked.
     * will send it to the main activity.
     * @param view
     */
    public void sendMain(View view){
        Intent intent = new Intent(this, DisplayGuestMain.class);
        startActivity(intent);
    }

    /**
     * This will be called when Login button is clicked.
     * will send app to Login Activity.
     * @param view
     */
    public void sendLogin(View view){
        Intent intent1 = new Intent(this, sendLogin.class);
        startActivity(intent1);
    }

    /**
     * This will be called when Create Account button is clicked.
     * will send to a login Activity
     * @param view
     */
    public void sendCreateAccount(View view){
        Intent intent2 = new Intent(this, DisplayCreateAccount.class);
        startActivity(intent2);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
