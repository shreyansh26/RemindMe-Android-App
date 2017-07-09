package com.example.shreyanshsingh.remindme;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Shreyansh Singh on 13-01-2017.
 */


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void Click(View view){

         Intent intent = new Intent(MainActivity.this, Reminders.class);
         startActivity(intent);

     }
}
