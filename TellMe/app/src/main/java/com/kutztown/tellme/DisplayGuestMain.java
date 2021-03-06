package com.kutztown.tellme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DisplayGuestMain extends AppCompatActivity {

    /**
     * This will be called when the Tell Me button is clicked from the display
     * guest activity. It will send to a news feed activity.
     * @param view
     */
    public void sendGuestNewsFeed (View view){
        Intent intent = new Intent(this, sendGuestNewsFeed.class);
        startActivity(intent);
    }

    public void sendGuestFoodFeed (View view ) {
        Intent intent1 = new Intent(this, sendGuestFeedMe.class);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_guest_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
